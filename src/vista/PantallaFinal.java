package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import datos.JugadorDatos;
import datos.Serializador;

import javax.swing.JLabel;

public class PantallaFinal extends JPanel implements State {

	private static final String stateName="Pantalla final";
	
	private UserInterface miUI;
	
	private Slider<Character> letra1;
	
	private Slider<Character> letra2;
	
	private Slider<Character> letra3;
	
	private JLabel[] letras;

	private Slider<Slider<Character>> sliderGeneral;
	
	private Font mainFont;
	
	private int points;
	
	private JPanel panel;
	private JLabel lblGameOver;
	private JLabel lblLogroHacer;
	private JLabel lblpuntos;
	private JLabel lblIngreseSiglas;
	private JLabel lblApreteEnterPara;
	private JLabel lblLetra1;
	private JLabel lblLetra2;
	private JLabel lblLetra3;
	
	public PantallaFinal(UserInterface UI, Font h1, String text, int points) {

		miUI=UI;
		
		this.points=points;
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		mainFont=h1;
		
		mainFont=mainFont.deriveFont(32f);
		
		lblLetra1 = new JLabel("A");
		lblLetra1.setFont(mainFont);
		lblLetra1.setForeground(Color.YELLOW);
		lblLetra1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra1.setBounds(68, 354, 147, 104);
		panel.add(lblLetra1);
		
		lblLetra2 = new JLabel("A");
		lblLetra2.setFont(mainFont);
		lblLetra2.setForeground(Color.WHITE);
		lblLetra2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra2.setBounds(225, 354, 147, 104);
		panel.add(lblLetra2);
		
		lblLetra3 = new JLabel("A");
		lblLetra3.setFont(mainFont);
		lblLetra3.setForeground(Color.WHITE);
		lblLetra3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetra3.setBounds(372, 354, 147, 104);
		panel.add(lblLetra3);

		lblLogroHacer = new JLabel("Logro hacer:");
		lblLogroHacer.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogroHacer.setForeground(Color.WHITE);
		lblLogroHacer.setFont(mainFont);
		lblLogroHacer.setBounds(68, 166, 451, 104);
		panel.add(lblLogroHacer);
		
		lblpuntos = new JLabel(points+"");
		lblpuntos.setHorizontalAlignment(SwingConstants.CENTER);
		lblpuntos.setForeground(Color.WHITE);
		lblpuntos.setFont(mainFont);
		lblpuntos.setBounds(68, 239, 451, 104);
		panel.add(lblpuntos);
		
		mainFont=mainFont.deriveFont(48f);
		
		lblGameOver = new JLabel(text);
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setForeground(Color.RED);
		lblGameOver.setFont(mainFont);
		lblGameOver.setBounds(68, 58, 451, 104);
		panel.add(lblGameOver);
		
		mainFont=mainFont.deriveFont(12f);
		
		lblIngreseSiglas = new JLabel("Ingrese 3 siglas para guardar su puntaje");
		lblIngreseSiglas.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSiglas.setForeground(Color.WHITE);
		lblIngreseSiglas.setFont(mainFont);
		lblIngreseSiglas.setBounds(10, 422, 580, 82);
		panel.add(lblIngreseSiglas);
		
		mainFont=mainFont.deriveFont(14f);
		
		lblApreteEnterPara = new JLabel("Aprete enter para continuar");
		lblApreteEnterPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblApreteEnterPara.setForeground(Color.WHITE);
		lblApreteEnterPara.setFont(mainFont);
		lblApreteEnterPara.setBounds(10, 469, 580, 82);
		panel.add(lblApreteEnterPara);
		
		sliderGeneral=new Slider<Slider<Character>>(3);
		
		letra1=new Slider<Character>(26);
		letra2=new Slider<Character>(26);
		letra3=new Slider<Character>(26);
		
		sliderGeneral.setOptionAtN(letra1, 1);
		sliderGeneral.setOptionAtN(letra2, 2);
		sliderGeneral.setOptionAtN(letra3, 3);
		
		for(int i=1; i<=26; i++) letra1.setOptionAtN((char) (64+i), i);
		for(int i=1; i<=26; i++) letra2.setOptionAtN((char) (64+i), i);
		for(int i=1; i<=26; i++) letra3.setOptionAtN((char) (64+i), i);
		
		letras= new JLabel[3];
		
		letras[0]=lblLetra1;
		letras[1]=lblLetra2;
		letras[2]=lblLetra3;
	}

	public void seApretoDerecha() {
		letras[sliderGeneral.getSliderSelection()].setForeground(Color.WHITE);
		sliderGeneral.slideClockwise();
		letras[sliderGeneral.getSliderSelection()].setForeground(Color.YELLOW);
	}

	public void seApretoIzquierda() {
		letras[sliderGeneral.getSliderSelection()].setForeground(Color.WHITE);
		sliderGeneral.slideAnticlockwise();
		letras[sliderGeneral.getSliderSelection()].setForeground(Color.YELLOW);
	}

	@Override
	public void seApretoAbajo() {
		Slider<Character> selectedKey=sliderGeneral.getOptionSelected();
		selectedKey.slideClockwise();
		letras[sliderGeneral.getSliderSelection()].setText(selectedKey.getOptionSelected()+"");
	}

	@Override
	public void seApretoArriba() {
		Slider<Character> selectedKey=sliderGeneral.getOptionSelected();
		selectedKey.slideAnticlockwise();
		letras[sliderGeneral.getSliderSelection()].setText(selectedKey.getOptionSelected()+"");
	}

	@Override
	public void seApretoEnter() {
		State estadoNuevo=new MenuPrincipal(miUI, 0, mainFont);
		String playerName=letras[0].getText()+letras[1].getText()+letras[2].getText();
		miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
		Serializador serializer=new Serializador();
		serializer.guardarJugador(new JugadorDatos(playerName, points));;
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
	
	public String getName() {
		return stateName;
	}
}
