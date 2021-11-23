package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import logica.fabricas.FabricaElementos;
import logica.fabricas.FabricaNether;
import logica.fabricas.FabricaOverworld;

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
	
	private JLabel lblImagen;
	
	private Font mainFont;
	
	private Icon[] icons;
	
	private Slider<String> miSlider;
	
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
		
		lblOpcion = new JLabel("Overworld");
		lblOpcion.setForeground(Color.WHITE);
		lblOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion.setFont(mainFont);
		lblOpcion.setBounds(10, 281, 580, 283);
		panel.add(lblOpcion);
		miUI=UI;		
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		lblImagen = new JLabel("");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setForeground(Color.WHITE);
		lblImagen.setFont(mainFont);
		lblImagen.setBounds(236, 11, 128, 553);
		panel.add(lblImagen);
		
		miSlider=new Slider<String>(2);
		
		miSlider.setOptionAtN("Overworld", 1);
		miSlider.setOptionAtN("Nether", 2);
		
		icons=new Icon[2];
		
		icons[0]=new ImageIcon(MenuPrincipal.class.getResource("../recursos/imagenes/skinOverworld/previewOverworld.png"));
		icons[1]=new ImageIcon(MenuPrincipal.class.getResource("../recursos/imagenes/skinNether/previewNether.png"));
		
		lblImagen.setIcon(icons[0]);
	}
	
	@Override
	public void seApretoDerecha() {
		lblFlechaDerecha.setForeground(Color.YELLOW);
		lblFlechaIzquierda.setForeground(Color.WHITE);
		miSlider.slideClockwise();
		lblOpcion.setText(miSlider.getOptionSelected());
		lblImagen.setIcon(icons[miSlider.getSliderSelection()]); 
	}

	@Override
	public void seApretoIzquierda() {
		lblFlechaIzquierda.setForeground(Color.YELLOW);
		lblFlechaDerecha.setForeground(Color.WHITE);
		miSlider.slideAnticlockwise();
		lblOpcion.setText(miSlider.getOptionSelected());
		lblImagen.setIcon(icons[miSlider.getSliderSelection()]); 
	}

	@Override
	public void seApretoAbajo() {
		
	}

	@Override
	public void seApretoArriba() { 
		
	}

	@Override
	public void seApretoEnter() {
		FabricaElementos fabrica;
		switch(miSlider.getSliderSelection()) {
			case 0:{
				fabrica=new FabricaOverworld();
				miUI.setFabrica(fabrica);
				break;
			}
			case 1:{
				fabrica=new FabricaNether();
				miUI.setFabrica(fabrica);
				break;
			}
		}
		salirAMenuPrincipal();		
	}

	@Override
	public void seApretoEspacio() {
		salirAMenuPrincipal();
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}
	
	public String getName() {
		return stateName;
	}
	
	/**
	 * Procedimiento que pone en la UI el menu principal con la opción de "Seleccionar skin" marcada
	 */
	private void salirAMenuPrincipal() {
		State estadoNuevo=new MenuPrincipal(miUI, 1, mainFont);
		miUI.cambiarEstado(estadoNuevo, estadoNuevo.getName());
	}

	@Override
	public void seApretoP(boolean pause) {
		
	}
}
