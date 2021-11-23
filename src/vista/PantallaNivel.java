package vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;
import javax.swing.border.LineBorder;

import logica.entidades.entGrafica.EntidadGrafica;
import logica.fabricas.FabricaElementos;
import logica.partida.Partida;

public class PantallaNivel extends JPanel implements State {

	private static final String stateName="Pantalla de nivel"; 
	private JLayeredPane panelMapa;
	private JLabel puntaje;
	private UserInterface miUI;
	
	private JPanel panel;
	
	private JLabel[] lblsVida;
	
	private FabricaElementos fabrica;
	
	private JLabel lblFrutaNumber;
	private JLabel lblBomba;
	private JLabel lblMapa;
	private JLabel lblFruta_1;
	
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

		this.fabrica=fabrica;
		
		mainFont=h1;
		
		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setFont(mainFont);
		lblPuntaje.setBounds(10, 597, 194, 49);
		panel.add(lblPuntaje);
		
		puntaje = new JLabel("0");
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
		
		lblFruta_1 = new JLabel();
		lblFruta_1.setForeground(Color.WHITE);
		lblFruta_1.setFont(mainFont);
		lblFruta_1.setBounds(387, 605, 32, 32);
		panel.add(lblFruta_1);
		
		lblFrutaNumber = new JLabel();
		lblFrutaNumber.setForeground(Color.WHITE);
		lblFrutaNumber.setFont(mainFont);
		lblFrutaNumber.setBounds(510, 597, 84, 49);
		panel.add(lblFrutaNumber);
		
		lblsVida[0]=lblVida;
		lblsVida[1]=lblVida_1;
		lblsVida[2]=lblVida_2;
		
		lblBomba = new JLabel("X0");
		lblBomba.setForeground(Color.WHITE);
		lblBomba.setBounds(526, 300, 92, 49);
		lblBomba.setFont(mainFont);
		panel.add(lblBomba);
		
		JLabel lblB = new JLabel(reEscalar(fabrica.getIconoBomba(), 32, 32));
		lblB.setForeground(Color.WHITE);
		lblB.setFont(null);
		lblB.setBounds(530, 274, 32, 32);
		panel.add(lblB);
		
		miPartida=Partida.getInstance(this, fabrica);
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

	public void refrescarLabelsVida(int vidas) {
		for(int i=2; vidas<=i && vidas>=0; i--) {
			lblsVida[i].setForeground(Color.BLACK);
		}	
	}
	
	public void refrescarLabelsBomba(int bombas) {
		lblBomba.setText("X"+bombas);
	}
	
	public void imprimirMapa(Iterable<EntidadGrafica> it, String mapa, Iterable<String> frutas) {		
		if(lblMapa!=null) panelMapa.remove(lblMapa);
		
		lblMapa = new JLabel(reEscalar(mapa, 504, 576));
		

		lblMapa.setSize(504, 576);
		
		panelMapa.add(lblMapa, 0);
		panelMapa.setLayer(lblMapa, 0);
		
		for(EntidadGrafica e:it) { 
			panelMapa.add(e.getLbl(), e.getPriority());
			panelMapa.setLayer(e.getLbl(), e.getPriority());
		}
		
		lblFruta_1.setIcon(reEscalar(fabrica.getIconoFruit(), 32, 32));
		
		lblFrutaNumber.setText("x1");
	}
	
	public void removerBasura(Iterable<EntidadGrafica> it) {
		for(EntidadGrafica e:it) { 
			panelMapa.remove(e.getLbl());
		}
	}
	
	public JPanel getPanel() {
		return panel;		
	}
	
	public String getName() {
		return stateName;
	}
	
	public void eliminarLabel(JLabel label) {
		label.setVisible(false);
		panelMapa.remove(panelMapa.getIndexOf(label));
	}
	
	/**
	 * Método que configura el puntaje mostrado en pantalla
	 * @param puntuacion Puntos que se quieren mostrar
	 */
	public void setPuntacion(int puntuacion) {
		puntaje.setText(Integer.toString(puntuacion));
	}
	
	public void pantallaFinal(String text, int points) {
		State estadoNuevo=new PantallaFinal(miUI, mainFont, text, points);
		miUI.setSize(600, 600);
		miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
	}

	public void seAgregoEntidad(EntidadGrafica entidad) {
		panelMapa.add(entidad.getLbl(), entidad.getPriority());
		panelMapa.setLayer(entidad.getLbl(), entidad.getPriority());
	}
	
	public void seApretoP(boolean pause) {
		
	}
	
	private ImageIcon reEscalar(String dirImg, int x, int y) {
        ImageIcon img = new ImageIcon(dirImg);
        Image imgResized = img.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH);
        return new ImageIcon(imgResized);
    }
}
