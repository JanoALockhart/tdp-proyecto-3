package logica.entidades.entGrafica;

import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;

import logica.entidades.EntidadGrafica;

public abstract class PersonajeGrafico extends EntidadGrafica{
	protected EstadoGrafico miEstadoAct;
	protected Properties fileDirs;
	
	public PersonajeGrafico(Properties file, String img, int x, int y, int w, int h, int p) {
		super(img, x, y, w, h, p);
		fileDirs = file;
	}
	
	/**
	 * 
	 * @param dir
	 */
	public void rotarSprite(int dir) {
		String nuevaImg; 
		ImageIcon nuevoIcon;
	
	
		nuevaImg = miEstadoAct.getImgGirada(dir);
		nuevoIcon = new ImageIcon(PersonajeGrafico.class.getResource(nuevaImg));
		Image imgResized = nuevoIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        icon = new ImageIcon(imgResized);
        
        jlbl.setIcon(icon);
	}
	
	/**
	 * Luego vienen todos los comandos de movimientos
	 */
	
}
