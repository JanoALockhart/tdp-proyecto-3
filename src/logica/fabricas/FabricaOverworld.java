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
import main.Main;

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
		System.out.println(Main.filesConfig.getProperty("steveOW"));
		return Jugador.getInstance(Main.filesConfig.getProperty("steveOW"), cel,Main.personajesConfig.getProperty("velJugador"), map); //TODO Deshardcodear este 5
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Blinky construirBlinky(Celda cel, Mapa map) {
		return new Blinky(Main.filesConfig.getProperty("zombieOW"), cel, 50,map);
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
		//return new Inky(Main.filesConfig.getProperty("spiderOW"),cel);
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Clyde construirClyde(Celda cel, Mapa map) {
		//TODO
		//return new Clyde(Main.filesConfig.getProperty("skeletonOW"),cel);
		return null;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PacDot construirPacDot(Celda cel, Mapa map) {
		PacDot dot;
		int puntaje = 100;
		dot = new PacDot(puntaje,Main.filesConfig.getProperty("pacDotOW"),cel, map);
		return dot;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Fruta construirFruta(Celda cel, Mapa map) {
		Fruta fruit;
		int puntaje = 1000;
		fruit = new Fruta(puntaje,Main.filesConfig.getProperty("frutaOW"),cel, map);
		return fruit;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public PowerPellet construirPowerPellet(Celda cel, Mapa map) {
		PowerPellet pp;
		pp = new PowerPellet(Main.filesConfig.getProperty("powerPelletOW"),16,16,cel, map);
		return pp;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public SpeedPotion construirSpeedPotion(Celda cel, Mapa map) {
		SpeedPotion sp;
		sp = new SpeedPotion(Main.filesConfig.getProperty("speedPotionOW"),16,16,cel, map);
		return sp;
	}


	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Bomb construirBomba(Celda cel, Mapa map) {
		Bomb bomba;
		bomba = new Bomb(Main.filesConfig.getProperty("bombaOW"),16,16,cel, map);
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
		return Main.filesConfig.getProperty("mapImgLvl1OW");
	}
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel2
	 */
	public String getLevel2Layout() {
		return Main.filesConfig.getProperty("mapImgLvl2OW");
	}
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel3
	 */
	public String getLevel3Layout() {
		return Main.filesConfig.getProperty("mapImgLvl3OW");
	}
	
	
}
