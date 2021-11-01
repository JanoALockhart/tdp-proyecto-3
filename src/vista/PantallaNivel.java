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
	
	public JPanel panel;
	
	
	public PantallaNivel(UserInterface UI) {
		panel=new JPanel();
		panelMapa = new JPanel();
		panelMapa.setBounds(10, 10, 528, 616);
		panel.add(panelMapa);
		
		JLabel lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPuntaje.setBounds(416, 10, 118, 21);
		panel.add(lblPuntaje);
		
		puntaje = new JLabel("000000");
		puntaje.setFont(new Font("Tahoma", Font.PLAIN, 24));
		puntaje.setBounds(416, 41, 98, 34);
		panel.add(puntaje);
		miUI=UI;
		panel.setLayout(null);
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
