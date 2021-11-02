package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;

public class MenuPrincipal extends JPanel implements State {
 
	private static final String stateName="Menu principal";
	
	private int optionSelected;
	
	private JLabel lblNewLabel;
	
	private JLabel lblNuevoJuego;
	
	private JLabel lblSkin;
	
	private JLabel lblScoreBoard;
	
	private JLabel[] optionList;
	
	private JPanel panel;
	
	private UserInterface miUI;

	private Font mainFont;
		
	public MenuPrincipal(UserInterface UI, int option, Font h1) {
		
		miUI=UI;
		
		mainFont=h1;
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		optionSelected=option;
		
		optionList=new JLabel[3];
		
		mainFont=mainFont.deriveFont(32f);
		
		lblNewLabel = new JLabel("PAC-MAN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(mainFont);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 580, 143);
		panel.add(lblNewLabel);
		
		mainFont=mainFont.deriveFont(24f);
		
		lblNuevoJuego = new JLabel("Nuevo juego");
		lblNuevoJuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoJuego.setForeground(Color.WHITE);
		lblNuevoJuego.setFont(mainFont);
		lblNuevoJuego.setBounds(10, 273, 580, 43);
		panel.add(lblNuevoJuego);
		
		lblSkin = new JLabel("Seleccionar skin");
		lblSkin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkin.setForeground(Color.WHITE);
		lblSkin.setFont(mainFont);
		lblSkin.setBounds(10, 327, 580, 43);
		panel.add(lblSkin);
		
		lblScoreBoard = new JLabel("Top puntajes");
		lblScoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreBoard.setForeground(Color.WHITE);
		lblScoreBoard.setFont(mainFont);
		lblScoreBoard.setBounds(10, 379, 580, 43);
		panel.add(lblScoreBoard);
		
		optionList[0]=lblNuevoJuego;
		optionList[1]=lblSkin;
		optionList[2]=lblScoreBoard;
		
		optionList[optionSelected].setForeground(Color.YELLOW);
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
		optionList[Math.abs(optionSelected)].setFont(mainFont);
		panel.add(optionList[Math.abs(optionSelected)]);
		optionSelected--;
		optionSelected=optionSelected==-1?optionList.length-1:optionSelected%optionList.length;
		JLabel seleccionada=optionList[Math.abs(optionSelected)];
		seleccionada.setForeground(Color.YELLOW);	
		panel.add(seleccionada);	
	}

	@Override
	public void seApretoAbajo() {
		optionList[Math.abs(optionSelected)].setForeground(Color.WHITE);
		optionList[Math.abs(optionSelected)].setFont(mainFont);
		panel.add(optionList[Math.abs(optionSelected)]);
		optionSelected++;
		optionSelected=optionSelected%optionList.length;
		JLabel seleccionada=optionList[Math.abs(optionSelected)];
		seleccionada.setForeground(Color.YELLOW);
		panel.add(seleccionada);
	}

	@Override
	public void seApretoEnter() {
		State estadoNuevo;
		switch(optionSelected) {
			case 0:{
				estadoNuevo=new PantallaNivel(miUI, mainFont, miUI.getFabrica());
				miUI.setSize(600, 800);
				miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
				break;
			}
			case 1:{
				estadoNuevo=new SeleccionarSkin(miUI, mainFont);
				miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
				break;
			}
			case 2:{
				estadoNuevo=new PantallaPuntajes(miUI, mainFont);
				miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());				
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
