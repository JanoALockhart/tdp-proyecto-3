package datos;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Clase que encapsula una colección de JugadoresDatos.
 */
public class TopJugadores implements Serializable{
	private LinkedList<JugadorDatos> mejores;
	
	/**
	 * Constructor
	 */
	public TopJugadores() {
		mejores = new LinkedList<JugadorDatos>();
	}
	
	/**
	 * Método que agrega un nuevo jugador a la colección y luego 
	 * es ordenada de los jugadores con mayor puntaje a los que
	 * tienen menor.
	 * Si la colección tiene siete elementos, el jugador con menor
	 * puntuación es eliminado
	 * @param player Es el objeto que almacena los datos del jugador y
	 * quiere ser almacenado en la colección.
	 */
	public void add(JugadorDatos player) {
		mejores.add(player);
		Collections.sort(mejores);
		if(mejores.size()>7) {
			mejores.remove(mejores.getLast());
		}
	}
	
	/**
	 * Devuelve un iterable de los jugadores almacenados desde el que
	 * tiene mayor puntaje hasta el que tiene menos
	 * @return Un iterable con los jugadores almacenados desde el que tiene
	 * mayor puntaje hasta el que tiene menos.
	 */
	public Iterable<JugadorDatos> getJugadores() {
		return mejores;
	}
}
