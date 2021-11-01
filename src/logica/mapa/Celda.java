package logica.mapa;

import java.util.LinkedList;

import logica.entidades.Entidad;

/**
 * Clase Celda
 *
 */
public class Celda {
	private int posX;
	private int posY;
	LinkedList<Entidad> entidades;
	
	/**
	 * Constructor de Celda
	 * 
	 */
	public Celda(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		entidades = new LinkedList<Entidad>();
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
	 * a la celda pasada por par�metro, aplicando teorema de pit�goras.
	 * @param c Es la celda objetivo.
	 * @return La distancia entre esta celda y la celda pasada por par�metro
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
	 * se encuentran en la celda.
	 * @return Un iterable con las entidades de la celda
	 * TODO copia o el atributo?
	 *
	 */
	public Iterable<Entidad> getEntidades(){
		return entidades;
	}
	
	/**
	 * Metodo que coloca una entidad en esta celda.
	 * @param e Es la entidad que ser� colocada.
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
	 * en la direcci�n indicada
	 * @param direccion Es la direccion en la que est� la celda que
	 * se desea obtener
	 * @return La celda adyacente de esta celda que esta en la direcci�n indicada
	 */
	public Celda getCeldaVecina(int direccion) {
		return null;
	}
	//TODO implementar este m�todo con las constantes direcciones.
	
	
	
	
	
}