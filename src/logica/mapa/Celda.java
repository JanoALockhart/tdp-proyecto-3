package logica.mapa;

import java.awt.Rectangle;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import logica.entidades.Entidad;
import main.Main;

/**
 * Clase Celda. Contiene un conjunto de entidades y
 * su posicion en el mapa.
 */
public class Celda {
	private int posX;
	private int posY;
	
	private static final int ANCHO = Integer.parseInt(Main.dimentionConfig.getProperty("anchoCelda"));
	private static final int ALTO = Integer.parseInt(Main.dimentionConfig.getProperty("altoCelda"));
	
	Set<Entidad> entidades;
	
	/**
	 * Constructor de Celda
	 * 
	 */
	public Celda(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		entidades = Collections.synchronizedSet(new HashSet<Entidad>());
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
	
	public int getAncho() {
		return ANCHO;
	}
	
	public int getAlto() {
		return ALTO;
	}
	
	
}
