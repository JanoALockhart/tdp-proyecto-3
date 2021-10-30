package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MenuPrincipal extends JPanel implements State {
 
	private static final String stateName="Menu principal";
	
	private int optionSelected=0;
	
	private JLabel lblNewLabel;
	
	private JLabel lblNuevoJuego;
	
	private JLabel lblSkin;
	
	private JLabel lblScoreBoard;
	
	private JLabel[] optionList;
	
	private JPanel panel;
	
	private UserInterface miUI;
	
	
	public MenuPrincipal(UserInterface UI) {
		miUI=UI;
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		optionSelected=0;
		
		optionList=new JLabel[3];
		
		lblNewLabel = new JLabel("PAC-MAN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 580, 143);
		panel.add(lblNewLabel);
		
		lblNuevoJuego = new JLabel("Nuevo juego");
		lblNuevoJuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoJuego.setForeground(Color.YELLOW);
		lblNuevoJuego.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNuevoJuego.setBounds(10, 273, 580, 43);
		panel.add(lblNuevoJuego);
		
		lblSkin = new JLabel("Seleccionar skin");
		lblSkin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkin.setForeground(Color.WHITE);
		lblSkin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSkin.setBounds(10, 327, 580, 43);
		panel.add(lblSkin);
		
		lblScoreBoard = new JLabel("Top puntajes");
		lblScoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreBoard.setForeground(Color.WHITE);
		lblScoreBoard.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblScoreBoard.setBounds(10, 379, 580, 43);
		panel.add(lblScoreBoard);
		
		optionList[0]=lblNuevoJuego;
		optionList[1]=lblSkin;
		optionList[2]=lblScoreBoard;
	}

	@Override
	public void seApretoDerecha() {

	}

	@Override
	public void seApretoIzquierda() {
		
	}

	@Override
	public void seApretoArriba() {
		optionList[Math.abs(optionSelected)].setForeground(Color.WHITE);
		optionList[Math.abs(optionSelected)].setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(optionList[Math.abs(optionSelected)]);
		optionSelected--;
		optionSelected=optionSelected==-1?optionList.length-1:optionSelected%optionList.length;
		JLabel seleccionada=optionList[Math.abs(optionSelected)];
		seleccionada.setForeground(Color.YELLOW);	
		seleccionada.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(seleccionada);	
	}

	@Override
	public void seApretoAbajo() {
		optionList[Math.abs(optionSelected)].setForeground(Color.WHITE);
		optionList[Math.abs(optionSelected)].setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(optionList[Math.abs(optionSelected)]);
		optionSelected++;
		optionSelected=optionSelected%optionList.length;
		JLabel seleccionada=optionList[Math.abs(optionSelected)];
		seleccionada.setForeground(Color.YELLOW);
		seleccionada.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(seleccionada);
	}

	@Override
	public void seApretoEnter() {
		State estadoNuevo;
		switch(optionSelected) {
			case 0:{
				estadoNuevo=new PantallaNivel(miUI);
				miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
				break;
			}
			case 1:{
				
				break;
			}
			case 2:{
				
				break;
			}
			
		}
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
