package vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

import logica.entidades.EntidadGrafica;
import logica.fabricas.FabricaElementos;
import logica.partida.Partida;

public class PantallaNivel extends JPanel implements State {

	private static final String stateName="Pantalla de nivel"; 
	private JLayeredPane panelMapa;
	private JLabel puntaje;
	private UserInterface miUI;
	
	private JPanel panel;
	
	private JLabel[] lblsVida;
	
	private JLabel lblFruta;
	private JLabel lblFruta_1;
	private JLabel lblFruta_2;
	private JLabel lblFruta_3;
	private JLabel lblFruta_4;
	
	private Font mainFont;
	
	private Partida miPartida;
	
	public PantallaNivel(UserInterface UI, Font h1, FabricaElementos fabrica) {		
		JLabel lblVida;
		JLabel lblVida_1;
		JLabel lblVida_2;
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		
		panelMapa = new JLayeredPane();
		panelMapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMapa.setBounds(10, 10, 504, 576);
		
		panel.add(panelMapa);
		panelMapa.setLayout(null);
		
		lblsVida=new JLabel[3];
		
		mainFont=h1;
		
		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setFont(mainFont);
		lblPuntaje.setBounds(10, 597, 194, 49);
		panel.add(lblPuntaje);
		
		puntaje = new JLabel("000000");
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(mainFont);
		puntaje.setBounds(196, 597, 207, 49);
		panel.add(puntaje);
		miUI=UI;
		panel.setLayout(null);
		
		lblVida = new JLabel("<");
		lblVida.setForeground(Color.WHITE);
		lblVida.setBounds(548, 10, 46, 39);
		lblVida.setFont(mainFont);
		panel.add(lblVida);
		
		lblVida_1 = new JLabel("<");
		lblVida_1.setForeground(Color.WHITE);
		lblVida_1.setBounds(548, 35, 46, 39);
		lblVida_1.setFont(mainFont);
		panel.add(lblVida_1);
		
		lblVida_2 = new JLabel("<");
		lblVida_2.setForeground(Color.WHITE);
		lblVida_2.setBounds(548, 60, 46, 39);
		lblVida_2.setFont(mainFont);
		panel.add(lblVida_2);
		
		lblFruta = new JLabel("F");
		lblFruta.setForeground(Color.WHITE);
		lblFruta.setFont(mainFont);
		lblFruta.setBounds(413, 597, 17, 21);
		panel.add(lblFruta);
		
		lblFruta_1 = new JLabel("F");
		lblFruta_1.setForeground(Color.WHITE);
		lblFruta_1.setFont(mainFont);
		lblFruta_1.setBounds(440, 597, 17, 21);
		panel.add(lblFruta_1);
		
		lblFruta_2 = new JLabel("F");
		lblFruta_2.setForeground(Color.WHITE);
		lblFruta_2.setFont(mainFont);
		lblFruta_2.setBounds(467, 597, 17, 21);
		panel.add(lblFruta_2);
		
		lblFruta_3 = new JLabel("F");
		lblFruta_3.setForeground(Color.WHITE);
		lblFruta_3.setFont(mainFont);
		lblFruta_3.setBounds(494, 597, 17, 21);
		panel.add(lblFruta_3);
		
		lblFruta_4 = new JLabel("F");
		lblFruta_4.setForeground(Color.WHITE);
		lblFruta_4.setFont(mainFont);
		lblFruta_4.setBounds(521, 597, 17, 21);
		panel.add(lblFruta_4);
		
		lblsVida[0]=lblVida;
		lblsVida[1]=lblVida_1;
		lblsVida[2]=lblVida_2;
		
		miPartida=Partida.getInstance();
		Partida.setUI(this);
		Partida.setFabrica(fabrica);
	}
	
	public void seApretoDerecha() {
		miPartida.seApretoDerecha();
	}

	@Override
	public void seApretoIzquierda() {
		miPartida.seApretoIzquierda();
	}

	@Override
	public void seApretoAbajo() {
		miPartida.seApretoAbajo();
	}

	@Override
	public void seApretoArriba() {
		miPartida.seApretoArriba();
	}

	@Override
	public void seApretoEnter() {
		miPartida.seApretoEnter();
	}

	@Override
	public void seApretoEspacio() {
		miPartida.seApretoEspacio();
	}

	@Override
	public void refrescarLabels() {
		int vidas=miPartida.getVidas();
		for(int i=vidas;vidas<3;i--) {
			lblsVida[i-1].setForeground(Color.BLACK);
		}
	}
	
	public void imprimirMapa(Iterable<EntidadGrafica> it, String mapa) {		
		JLabel lblMapa = new JLabel(reEscalar(mapa));

		lblMapa.setSize(504, 576);
		
		panelMapa.add(lblMapa, 0);
		panelMapa.setLayer(lblMapa, 0);
		
		for(EntidadGrafica e:it) { 
			panelMapa.add(e.getLbl(), e.getPriority());
			panelMapa.setLayer(e.getLbl(), e.getPriority());
		}
	}
	
	public JPanel getPanel() {
		return panel;		
	}
	
	public String getName() {
		return stateName;
	}
	
	/**
	 * Método que configura el puntaje mostrado en pantalla
	 * @param puntuacion Puntos que se quieren mostrar
	 */
	private void setPuntacion(int puntuacion) {
		puntaje.setText(Integer.toString(puntuacion));
	}
	
	private ImageIcon reEscalar(String dirImg) {
        ImageIcon img = new ImageIcon(EntidadGrafica.class.getResource(dirImg));
        Image imgResized = img.getImage().getScaledInstance(504, 576, Image.SCALE_SMOOTH);
        return new ImageIcon(imgResized);
    }
}
