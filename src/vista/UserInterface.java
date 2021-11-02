package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import logica.fabricas.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;

public class UserInterface extends JFrame {
	
	private static final InputStream INPUT_STREAM_FUENTE = UserInterface.class.getResourceAsStream("fonts/Early GameBoy.ttf");
	
	State miEstado;
	
	private JPanel contentPane;
	
	private CardLayout c1;
	
	private Font mainFont;
	
	private FabricaElementos fabrica;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface frame = new UserInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		c1=new CardLayout(0,0);		
		contentPane.setLayout(c1);
		
		try {
			mainFont = Font.createFont(Font.TRUETYPE_FONT, INPUT_STREAM_FUENTE);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		fabrica=new FabricaOverworld();
		
		miEstado=new MenuPrincipal(this, 0, mainFont);
		
		State pantallaNivel=new PantallaNivel(this, mainFont, fabrica);
		
		State seleccionarSkin=new SeleccionarSkin(this, mainFont);
		
		State pantallaPuntajes=new PantallaPuntajes(this, mainFont);
		
		contentPane.add(miEstado.getPanel(), miEstado.getName());
		contentPane.add(pantallaNivel.getPanel(), pantallaNivel.getName());
		contentPane.add(seleccionarSkin.getPanel(), seleccionarSkin.getName());
		contentPane.add(pantallaPuntajes.getPanel(), pantallaPuntajes.getName());
		
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent teclaApretada) {
				switch (teclaApretada.getKeyCode()) {
					case KeyEvent.VK_W:{ 
						miEstado.seApretoArriba();
						break;
					}
					case KeyEvent.VK_S:{
						miEstado.seApretoAbajo();
						break;
					} 
					case KeyEvent.VK_A:{ 
						miEstado.seApretoIzquierda();
						break;
					}
					case KeyEvent.VK_D:{
						miEstado.seApretoDerecha();
						break;
					} 
					case KeyEvent.VK_ENTER:{
						miEstado.seApretoEnter();
						break;
					} 
					case KeyEvent.VK_SPACE:{
						miEstado.seApretoEspacio();
						break;
					} 
				}
			}
		});
		
	}
	
	public void cambiarEstado(State estado, String name) {
		contentPane.add(estado.getPanel(), estado.getName());
		c1.show(contentPane, name);
		miEstado=estado;
		System.out.println(name);
	}
	
	public void setSize(int x, int y) {
		setBounds(100,100, x, y);
	}
	
	public FabricaElementos getFabrica() {
		return fabrica;
	}
	
	public void setFabrica(FabricaElementos fabricaNueva) {
		fabrica=fabricaNueva;
	}

}
