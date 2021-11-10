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
		dot = new PacDot(puntaje,"../../recursos/imagenes/xpVerde.png",cel, map);
		return dot;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Fruta construirFruta(Celda cel, Mapa map) {
		Fruta fruit;
		int puntaje = 1000;
		fruit = new Fruta(puntaje,"../../recursos/imagenes/fruit.png",cel, map);
		return fruit;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PowerPellet construirPowerPellet(Celda cel, Mapa map) {
		PowerPellet pp;
		pp = new PowerPellet("../../recursos/imagenes/ManzanaDorada.png",16,16,cel, map);
		return pp;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public SpeedPotion construirSpeedPotion(Celda cel, Mapa map) {
		SpeedPotion sp;
		sp = new SpeedPotion("../../recursos/imagenes/potion.png",16,16,cel, map);
		return sp;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Bomb construirBomba(Celda cel, Mapa map) {
		Bomb bomba;
		bomba = new Bomb("../../recursos/imagenes/gunpowder.png",16,16,cel, map);
		return bomba;
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
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel1
	 */
	public String getLevel1Layout() {
		return "../../recursos/imagenes/Map.png";
	}
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel2
	 */
	public String getLevel2Layout() {
		return "../../recursos/imagenes/nivel2.png";
	}
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel3
	 */
	public String getLevel3Layout() {
		return "../../recursos/imagenes/MapaPlantillaN3.png";
	}
	
	
}
