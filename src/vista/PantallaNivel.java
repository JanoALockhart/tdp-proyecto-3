package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PantallaNivel extends JPanel implements State {

	private static final String stateName="Pantalla de nivel"; 
	private JPanel panelMapa;
	private JLabel puntaje;
	public UserInterface miUI;
	
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
	

	
	public PantallaNivel(UserInterface UI, Font h1) {
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panelMapa = new JPanel();
		panelMapa.setBounds(10, 10, 528, 672);
		panel.add(panelMapa);
		
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

	@Override
	public void seApretoDerecha() {
		// TODO Auto-generated method stub
		
	}

	@Override
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
	public void refrescarLabels() {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel() {
		return panel;		
	}
	
	public String getName() {
		return stateName;
	}
}
