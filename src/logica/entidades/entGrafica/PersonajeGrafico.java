package logica.entidades.entGrafica;

import java.awt.Image;
import java.util.Properties;

import javax.swing.ImageIcon;

import logica.entidades.entGrafica.estados.EstadoGrafico;
import logica.entidades.entGrafica.estados.Normal;
import main.Main;

public abstract class PersonajeGrafico extends EntidadGrafica{
	protected EstadoGrafico miEstadoAct;
	protected Properties fileDirs;
	protected static final int pixelPorPaso = Integer.parseInt(Main.dimentionConfig.getProperty("pixelPorPaso"));
	
	public PersonajeGrafico(Properties file, String img, int x, int y, int w, int h, int p) {
		super(img, x, y, w, h, p);
		fileDirs = file;
		miEstadoAct = new Normal(file);
	}
	
	/**
	 * 
	 * @param dir
	 */
	public void rotarSprite(int dir) throws NullPointerException{
		String nuevaImg=null;
		ImageIcon nuevoIcon;
		try {
			nuevaImg = miEstadoAct.getImgGirada(dir);
			nuevoIcon = new ImageIcon(PersonajeGrafico.class.getResource(nuevaImg));
			Image imgResized = nuevoIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
	        ImageIcon icon = new ImageIcon(imgResized);
	        
	        jlbl.setIcon(icon);
		}catch(NullPointerException e) {
			System.out.println("dir: "+ dir);
			System.out.println("url: "+ nuevaImg);
			e.printStackTrace();
		}
	}

	public void moverNorte() {
		jlbl.setLocation(jlbl.getX(), jlbl.getY()-pixelPorPaso);
	}
			
	public void moverSur() {
		jlbl.setLocation(jlbl.getX(), jlbl.getY()+pixelPorPaso);
	}
			
	public void moverEste() {
			jlbl.setLocation(jlbl.getX()+pixelPorPaso, jlbl.getY());
	}
			
	public void moverOeste() {
		jlbl.setLocation(jlbl.getX()-pixelPorPaso, jlbl.getY());
	}
	
	/**
	 * Devuelve la imagen de la entidad grafica a la imagen 
	 * asignada como normal, que es con la que spawnean.
	 * @param dir Es la dirección a la que está mirando la entidad
	 */
	public void setNormal(int dir) {
		miEstadoAct = new Normal(fileDirs);
		rotarSprite(dir);
	}
	
}
