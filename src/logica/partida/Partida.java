/**
 * 
 */
package logica.partida;

import java.util.LinkedList;

import logica.builder.*;
import logica.entidades.*;
import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.fabricas.*;
import logica.mapa.Mapa;
import main.Main;
import vista.*;
/** 
 * La clase partia es responsable de ser medidadora entre la
 * capa logica y la capa vista del programa
 */
public class Partida {
	private PantallaNivel pantalla;
	private BuilderNivel builder;
	private Mapa miMapa;
	private Jugador player;
	private Iterable<Perseguidor> enemigos;
	private TimerMovimiento timerAvisaEnemigos;
	private int puntaje;
	
	private static Partida instance;
	
	/**
	 * Constructor de partida
	 * @param ui Es la pantalla a la que está asociada la partida
	 * @param fab Es la fabrica con la que se obtendrán los elementos
	 * a colocar en el mapa.
	 */
	private Partida(PantallaNivel ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);

		DirectorNivel directorLvl = new DirectorNivel(builder);
		directorLvl.armarNivel(Main.filesConfig.getProperty("fileLvl1"));//TODO cambiar a otro nivel

		miMapa = builder.getNivelArmado();
		player = Jugador.getInstance();
		enemigos = builder.getPerseguidores();
		
		Iterable<Entidad> entidades = miMapa.getTodasLasEntidades();
		
		LinkedList<EntidadGrafica> entGraficas = new LinkedList<EntidadGrafica>();

		//TODO revisar esto
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("../../recursos/imagenes/fruit.png");
		//
		
		for(Entidad ent : entidades) {
			entGraficas.add(ent.getEntidadGrafica());
		}
		
		pantalla.imprimirMapa(entGraficas, fab.getLevel1Layout(), fruits);//TODO cambiar al layout de otro lvl
		//TODO tal vez haya que tener atributo tipo fabrica
		
		//Inicializar Timers
		Jugador.getInstance().iniciarTimer();
		
		int velEnemigos = Integer.parseInt(Main.personajesConfig.getProperty("velEnemigos"));
		timerAvisaEnemigos = new TimerMovimiento(this,velEnemigos);
		Thread hilo = new Thread(timerAvisaEnemigos);
		hilo.start();
		
		
	}
	
	/**
	 * Metodo estático para el patron singleton. Este método es el que se
	 * llama cuando la instancia debe ser creada por primera vez. 
	 * En los sucesivos llamados, se debe utilizar getInstance()
	 * @param ui Es la pantalla que tiene asociada la partida
	 * @param fab Es la fabrica con la que se obtienen los elementos
	 * a colocar en el mapa.
	 * @return La instancia unica de partida
	 */
	public static Partida getInstance(PantallaNivel ui, FabricaElementos fab) {
		if(instance == null) {
			instance = new Partida(ui,fab);
			System.out.println("bool:"+instance!=null);
		}
		return instance;
	}
	
	/**
	 * Metodo estático del patron singleton. Debe ser llamado luego
	 * de haber creado la instancia con getInstance(PantallaNivel, FabricaELementos)
	 * @return La instancia unica de partida
	 */
	public static Partida getInstance() {
		return instance;
	}
	
	//TODO preguntar
	public void siguienteNivel() {
		/*
		nivelActual.detenerPersonajes();
		nivelActual = nivelActual.getSiguiente();
		nivelActual.inicializar();
		*/
	}
	
	public void imprimirMapa() {
		
	}
	
	public void perder() {
		
	}
	
	public void victoria() {
		
	}
	
	/**
	 * Metodo que le comunica a la clase jugador que
	 * la tecla para arriba fue presionada
	 */
	public void seApretoArriba() {		
		Jugador.getInstance().cambiarDireccion(Jugador.NORTE);
	}
	
	/**
	 * Metodo que le comunica a la clase jugador que
	 * la tecla para la derecha fue presionada
	 */
	public void seApretoDerecha() {
		player.cambiarDireccion(player.ESTE);
	}
	
	/**
	 * Metodo que le comunica a la clase jugador que
	 * la tecla para la izquierda fue presionada
	 */
	public void seApretoIzquierda() {
		player.cambiarDireccion(player.OESTE);
	}
	
	/**
	 * Metodo que le comunica a la clase jugador que
	 * la tecla para abajo fue presionada
	 */
	public void seApretoAbajo() {
		player.cambiarDireccion(player.SUR);
	}
	
	public void seApretoEnter() {
		
	}
	
	public void seApretoEspacio() {
	
	}
	
	/**
	 * Metodo que suma una cantidad de puntaje p
	 * indicado por parámetro
	 * @param p Es la cantidad de puntos que se desean sumar.
	 */
	public void addPuntaje(int p) {
		puntaje += p;
		pantalla.setPuntacion(puntaje);
//		System.out.println("SUMO " + p + " PUNTOS ");
	}
	
	/**
	 * Metodo que avisa a todos los perseguidores que deben
	 * moverse
	 */
	public void moverPerseguidores() {
		for(Personaje per : enemigos) {
			per.avanzar();
		}
	}
	
	/**
	 * Metodo que avisa a todos los perseguidores que deben 
	 * asustarse.
	 */
	public void asustarPerseguidores() {
		for(Perseguidor enemy : enemigos) {
			enemy.asustar();
		}
		
	}
	
	/**
	 * Notifica a la interfaz grafica para que saque un corazon 
	 * de la interfaz grafica
	 * @param vidasRestantes Es la cantidad de vidas que le
	 * quedan al jugador
	 */
	public void quitarVida(int vidasRestantes) {
		pantalla.refrescarLabelsVida(vidasRestantes);
	}
	
	/**
	 * Metodo que envia mensaje a la gui para que actualice
	 * la cantidad de bombas en el inventario
	 * @param cantBombas Es la cantidad de bombas que tiene
	 * el jugador
	 */
	public void actualizarBombas(int cantBombas) {
		pantalla.refrescarLabelsBomba(cantBombas);
	}

	/**
	 * Metodo que comunica a la interfaz que elimine
	 * un label de una entidad grafica. El label
	 * debió haber sido agregado a la pantalla previamente
	 * para poder llamar a este método
	 * @param entGrafica Es la entidad grafica de la que se
	 * obtendrá el label a eliminar.
	 */
	public void elimnarEntidadGrafica(EntidadGrafica entGrafica) {
		pantalla.eliminarLabel(entGrafica.getLbl());		
	}


}
