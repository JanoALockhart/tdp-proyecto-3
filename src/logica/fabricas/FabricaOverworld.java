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
	public Jugador construirJugador(Celda cel, Mapa map) {//TODO revisar para hacer mejor
		String dirImg = Main.filesConfig.getProperty("steveOW");
		int vel = Integer.parseInt(Main.personajesConfig.getProperty("velJugador"));
		Jugador.getInstance(dirImg, cel, vel, map); 
		Jugador.getInstance().colocarEnMapa(cel, map);
		return Jugador.getInstance();
	}

	public Blinky construirBlinky(Celda cel, Mapa map) {
		String dirImg = Main.filesConfig.getProperty("zombieOW");
		return new Blinky(dirImg, cel, 50,map);//TODO eliminar la velocidad del constructor
	}

	public Pinky construirPinky(Celda cel, Mapa map) {
		//TODO
		String img = Main.filesConfig.getProperty("spiderOW");
		//return new Pinky(img,cel);
		return null;
	}

	public Inky construirInky(Celda cel, Mapa map) {
		String img = Main.filesConfig.getProperty("creeperOW");
		//return new Inky(,cel);
		return null;
	}

	public Clyde construirClyde(Celda cel, Mapa map) {
		//TODO
		String img = Main.filesConfig.getProperty("skeletonOW");
		//return new Clyde(img,cel);
		return null;
	}

	public PacDot construirPacDot(Celda cel, Mapa map) {
		PacDot dot;
		String img = Main.filesConfig.getProperty("pacDotOW");
		int puntaje = Integer.parseInt(Main.personajesConfig.getProperty("puntajePacDot"));
		dot = new PacDot(puntaje,img,cel, map);
		return dot;
	}

	public Fruta construirFruta(Celda cel, Mapa map) {
		Fruta fruit;
		String img = Main.filesConfig.getProperty("frutaOW");
		int puntaje = Integer.parseInt(Main.personajesConfig.getProperty("puntajeFruta"));
		fruit = new Fruta(puntaje,img,cel, map);
		return fruit;
	}

	public PowerPellet construirPowerPellet(Celda cel, Mapa map) {
		PowerPellet pp;
		String img = Main.filesConfig.getProperty("powerPelletOW");
		int ancho = Integer.parseInt(Main.dimentionConfig.getProperty("anchoPowerPellet"));
		int alto = Integer.parseInt(Main.dimentionConfig.getProperty("altoPowerPellet"));
		pp = new PowerPellet(img,ancho,alto,cel, map);
		return pp;
	}

	public SpeedPotion construirSpeedPotion(Celda cel, Mapa map) {
		SpeedPotion sp;
		String img = Main.filesConfig.getProperty("speedPotionOW");
		int ancho = Integer.parseInt(Main.dimentionConfig.getProperty("anchoSpeedPot"));
		int alto = Integer.parseInt(Main.dimentionConfig.getProperty("altoSpeedPot"));
		sp = new SpeedPotion(img,ancho,alto,cel, map);
		return sp;
	}

	public Bomb construirBomba(Celda cel, Mapa map) {
		Bomb bomba;
		String img = Main.filesConfig.getProperty("bombaOW");
		int ancho = Integer.parseInt(Main.dimentionConfig.getProperty("anchoBomba"));
		int alto = Integer.parseInt(Main.dimentionConfig.getProperty("altoBomba"));
		bomba = new Bomb(img,ancho,alto,cel, map);
		return bomba;
	}

	public Celda construirCelda(int x, int y) {
		return new Celda(x,y);
	}


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
