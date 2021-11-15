package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PantallaPuntajes implements State {

	private static final String stateName="Pantalla de puntajes"; 
	
	private UserInterface miUI;
	
	private JPanel panel;
	
	private Font mainFont;
	
	// private SerializadorDatos misDatos;
	
	public PantallaPuntajes(UserInterface UI, Font h1) {
		miUI=UI;

		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		mainFont=h1;

		mainFont=mainFont.deriveFont(28f);
		
		JLabel lblNewLabel = new JLabel("Top Scores");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(mainFont);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 0, 580, 50);
		panel.add(lblNewLabel);
		
		mainFont=mainFont.deriveFont(20f);
		
		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion.setForeground(Color.WHITE);
		lblPosicion.setFont(mainFont);
		lblPosicion.setBounds(10, 51, 174, 50);
		panel.add(lblPosicion);
		
		JLabel lblJugador = new JLabel("Jugador");
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador.setForeground(Color.WHITE);
		lblJugador.setFont(mainFont);
		lblJugador.setBounds(174, 51, 243, 50);
		panel.add(lblJugador);
		
		JLabel lblPosicion_1_1 = new JLabel("Puntaje");
		lblPosicion_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_1_1.setForeground(Color.WHITE);
		lblPosicion_1_1.setFont(mainFont);
		lblPosicion_1_1.setBounds(389, 51, 201, 50);
		panel.add(lblPosicion_1_1);
		
		mainFont=mainFont.deriveFont(24f);
		
		JLabel lblPosicion_1 = new JLabel("#1");
		lblPosicion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_1.setForeground(Color.WHITE);
		lblPosicion_1.setFont(mainFont);
		lblPosicion_1.setBounds(13, 93, 144, 50);
		panel.add(lblPosicion_1);
		
		JLabel lblPosicion_2 = new JLabel("#2");
		lblPosicion_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_2.setForeground(Color.WHITE);
		lblPosicion_2.setFont(mainFont);
		lblPosicion_2.setBounds(13, 154, 144, 50);
		panel.add(lblPosicion_2);
		
		JLabel lblPosicion_3 = new JLabel("#3");
		lblPosicion_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_3.setForeground(Color.WHITE);
		lblPosicion_3.setFont(mainFont);
		lblPosicion_3.setBounds(13, 215, 144, 50);
		panel.add(lblPosicion_3);
		
		JLabel lblPosicion_4 = new JLabel("#4");
		lblPosicion_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_4.setForeground(Color.WHITE);
		lblPosicion_4.setFont(mainFont);
		lblPosicion_4.setBounds(10, 269, 144, 50);
		panel.add(lblPosicion_4);
		
		JLabel lblPosicion_5 = new JLabel("#5");
		lblPosicion_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_5.setForeground(Color.WHITE);
		lblPosicion_5.setFont(mainFont);
		lblPosicion_5.setBounds(10, 330, 144, 50);
		panel.add(lblPosicion_5);
		
		JLabel lblPosicion_6 = new JLabel("#6");
		lblPosicion_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_6.setForeground(Color.WHITE);
		lblPosicion_6.setFont(mainFont);
		lblPosicion_6.setBounds(10, 391, 144, 50);
		panel.add(lblPosicion_6);
		
		JLabel lblPosicion_7 = new JLabel("#7");
		lblPosicion_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicion_7.setForeground(Color.WHITE);
		lblPosicion_7.setFont(mainFont);
		lblPosicion_7.setBounds(10, 452, 144, 50);
		panel.add(lblPosicion_7);
		
		JLabel lblJugador_7 = new JLabel("_ _ _");
		lblJugador_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_7.setForeground(Color.WHITE);
		lblJugador_7.setFont(mainFont);
		lblJugador_7.setBounds(181, 459, 201, 50);
		panel.add(lblJugador_7);
		
		JLabel lblJugador_1 = new JLabel("_ _ _");
		lblJugador_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_1.setForeground(Color.WHITE);
		lblJugador_1.setFont(mainFont);
		lblJugador_1.setBounds(181, 93, 201, 50);
		panel.add(lblJugador_1);
		
		JLabel lblJugador_2 = new JLabel("_ _ _");
		lblJugador_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_2.setForeground(Color.WHITE);
		lblJugador_2.setFont(mainFont);
		lblJugador_2.setBounds(181, 154, 201, 50);
		panel.add(lblJugador_2);
		
		JLabel lblJugador_3 = new JLabel("_ _ _");
		lblJugador_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_3.setForeground(Color.WHITE);
		lblJugador_3.setFont(mainFont);
		lblJugador_3.setBounds(181, 215, 201, 50);
		panel.add(lblJugador_3);
		
		JLabel lblJugador_4 = new JLabel("_ _ _");
		lblJugador_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_4.setForeground(Color.WHITE);
		lblJugador_4.setFont(mainFont);
		lblJugador_4.setBounds(178, 269, 201, 50);
		panel.add(lblJugador_4);
		
		JLabel lblJugador_5 = new JLabel("_ _ _");
		lblJugador_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_5.setForeground(Color.WHITE);
		lblJugador_5.setFont(mainFont);
		lblJugador_5.setBounds(181, 337, 201, 50);
		panel.add(lblJugador_5);
		
		JLabel lblJugador_6 = new JLabel("_ _ _");
		lblJugador_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_6.setForeground(Color.WHITE);
		lblJugador_6.setFont(mainFont);
		lblJugador_6.setBounds(181, 398, 201, 50);
		panel.add(lblJugador_6);
		
		JLabel lblPuntos_7 = new JLabel("0");
		lblPuntos_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_7.setForeground(Color.WHITE);
		lblPuntos_7.setFont(mainFont);
		lblPuntos_7.setBounds(392, 459, 201, 50);
		panel.add(lblPuntos_7);
		
		JLabel lblPuntos_1 = new JLabel("0");
		lblPuntos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_1.setForeground(Color.WHITE);
		lblPuntos_1.setFont(mainFont);
		lblPuntos_1.setBounds(392, 93, 201, 50);
		panel.add(lblPuntos_1);
		
		JLabel lblPuntos_2 = new JLabel("0");
		lblPuntos_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_2.setForeground(Color.WHITE);
		lblPuntos_2.setFont(mainFont);
		lblPuntos_2.setBounds(392, 154, 201, 50);
		panel.add(lblPuntos_2);
		
		JLabel lblPuntos_3 = new JLabel("0");
		lblPuntos_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_3.setForeground(Color.WHITE);
		lblPuntos_3.setFont(mainFont);
		lblPuntos_3.setBounds(392, 215, 201, 50);
		panel.add(lblPuntos_3);
		
		JLabel lblPuntos_4 = new JLabel("0");
		lblPuntos_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_4.setForeground(Color.WHITE);
		lblPuntos_4.setFont(mainFont);
		lblPuntos_4.setBounds(392, 276, 201, 50);
		panel.add(lblPuntos_4);
		
		JLabel lblPuntos_5 = new JLabel("0");
		lblPuntos_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_5.setForeground(Color.WHITE);
		lblPuntos_5.setFont(mainFont);
		lblPuntos_5.setBounds(392, 337, 201, 50);
		panel.add(lblPuntos_5);
		
		JLabel lblPuntos_6 = new JLabel("0");
		lblPuntos_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos_6.setForeground(Color.WHITE);
		lblPuntos_6.setFont(mainFont);
		lblPuntos_6.setBounds(392, 398, 201, 50);
		panel.add(lblPuntos_6);
		
		mainFont=mainFont.deriveFont(12f);
		
		JLabel lblApreteEspacioPara = new JLabel("Aprete espacio para volver al menu principal");
		lblApreteEspacioPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblApreteEspacioPara.setForeground(Color.YELLOW);
		lblApreteEspacioPara.setFont(mainFont);
		lblApreteEspacioPara.setBounds(10, 497, 580, 50);
		panel.add(lblApreteEspacioPara);
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
		State estadoNuevo=new MenuPrincipal(miUI, 2, mainFont);
		miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}

	@Override
	public String getName() {
		return stateName;
	}

	@Override
	public void seApretoP(boolean pause) {
		// TODO Auto-generated method stub
		
	}

}
