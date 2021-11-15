package logica.mapa;

import java.awt.Rectangle;
import java.util.HashSet;
import java.util.LinkedList;

import logica.entidades.Entidad;
import main.Main;

/**
 * Clase Celda
 *
 */
public class Celda {
	private int posX;
	private int posY;
	
	private static final int ANCHO = Integer.parseInt(Main.dimentionConfig.getProperty("anchoCelda"));
	private static final int ALTO = Integer.parseInt(Main.dimentionConfig.getProperty("altoCelda"));
	
	HashSet<Entidad> entidades;
	
	/**
	 * Constructor de Celda
	 * 
	 */
	public Celda(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		entidades = new HashSet<Entidad>();
	}
	
	/**
	 * Metodo que retorna la coordenada x de la celda
	 * @return Un entero que es la coordenada x de la celda.
	 */
	public int getX() {
		return posX;
	}
	
	/**
	 * Metodo que retorna la coordenada y de la celda
	 * @return Un entero que es la coordenada y de la celda.
	 */
	public int getY() {
		return posY;
	}
	
	/**
	 * Calcula la distancia desde la celda a la que se le pidio este mensaje
	 * a la celda pasada por parámetro, aplicando teorema de pitágoras.
	 * @param c Es la celda objetivo.
	 * @return La distancia entre esta celda y la celda pasada por parámetro
	 */
	public double distanciaA(Celda c) {
		float difX;
		float difY;
		difX = Math.abs(this.posX-c.getX());
		difY = Math.abs(this.posY-c.getY());
		
		
		return Math.sqrt(difY*difY+difX*difX);
	}
	
	/**
	 * Metodo que retorna un iterable con las entidades que 
	 * se encuentran en la celda, al momento de ser llamado este
	 * método.
	 * @return Un iterable con las entidades de la celda
	 */
	public Iterable<Entidad> getEntidades(){
		LinkedList<Entidad> listaEntidades = new LinkedList<Entidad>();
		
		for(Entidad ent : this.entidades) {
			listaEntidades.add(ent);
		}
		
		return listaEntidades;
		
	}
	
	/**
	 * Metodo que coloca una entidad en esta celda.
	 * @param e Es la entidad que será colocada.
	 */
	public void add(Entidad e) {
		entidades.add(e);
	}
	
	/**
	 * Metodo que elimina una entidad dada de esta celda.
	 * @param e Es la entidad a remover.
	 */
	public void remove(Entidad e) {
		entidades.remove(e);
	}
	
	
	/**
	 * Metodo que devuelve la celda adyacente a esta celda
	 * en la dirección indicada
	 * @param direccion Es la direccion en la que está la celda que
	 * se desea obtener
	 * @return La celda adyacente de esta celda que esta en la dirección indicada
	 */
	public Celda getCeldaVecina(int direccion) {
		return null;
	}
	//TODO implementar este método con las constantes direcciones.
	
	public int getAncho() {
		return ANCHO;
	}
	
	public int getAlto() {
		return ALTO;
	}
	
	
}
