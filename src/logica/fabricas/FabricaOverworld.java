/**
 * 
 */
package logica.fabricas;

import logica.entidades.Collectibles.Power_ups.*;
import logica.entidades.Collectibles.Puntos.*;
import logica.entidades.Entornos.*;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.*;
import logica.mapa.Celda;

/**
 *
 */
public class FabricaOverworld implements FabricaElementos{
	
	public FabricaOverworld() {
		
	}
	
	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Jugador construirJugador() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Blinky construirBlinky() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Pinky construirPinky() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Inky construirInky() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Clyde construirClyde() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PacDot construirPacDot() {
		PacDot dot = null;
		int puntaje = 100;
		//dot = new PacDot(puntaje,"/recursos/imagenes/xpVerde.png");
		return dot;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Fruta construirFruta() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PowerPellet construirPowerPellet() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public SpeedPotion construirSpeedPotion() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Bomb construirBomba() {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Celda construirCelda(int x, int y) {
		return new Celda(x,y);
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Portal construirPortal() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
