/**
 * 
 */
package logica.builder;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Esta clase tiene la responsabilidad de posicionar elementos
 * en el mapa utilizando los servicios provistos por BuilderNivel
 * y ayudándose de un archivo de texto.
 * 
 */
public class DirectorNivel {
	protected BuilderNivel armador;
	
	/**
	 * Constructor DirectorNivel
	 * @param armador Es el builder con el que se armarán los niveles
	 */
	public DirectorNivel(BuilderNivel armador) {
		this.armador = armador;
	}
	
	/**
	 * Metodo que lee todos los caracteres de un archivo de texto
	 * y dependiendo del caracter que vaya encontrando, le envia 
	 * un mensaje al builder para que agregue un elemento específico
	 */
	public void armarNivel(String dirFile) {
		try {
			FileInputStream layoutNivel = new FileInputStream(dirFile);
			char caract = (char) layoutNivel.read();
			for(int y=0; caract!='F'; y++) {
				for(int x=0; caract!='\n' && caract!='F'; x++) {
					
					switch(caract) {
						case '.': armador.agregarPacDot(x, y); break;
						case '_': armador.agregarCeldaVacia(x, y); break;
						case 's': armador.agregarSpeedPotion(x, y); break;
						case 'b': armador.agregarBomba(x, y); break;
						case 'p': armador.agregarPowerPellet(x, y); break;
						case 'f': armador.agregarFruta(x, y); break;
						case 'J': armador.agregarJugador(x, y); break;
						case 'B': armador.agregarBlinky(x, y);break;
						case 'P': armador.agregarPinky(x, y);break;
						case 'C': armador.agregarClyde(x, y);break;
						case 'I': armador.agregarInky(x, y);break;
					}
					
					caract = (char) layoutNivel.read();
				}
				caract = (char) layoutNivel.read();
			}
			
			layoutNivel.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
