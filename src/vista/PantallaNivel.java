package vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

import logica.fabricas.FabricaElementos;
import logica.partida.Partida;

public class PantallaNivel extends JPanel implements State {

	private static final String stateName="Pantalla de nivel"; 
	private JPanel panelMapa;
	private JLabel puntaje;
	private UserInterface miUI;
	
	private JPanel panel;
	private JLabel lblVida;
	private JLabel lblVida_1;
	private JLabel lblVida_2;
	private JLabel lblVida_3;
	private JLabel lblFruta;
	private JLabel lblFruta_1;
	private JLabel lblFruta_2;
	private JLabel lblFruta_3;
	private JLabel lblFruta_4;
	
	private Font mainFont;
	
	private Partida miPartida;
	
	public PantallaNivel(UserInterface UI, Font h1, FabricaElementos fabrica) {
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panelMapa = new JPanel();
		panelMapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMapa.setBounds(10, 10, 528, 672);
		panel.add(panelMapa);
		panelMapa.setLayout(null);
		
		miPartida=new Partida(this, fabrica);
		
		JLabel lblCuadrado = new JLabel("");
		lblCuadrado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCuadrado.setBounds(0, 0, 528, 672);
		panelMapa.add(lblCuadrado);
		
		ImageIcon foto = new ImageIcon(PantallaNivel.class.getResource("map.png"));
		lblCuadrado.setIcon(foto);
		
		mainFont=h1;
		
		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setFont(mainFont);
		lblPuntaje.setBounds(10, 693, 194, 49);
		panel.add(lblPuntaje);
		
		puntaje = new JLabel("000000");
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(mainFont);
		puntaje.setBounds(196, 693, 207, 49);
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
		
		lblVida_3 = new JLabel("<");
		lblVida_3.setForeground(Color.WHITE);
		lblVida_3.setBounds(548, 85, 46, 44);
		lblVida_3.setFont(mainFont);
		panel.add(lblVida_3);
		
		lblFruta = new JLabel("F");
		lblFruta.setForeground(Color.WHITE);
		lblFruta.setFont(mainFont);
		lblFruta.setBounds(413, 693, 17, 21);
		panel.add(lblFruta);
		
		lblFruta_1 = new JLabel("F");
		lblFruta_1.setForeground(Color.WHITE);
		lblFruta_1.setFont(mainFont);
		lblFruta_1.setBounds(440, 693, 17, 21);
		panel.add(lblFruta_1);
		
		lblFruta_2 = new JLabel("F");
		lblFruta_2.setForeground(Color.WHITE);
		lblFruta_2.setFont(mainFont);
		lblFruta_2.setBounds(467, 693, 17, 21);
		panel.add(lblFruta_2);
		
		lblFruta_3 = new JLabel("F");
		lblFruta_3.setForeground(Color.WHITE);
		lblFruta_3.setFont(mainFont);
		lblFruta_3.setBounds(494, 693, 17, 21);
		panel.add(lblFruta_3);
		
		lblFruta_4 = new JLabel("F");
		lblFruta_4.setForeground(Color.WHITE);
		lblFruta_4.setFont(mainFont);
		lblFruta_4.setBounds(521, 693, 17, 21);
		panel.add(lblFruta_4);
	}
	
	public void seApretoDerecha() {
		setPuntacion((int) Math.round(Math.random()*100));
	}

	@Override
	public void seApretoIzquierda() {
		setPuntacion((int) Math.round(Math.random()*100));
	}

	@Override
	public void seApretoAbajo() {
		setPuntacion((int) Math.round(Math.random()*100));
	}

	@Override
	public void seApretoArriba() {
		setPuntacion((int) Math.round(Math.random()*100));
	}

	@Override
	public void seApretoEnter() {
		setPuntacion((int) Math.round(Math.random()*100));
	}

	@Override
	public void seApretoEspacio() {
		setPuntacion((int) Math.round(Math.random()*100));
	}

	@Override
	public void refrescarLabels() {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel() {
		return panel;		
	}
	
	public String getName() {
		return stateName;
	}
	
	private void setPuntacion(int puntuacion) {
		puntaje.setText(Integer.toString(puntuacion));
	}
}
