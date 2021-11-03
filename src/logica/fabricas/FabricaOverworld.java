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
	public Jugador construirJugador(Celda pos) {
		return new Jugador("/recursos/imagenes/Steve.png", pos);
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Blinky construirBlinky() {
		return new Blinky("/recursos/imagenes/Zombie.png", pos);
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Pinky construirPinky() {
		return new Pinky("/recursos/imagenes/Spider.png");
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Inky construirInky() {
		return new Inky("/recursos/imagenes/Creeper.png");
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Clyde construirClyde() {
		return new Clyde("/recursos/imagenes/Skeleton.png");
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PacDot construirPacDot() {
		PacDot dot;
		int puntaje = 100;
		dot = new PacDot(puntaje,"/recursos/imagenes/xpVerde.png");
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
	
	public String getLevel1Layout() {
		return "/recursos/imagenes/Map.png";
	}
	
	
	
}
