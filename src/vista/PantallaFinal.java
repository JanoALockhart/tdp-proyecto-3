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
	
	public PantallaFinal(UserInterface UI, Font h1) {
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		mainFont=h1.deriveFont(32f);
		
		lblLetra1 = new JLabel("_");
		lblLetra1.setFont(mainFont);
		lblLetra1.setForeground(Color.WHITE);
		lblLetra1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra1.setBounds(130, 120, 64, 64);
		panel.add(lblLetra1);
		
		lblLetra2 = new JLabel("_");
		lblLetra1.setFont(mainFont);
		lblLetra1.setForeground(Color.WHITE);
		lblLetra2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra2.setBounds(193, 120, 64, 64);
		panel.add(lblLetra2);
		
		lblLetra3 = new JLabel("_");
		lblLetra1.setFont(mainFont);
		lblLetra1.setForeground(Color.WHITE);
		lblLetra3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra3.setBounds(255, 120, 64, 64);
		panel.add(lblLetra3);
		
		
		miUI=UI;
		
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
}
