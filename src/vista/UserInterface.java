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
	
	private static final InputStream INPUT_STREAM_FUENTE = UserInterface.class.getResourceAsStream("../recursos/fonts/Early GameBoy.ttf");
	
	private State miEstado;
	
	private JPanel contentPane;
	
	private CardLayout c1;
	
	private Font mainFont;
	
	private FabricaElementos fabrica;
	
	private HiloMusica musica;
	
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
		
		musica=new HiloMusica("src/vista/amogus.wav");
		
		musica.audioOn();
		
		try {
			mainFont = Font.createFont(Font.TRUETYPE_FONT, INPUT_STREAM_FUENTE);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		fabrica=new FabricaOverworld();
		
		miEstado=new MenuPrincipal(this, 0, mainFont);
		
		contentPane.add(miEstado.getPanel(), miEstado.getName());
		
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
					case KeyEvent.VK_P:{
						musica.audioPause();
						miEstado.seApretoP(musica.getPause());
						break;
					} 
				}
			}
		});
		
	}
	
	/**
	 * Cambia los Estados de la UI
	 * @param estado Estado a cambiarse
	 * @param name Nombre del CardLayout a cambiarse
	 */
	public void cambiarEstado(State estado, String name) {
		contentPane.add(estado.getPanel(), estado.getName());
		c1.show(contentPane, name);
		miEstado=estado;
	}
	
	/**
	 * Configura el tamaño de la pantalla
	 * @param x Ancho de la pantalla
	 * @param y Alto de la pantalla
	 */
	public void setSize(int x, int y) {
		setBounds(100,100, x, y);
	}
	
	/**
	 * Devuelve la fabrica que creara la skin seleccionada por el jugador o que es creada predeterminadamente
	 * @return fabrica La fabrica que se usara para crear el nivel
	 */
	public FabricaElementos getFabrica() {
		return fabrica;
	}
	
	/**
	 * Configura la fabrica que se usara para crear el nivel
	 * @param fabricaNueva Fabrica nueva seleccionada
	 */
	public void setFabrica(FabricaElementos fabricaNueva) {
		fabrica=fabricaNueva;
	}

}
