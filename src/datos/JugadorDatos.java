package datos;

import java.io.Serializable;

/**
 * Esta clase tiene la responsabilidad de almacenar
 * el nombre del jugador y su puntaje para serializarlo
 * y luego
 */
public class JugadorDatos implements Serializable, Comparable<JugadorDatos>{
	private String name;
	private int puntaje;
	
	/**
	 * Constructor de JugadorDatos. Almacena el nobre del
	 * jugador y la puntuacion obtenida.
	 * @param nombre Es el nombre del jugador
	 * @param puntos Son los puntos que logr� obtener
	 */
	public JugadorDatos(String nombre, int puntos) {
		name = nombre;
		puntaje = puntos;
	}
	
	/**
	 * Devuelve el nombre del jugador
	 * @return El nombre del jugador
	 */
	public String getNombre() {
		return name;
	}
	
	/**
	 * Devuelve la puntuacion del jugador
	 * @return La puntuacion del jugador
	 */
	public int getPuntaje() {
		return puntaje;
	}
	
	/**
	 * Redefinici�n del m�todo compareTo. Est� implementado de manera
	 * tal que, en una colecci�n, los jugadores sean ordenados desde
	 * el que tiene mayor puntuacion al que tiene menor.
	 */
	public int compareTo(JugadorDatos jug2) {
		int devolver=0;
		if(puntaje<jug2.getPuntaje()) {
			devolver=1;
		}else if(puntaje>jug2.getPuntaje()) {
			devolver=-1;
		}
		return devolver;
	}
}
