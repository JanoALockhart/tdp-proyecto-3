package vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.SwingConstants;

import logica.entidades.EntidadGrafica;

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
	
	JLabel lblSound;
	
	private JLabel[] optionList;
	
	private JPanel panel;
	
	private UserInterface miUI;

	private Font mainFont;
	
	private Slider<JLabel> miSlider;
		
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
		
		lblSound = new JLabel(new ImageIcon(MenuPrincipal.class.getResource("../recursos/imagenes/soundON.png")));
		lblSound.setForeground(Color.WHITE);
		lblSound.setBounds(24, 24, 64, 64);
		panel.add(lblSound);
		
		optionList[0]=lblNuevoJuego;
		optionList[1]=lblSkin;
		optionList[2]=lblScoreBoard;
		
		miSlider=new Slider<JLabel>(3, option);
		
		miSlider.setOptionAtN(lblNuevoJuego, 1);
		miSlider.setOptionAtN(lblSkin, 2);
		miSlider.setOptionAtN(lblScoreBoard, 3);
		
		miSlider.getOptionSelected().setForeground(Color.YELLOW);
		
	}

	@Override
	public void seApretoDerecha() {

	}

	@Override
	public void seApretoIzquierda() {
		
	}

	@Override
	public void seApretoArriba() {
		miSlider.getOptionSelected().setForeground(Color.WHITE);
		miSlider.slideAnticlockwise();
		miSlider.getOptionSelected().setForeground(Color.YELLOW);	
	}

	@Override
	public void seApretoAbajo() {
		miSlider.getOptionSelected().setForeground(Color.WHITE);
		miSlider.slideClockwise();
		miSlider.getOptionSelected().setForeground(Color.YELLOW);
	}

	@Override
	public void seApretoEnter() {
		State estadoNuevo;
		switch(miSlider.getSliderSelection()) {
			case 0:{
				estadoNuevo=new PantallaNivel(miUI, mainFont, miUI.getFabrica());
				miUI.setSize(600, 700);
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

	@Override
	public void seApretoP(boolean pause) {
		String imgSource=pause?"../recursos/imagenes/soundOFF.png":"../recursos/imagenes/soundON.png";
		panel.remove(lblSound);
		lblSound = new JLabel(new ImageIcon(MenuPrincipal.class.getResource(imgSource)));
		lblSound.setBounds(24, 24, 64, 64);
		panel.add(lblSound);
		panel.repaint();
	}
}
