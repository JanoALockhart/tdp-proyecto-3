package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SeleccionarSkin extends JPanel implements State{
	
	private final static String stateName="Seleccionador de Skin";
	
	private UserInterface miUI;
	
	private JPanel panel;
	
	private JLabel lblFlechaIzquierda;
	
	private JLabel lblFlechaDerecha;
	
	private JLabel lblSkin;
	
	private JLabel lblOpcion;
	
	private Font mainFont;
	
	public SeleccionarSkin(UserInterface UI, Font h1) {
		panel=new JPanel();
		panel.setLayout(null);
		
		mainFont=h1;
		
		mainFont=mainFont.deriveFont(32f);
		
		lblFlechaIzquierda = new JLabel("<");
		lblFlechaIzquierda.setForeground(Color.WHITE);
		lblFlechaIzquierda.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlechaIzquierda.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 32));
		lblFlechaIzquierda.setBounds(10, 11, 293, 553);
		panel.add(lblFlechaIzquierda);
		
		lblFlechaDerecha = new JLabel(">");
		lblFlechaDerecha.setForeground(Color.WHITE);
		lblFlechaDerecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlechaDerecha.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 32));
		lblFlechaDerecha.setBounds(297, 11, 293, 553);
		panel.add(lblFlechaDerecha);
		
		lblSkin = new JLabel("Skin");
		lblSkin.setForeground(Color.WHITE);
		lblSkin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkin.setFont(mainFont);
		lblSkin.setBounds(10, 11, 580, 283);
		panel.add(lblSkin);
		
		lblOpcion = new JLabel("opcion");
		lblOpcion.setForeground(Color.WHITE);
		lblOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion.setFont(mainFont);
		lblOpcion.setBounds(10, 281, 580, 283);
		panel.add(lblOpcion);
		miUI=UI;		
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		JLabel lblImagen = new JLabel(" IMAGEN ");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setForeground(Color.WHITE);
		lblImagen.setFont(mainFont);
		lblImagen.setBounds(10, 11, 580, 553);
		panel.add(lblImagen);
	}
	
	@Override
	public void seApretoDerecha() {
		lblFlechaDerecha.setForeground(Color.YELLOW);
		lblFlechaIzquierda.setForeground(Color.WHITE);
	}

	@Override
	public void seApretoIzquierda() {
		lblFlechaIzquierda.setForeground(Color.YELLOW);
		lblFlechaDerecha.setForeground(Color.WHITE);
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
		System.out.println("amogus");
	}

	@Override
	public void seApretoEspacio() {
		State estadoNuevo=new MenuPrincipal(miUI ,1, mainFont);
		miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
	}

	@Override
	public void refrescarLabels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}
	
	public String getName() {
		return stateName;
	}
}
