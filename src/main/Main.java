package main;
import java.awt.EventQueue;
import java.io.*;
import java.util.Properties;

import vista.UserInterface;

public class Main {
	
	public static Properties filesConfig;
	public static Properties dimentionConfig;
	public static Properties personajesConfig;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					loadConfiguration();
					
					UserInterface frame = new UserInterface();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	/**
	 * Metodo que abre los archivos de propiedades
	 */
	private static void loadConfiguration() {
		try {
			InputStream inputFilesConfig = new FileInputStream("src/recursos/config/direccionesArchivos.properties");
			Main.filesConfig = new Properties();
			Main.filesConfig.load(inputFilesConfig);
			
			InputStream inputDimConfig = new FileInputStream("src/recursos/config/dimensionesElementos.properties");
			Main.dimentionConfig = new Properties();
			Main.dimentionConfig.load(inputDimConfig);
			
			InputStream inputPersonajesConfig = new FileInputStream("src/recursos/config/personajesConfig.properties");
			Main.personajesConfig = new Properties();
			Main.personajesConfig.load(inputPersonajesConfig);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

