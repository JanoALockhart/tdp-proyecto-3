package logica.fabricas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import logica.entidades.Collectibles.Power_ups.Bomb;
import logica.entidades.Collectibles.Power_ups.PowerPellet;
import logica.entidades.Collectibles.Power_ups.SpeedPotion;
import logica.entidades.Collectibles.Puntos.Fruta;
import logica.entidades.Collectibles.Puntos.PacDot;
import logica.entidades.Entornos.Portal;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Blinky;
import logica.entidades.Personaje.Perseguidores.Clyde;
import logica.entidades.Personaje.Perseguidores.Inky;
import logica.entidades.Personaje.Perseguidores.Pinky;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.entGrafica.JugadorGrafico;
import logica.entidades.entGrafica.PerseguidorGrafico;
import logica.mapa.Celda;
import logica.mapa.Mapa;
import main.Main;

public class FabricaNether implements FabricaElementos{
	private Properties archivoDirImgs;
	
	public FabricaNether() {
		try {
			InputStream inputFilesConfig = new FileInputStream("src/recursos/imagenes/skinNether/skinNetherConfig.txt");
			archivoDirImgs = new Properties();
			archivoDirImgs.load(inputFilesConfig);
	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Metodo que crea la instancia de jugador, le asigna
	 * su entidadGrafica y lo devuleve
	 */
	public Jugador<JugadorGrafico> construirJugador(Celda cel, Mapa map) {//TODO revisar para hacer mejor
		int vel = Integer.parseInt(Main.personajesConfig.getProperty("velJugador"));
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsJugador"));
		String dirImg = dirSkins.getProperty("normalESTE");
		JugadorGrafico jugGraf = new JugadorGrafico(dirSkins, dirImg, cel.getX(), cel.getY(), cel.getAncho(), cel.getAlto(),3);
		Jugador.getInstance(jugGraf, dirImg, cel, vel, map); 
		return Jugador.getInstance();
	}

	public Blinky construirBlinky(Celda cel, Mapa map) {
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsBlinky"));
		String dirImg = dirSkins.getProperty("normalESTE");
		Posicionador p = new Posicionador(cel,1);
		PerseguidorGrafico skin = new PerseguidorGrafico(dirSkins,dirImg,p.getX(),p.getY(),p.getAncho(),p.getAlto(),3); 
		return new Blinky(skin, dirImg, cel, 50,map);//TODO eliminar parametros inutiles del constructor
	}

	public Pinky construirPinky(Celda cel, Mapa map) {
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsPinky"));
		String dirImg = dirSkins.getProperty("normalESTE");
		Posicionador p = new Posicionador(cel,1);
		PerseguidorGrafico skin = new PerseguidorGrafico(dirSkins,dirImg,p.getX(),p.getY(),p.getAncho(),p.getAlto(),3); 
		return new Pinky(skin,dirImg,cel,50,map);
	}

	//TODO implementar
	public Inky construirInky(Celda cel, Mapa map) {
		String img = Main.filesConfig.getProperty("creeperOW");
		//return new Inky(,cel);
		return null;
	}

	public Clyde construirClyde(Celda cel, Mapa map) {
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsClyde"));
		String dirImg = dirSkins.getProperty("normalESTE");
		Posicionador p = new Posicionador(cel,1);
		PerseguidorGrafico skin = new PerseguidorGrafico(dirSkins,dirImg,p.getX(),p.getY(),p.getAncho(),p.getAlto(),3); 
		return new Clyde(skin,dirImg,cel,50,map);
	}

	public PacDot construirPacDot(Celda cel, Mapa map) {
		int puntaje = Integer.parseInt(Main.personajesConfig.getProperty("puntajePacDot"));
		
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsCollectibles"));
		String dirImg = dirSkins.getProperty("pacDot");
		
		Posicionador p = new Posicionador(cel,3);		
		EntidadGrafica skin = new EntidadGrafica(dirImg,p.getX(),p.getY(),p.getAncho(),p.getAlto(),3); 
		
	
		return new PacDot(puntaje,skin,map);
	}

	public Fruta construirFruta(Celda cel, Mapa map) {
		int puntaje = Integer.parseInt(Main.personajesConfig.getProperty("puntajeFruta"));
		
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsCollectibles"));
		String img = dirSkins.getProperty("fruta");
		
		Posicionador p = new Posicionador(cel,3);//TODO este numerito representa la porcion de celda, desharcodearlo		
		EntidadGrafica skin = new EntidadGrafica(img,p.getX(),p.getY(),p.getAncho(),p.getAlto(),2); //TODO deshardocodear estos numeritos
		
		return new Fruta(puntaje,skin, map);
	}

	public PowerPellet construirPowerPellet(Celda cel, Mapa map) {
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsCollectibles"));
		String img = dirSkins.getProperty("powerPellet");
		
		Posicionador p = new Posicionador(cel,1);//TODO este numerito representa la porcion de celda, desharcodearlo		
		EntidadGrafica skin = new EntidadGrafica(img,p.getX(),p.getY(),p.getAncho(),p.getAlto(),2); //TODO deshardocodear estos numeritos
		
		
		return new PowerPellet(skin, map);
	}

	public SpeedPotion construirSpeedPotion(Celda cel, Mapa map) {
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsCollectibles"));
		String img = dirSkins.getProperty("speedPotion");
		
		Posicionador p = new Posicionador(cel,2);//TODO este numerito representa la porcion de celda, desharcodearlo		
		EntidadGrafica skin = new EntidadGrafica(img,p.getX(),p.getY(),p.getAncho(),p.getAlto(),2); //TODO deshardocodear estos numeritos
		
		return new SpeedPotion(skin, map);
	}

	public Bomb construirBomba(Celda cel, Mapa map) {
		Properties dirSkins = abrirArchivoSkins(archivoDirImgs.getProperty("skinsCollectibles"));
		String img = dirSkins.getProperty("bomba");
		
		Posicionador p = new Posicionador(cel,2);//TODO este numerito representa la porcion de celda, desharcodearlo		
		EntidadGrafica skin = new EntidadGrafica(img,p.getX(),p.getY(),p.getAncho(),p.getAlto(),2); //TODO deshardocodear estos numeritos
		
		return new Bomb(skin, map);
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
		Properties skinMapas = abrirArchivoSkins(archivoDirImgs.getProperty("mapas"));
		return skinMapas.getProperty("mapImgLvl1");
	}
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel2
	 */
	public String getLevel2Layout() {
		Properties skinMapas = abrirArchivoSkins(archivoDirImgs.getProperty("mapas"));
		return skinMapas.getProperty("mapImgLvl2");
	}
	
	/**
	 * Metodo que devuelve la imagen de fondo para el nivel3
	 */
	public String getLevel3Layout() {
		Properties skinMapas = abrirArchivoSkins(archivoDirImgs.getProperty("mapas"));
		return skinMapas.getProperty("mapImgLvl3");
	}
	
	private Properties abrirArchivoSkins(String url) {
		Properties file=null;
		try {
			InputStream inputFilesConfig = new FileInputStream(url);
			file = new Properties();
			file.load(inputFilesConfig);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	
}
