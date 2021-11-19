package vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.*;
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
	
	private JLabel[] lblsFruta;
	
	private JLabel lblFrutaNumber;
	private JLabel lblBomba;
	private JLabel lblMapa;
	
	private Font mainFont;
	
	private Partida miPartida;
	
	public PantallaNivel(UserInterface UI, Font h1, FabricaElementos fabrica) {	
		
		JLabel lblVida;
		JLabel lblVida_1;
		JLabel lblVida_2;
		
		JLabel lblFruta_1;
		JLabel lblFruta_2;
		JLabel lblFruta_3;
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		
		panelMapa = new JLayeredPane();
		panelMapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMapa.setBounds(10, 10, 504, 576);
		
		panel.add(panelMapa);
		panelMapa.setLayout(null);
		
		lblsVida=new JLabel[3];
		
		lblsFruta=new JLabel[3];
		
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
		
		lblFruta_2 = new JLabel();
		lblFruta_2.setForeground(Color.WHITE);
		lblFruta_2.setFont(mainFont);
		lblFruta_2.setBounds(429, 605, 32, 32);
		panel.add(lblFruta_2);
		
		lblFruta_3 = new JLabel();
		lblFruta_3.setForeground(Color.WHITE);
		lblFruta_3.setFont(mainFont);
		lblFruta_3.setBounds(471, 605, 32, 32);
		panel.add(lblFruta_3);
		
		lblFrutaNumber = new JLabel();
		lblFrutaNumber.setForeground(Color.WHITE);
		lblFrutaNumber.setFont(mainFont);
		lblFrutaNumber.setBounds(510, 597, 84, 49);
		panel.add(lblFrutaNumber);
		
		lblsVida[0]=lblVida;
		lblsVida[1]=lblVida_1;
		lblsVida[2]=lblVida_2;
		
		lblsFruta[0]=lblFruta_1;
		lblsFruta[1]=lblFruta_2;
		lblsFruta[2]=lblFruta_3;
		
		lblBomba = new JLabel("X0");
		lblBomba.setForeground(Color.WHITE);
		lblBomba.setBounds(526, 300, 92, 49);
		lblBomba.setFont(mainFont);
		panel.add(lblBomba);
		
		JLabel lblB = new JLabel(reEscalar("../../recursos/imagenes/gunpowder.png", 32, 32));
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
		for(int i=vidas;0<=i && i<3;i--) {
			lblsVida[i].setForeground(Color.BLACK);
		}	
	}
	
	public void refrescarLabelsBomba(int bombas) {
		if(bombas==0) lblBomba.setForeground(Color.BLACK);
		
		lblBomba.setText("X"+bombas);
	}
	
	public void imprimirMapa(Iterable<EntidadGrafica> it, String mapa, Iterable<String> frutas) {		
		if(lblMapa!=null) panelMapa.remove(lblMapa);
		
		lblMapa = new JLabel(reEscalar(mapa, 504, 576));
		
		int contFruits=0;

		lblMapa.setSize(504, 576);
		
		panelMapa.add(lblMapa, 0);
		panelMapa.setLayer(lblMapa, 0);
		
		for(EntidadGrafica e:it) { 
			panelMapa.add(e.getLbl(), e.getPriority());
			panelMapa.setLayer(e.getLbl(), e.getPriority());
		}
		
		for(String fruit:frutas) {
			System.out.println(fruit);
			lblsFruta[contFruits].setIcon(reEscalar(fruit, 32, 32));
			contFruits++;
		}
		
		lblFrutaNumber.setText("x"+contFruits);
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
	
	private ImageIcon reEscalar(String dirImg, int x, int y) {
        ImageIcon img = new ImageIcon(EntidadGrafica.class.getResource(dirImg));
        Image imgResized = img.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH);
        return new ImageIcon(imgResized);
    }

	@Override
	public void seApretoP(boolean pause) {
	
	}
}
