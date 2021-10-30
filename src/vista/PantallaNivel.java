package vista;

import javax.swing.JPanel;
import java.awt.Color;

public class PantallaNivel extends JPanel implements State {

	private static final String name="Pantalla de nivel"; 
	
	public UserInterface miUI;
	
	public JPanel panel;
	
	
	public PantallaNivel(UserInterface UI) {
		miUI=UI;
		panel=new JPanel();
		panel.setBackground(Color.GREEN);
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
		return name;
	}

}
