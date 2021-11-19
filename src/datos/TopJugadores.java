package datos;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Clase que encapsula una colecci�n de JugadoresDatos.
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
	 * M�todo que agrega un nuevo jugador a la colecci�n y luego 
	 * es ordenada de los jugadores con mayor puntaje a los que
	 * tienen menor.
	 * Si la colecci�n tiene siete elementos, el jugador con menor
	 * puntuaci�n es eliminado
	 * @param player Es el objeto que almacena los datos del jugador y
	 * quiere ser almacenado en la colecci�n.
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
