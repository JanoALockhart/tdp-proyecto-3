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
import logica.mapa.Mapa;

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
	public Jugador construirJugador(Celda cel, Mapa map) {
		return Jugador.getInstance("/recursos/imagenes/Steve.png", cel,5, map); //TODO Deshardcodear este 5
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Blinky construirBlinky(Celda cel, Mapa map) {
		//TODO
		//return new Blinky("/recursos/imagenes/Zombie.png", cel);
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Pinky construirPinky(Celda cel, Mapa map) {
		//TODO
		//return new Pinky("/recursos/imagenes/Spider.png",cel);
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Inky construirInky(Celda cel, Mapa map) {
		//TODO
		//return new Inky("/recursos/imagenes/Creeper.png",cel);
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Clyde construirClyde(Celda cel, Mapa map) {
		//TODO
		//return new Clyde("/recursos/imagenes/Skeleton.png",cel);
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PacDot construirPacDot(Celda cel, Mapa map) {
		PacDot dot;
		int puntaje = 100;
		dot = new PacDot(puntaje,"../../recursos/imagenes/xpVerde.png",cel);
		return dot;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Fruta construirFruta(Celda cel, Mapa map) {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PowerPellet construirPowerPellet(Celda cel, Mapa map) {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public SpeedPotion construirSpeedPotion(Celda cel, Mapa map) {
		//TODO
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Bomb construirBomba(Celda cel, Mapa map) {
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
	public Portal construirPortal(Celda cel, Mapa map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getLevel1Layout() {
		return "/recursos/imagenes/Map.png";
	}
	
	
}
