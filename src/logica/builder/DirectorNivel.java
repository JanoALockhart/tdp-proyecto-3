/**
 * 
 */
package logica.builder;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 */
public abstract class DirectorNivel {
	protected BuilderNivel armador;
	
	/**
	 * Constructor DirectorNivel
	 * @param armador Es el builder con el que se armarán los niveles
	 */
	public DirectorNivel(BuilderNivel armador) {
		this.armador = armador;
	}
	
	/**
	 * Metodo que agrega pacdots en sus ubicaciones basándose 
	 * en un archivo de texto
	 * @param dirFile Es la direccion en la que se encuentra el archivo
	 */
	protected void agregarPacDots(String dirFile) {
		//Colocar PacDots utilizandp archivo
		try {
			FileInputStream pacDotsLvl1 = new FileInputStream(dirFile);
			//TODO en las celdas donde se colocarán otros objetos, escribir otro simbolo
			char caract = (char) pacDotsLvl1.read();
			for(int y=0; caract!='F'; y++) {
				for(int x=0; caract!='\n' && caract!='F'; x++) {
					if(caract=='.') {
						armador.agregarPacDot(x, y);
					}
					caract = (char) pacDotsLvl1.read();
				}
				caract = (char) pacDotsLvl1.read();
			}
			
			pacDotsLvl1.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Metodo que tiene todos los pasos que
	 * arman al nivel.
	 */
	public abstract void armarNivel();
	
	
}
