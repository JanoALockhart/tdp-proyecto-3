package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class PantallaFinal extends JPanel implements State {

	private static final String stateName="Pantalla final";
	
	private UserInterface miUI;
	
	private Slider<Character> letra1;
	
	private Slider<Character> letra2;
	
	private Slider<Character> letra3;
	
	private JLabel lblLetra1;
	
	private JLabel lblLetra2;
	
	private JLabel lblLetra3;
	
	private JPanel panel;
	private JLabel lblGameOver;
	private JLabel lblLogroHacer;
	private JLabel lblpuntos;
	private JLabel lblIngreseSiglas;
	private JLabel lblApreteEnterPara;
	
	public PantallaFinal(UserInterface UI, Font h1, String text) {

		miUI=UI;
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		Font mainFont=h1;
		
		mainFont=mainFont.deriveFont(32f);
		
		lblLetra1 = new JLabel("A");
		lblLetra1.setFont(mainFont);
		lblLetra1.setForeground(Color.WHITE);
		lblLetra1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra1.setBounds(68, 354, 147, 104);
		panel.add(lblLetra1);
		
		lblLetra2 = new JLabel("A");
		lblLetra2.setFont(mainFont);
		lblLetra2.setForeground(Color.WHITE);
		lblLetra2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra2.setBounds(225, 354, 147, 104);
		panel.add(lblLetra2);
		
		lblLetra3 = new JLabel("A");
		lblLetra3.setFont(mainFont);
		lblLetra3.setForeground(Color.WHITE);
		lblLetra3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra3.setBounds(372, 354, 147, 104);
		panel.add(lblLetra3);

		lblLogroHacer = new JLabel("Logro hacer:");
		lblLogroHacer.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogroHacer.setForeground(Color.WHITE);
		lblLogroHacer.setFont(mainFont);
		lblLogroHacer.setBounds(68, 166, 451, 104);
		panel.add(lblLogroHacer);
		
		lblpuntos = new JLabel("[PUNTOS]");
		lblpuntos.setHorizontalAlignment(SwingConstants.CENTER);
		lblpuntos.setForeground(Color.WHITE);
		lblpuntos.setFont(mainFont);
		lblpuntos.setBounds(68, 239, 451, 104);
		panel.add(lblpuntos);
		
		mainFont=mainFont.deriveFont(48f);
		
		lblGameOver = new JLabel(text);
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setForeground(Color.RED);
		lblGameOver.setFont(mainFont);
		lblGameOver.setBounds(68, 58, 451, 104);
		panel.add(lblGameOver);
		
		mainFont=mainFont.deriveFont(12f);
		
		lblIngreseSiglas = new JLabel("Ingrese 3 siglas para guardar su puntaje");
		lblIngreseSiglas.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSiglas.setForeground(Color.WHITE);
		lblIngreseSiglas.setFont(mainFont);
		lblIngreseSiglas.setBounds(10, 422, 580, 82);
		panel.add(lblIngreseSiglas);
		
		mainFont=mainFont.deriveFont(14f);
		
		lblApreteEnterPara = new JLabel("Aprete enter para continuar");
		lblApreteEnterPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblApreteEnterPara.setForeground(Color.WHITE);
		lblApreteEnterPara.setFont(mainFont);
		lblApreteEnterPara.setBounds(10, 469, 580, 82);
		panel.add(lblApreteEnterPara);
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public PantallaFinal(UserInterface UI, Font h1) {
		this(UI,h1,"GAME OVER");
	}

	public void seApretoDerecha() {
		// TODO Auto-generated method stub
		
	}

	public void seApretoIzquierda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seApretoAbajo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seApretoArriba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seApretoEnter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seApretoEspacio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seApretoP(boolean pause) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}
	
	public String getName() {
		return stateName;
	}
}
