	/**
 * 
 */
package logica.partida;

import java.util.LinkedList;

import logica.builder.*;
import logica.entidades.Entidad;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.mapa.Mapa;
import logica.fabricas.*;
/**
 * Clase responsable de crear y controlar todos los 
 * personajes presentes en el nivel el que se está
 */
public class Nivel {
	private Nivel sigNivel;
	private BuilderNivel miBuilder;
	private DirectorNivel miDirector;
	private Mapa miMapa;
	private ControladorPerseguidores mentePerseguidores;
	private Partida miPartida;
	private String layoutFile;
	private String layoutImg;
	
	/**
	 * Constructor de nivel. Crea el builder y el director para
	 * disponer las cosas en el mapa.
	 * @param fab Es la fabrica de la que se obtendrán los elementos a posicionar para el nivel
	 * @param par Es la partida en la que se está jugando el nivel.
	 */
	public Nivel(FabricaElementos fab, Partida par, String layoutFile, String layoutImg) {
		miBuilder = new ArquitectoNivel(fab);
		miDirector = new DirectorNivel(miBuilder);
		miPartida = par;
		this.layoutFile = layoutFile;
		this.layoutImg = layoutImg;
	}
	
	/**
	 * Asigna como siguiente nivel a este, el nivel ingresado por parámetro
	 * @param lvl Es el siguiente nivel a este.
	 */
	public void setSigNivel(Nivel lvl) {
		sigNivel = lvl;
	}
	
	/**
	 * Método que retorna el siguiente nivel a este
	 * @return El siguiente nivel a este nivel.
	 */
	public Nivel getSigNivel() {
		return sigNivel;
	}

	/**
	 * Método que construye el nivel, envia mensaje a la partida para que
	 * sea mostrado por pantalla e inicializa el movimiento de los personajes
	 */
	public void inicializar() {
		try {
			miDirector.armarNivel(layoutFile);
			miMapa = miBuilder.getNivelArmado();
			miPartida.imprimirMapa(miMapa.getTodasLasEntidades(), layoutImg);
			mentePerseguidores = miBuilder.getMentePerseguidores();
			
			Thread.sleep(1000);
			comenzarTimers();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que se encarga de reposicionar todos los personajes
	 * en sus posiciones iniciales y los pone a correr nuevamente
	 */
	public void resetear() {
		try {
			detener();
			Jugador.getInstance().resetearPosInicial();
			mentePerseguidores.resetPerseguidores();
			Thread.sleep(250);
			comenzarTimers();
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Metodo que provoca que los personajes comiencen su movimiento
	 */
	private void comenzarTimers() {
		Jugador.getInstance().iniciarTimer();
		mentePerseguidores.iniciarTimer();
	}
	
	/**
	 * Metodo que se encarga de que todos los personajes
	 * dejen de moverse.
	 */
	public void detener() {
		Jugador.getInstance().detener();
		mentePerseguidores.detenerPerseguidores();
	}
	
	public void asustarPerseguidores() {
		mentePerseguidores.asustarPerseguidores();
	}
	
	public void removerBasura() {
		LinkedList<EntidadGrafica> borrar = new LinkedList<EntidadGrafica>();
		for(Entidad<? extends EntidadGrafica> ent : miMapa.getTodasLasEntidades()) {
			borrar.add(ent.getEntidadGrafica());
		}
		Partida.getInstance().eliminarImgBasura(borrar);
	}
}
