/**
 * 
 */
package logica.partida;

import java.util.LinkedList;

import datos.JugadorDatos;
import datos.Serializador;
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
	private Jugador player;
	private int puntaje;
	private Nivel nivelActual;
	
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
		
		Nivel lvl1 = new Nivel(fab, this, Main.filesConfig.getProperty("fileLvl1"), fab.getLevel1Layout());
		Nivel lvl2 = new Nivel(fab, this, Main.filesConfig.getProperty("fileLvl2"), fab.getLevel2Layout());
		Nivel lvl3 = new Nivel(fab, this, Main.filesConfig.getProperty("fileLvl3"), fab.getLevel3Layout());
		
		nivelActual=lvl1;
		lvl1.setSigNivel(lvl2);
		lvl2.setSigNivel(lvl3);

		lvl1.inicializar();
		player = Jugador.getInstance();
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
	
	/**
	 * Metodo que provoca que se pase al siguiente nivel.
	 * Si no existe siguiente nivel, se activa la pantalla
	 * de victoria.
	 */
	public void siguienteNivel() {
		nivelActual.detener();
		//nivelActual.removerBasura(); Fantasmas no lo borra
		nivelActual = nivelActual.getSigNivel();
		if(nivelActual!=null){
			nivelActual.inicializar();
		}else{
			victoria();
		}
	}
	
	//TODO no imprime el mapa nuevo cuando se pasa de nivel
	public void imprimirMapa(Iterable<Entidad> entities, String layout) { 
		//TODO revisar lo del fruits
		LinkedList<EntidadGrafica> entGraficas = new LinkedList<EntidadGrafica>();

		//TODO revisar esto
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("../../recursos/imagenes/fruit.png");
		//
		
		for(Entidad ent : entities) {
			entGraficas.add(ent.getEntidadGrafica());
		}
		pantalla.imprimirMapa(entGraficas, layout, fruits);
	}
	
	public void perder() {
		System.out.println("Perdiste");
		nivelActual.detener();
		//mostrarPantallaDerrota
	}
	
	private void victoria() {
		//Mostrar pantalla victoria
		System.out.println("Ganaste");
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
		Jugador.getInstance().cambiarDireccion(Jugador.ESTE);
	}
	
	/**
	 * Metodo que le comunica a la clase jugador que
	 * la tecla para la izquierda fue presionada
	 */
	public void seApretoIzquierda() {
		player.cambiarDireccion(Jugador.OESTE);
	}
	
	/**
	 * Metodo que le comunica a la clase jugador que
	 * la tecla para abajo fue presionada
	 */
	public void seApretoAbajo() {
		player.cambiarDireccion(Jugador.SUR);
	}
	
	public void seApretoEnter() {
		
	}
	
	public void seApretoEspacio() {
		
		/**TEST SERIALIZADOR
		JugadorDatos jug = new JugadorDatos("asldasd",345);
		
		Serializador ser = new Serializador();
		ser.guardarJugador(jug);
		for(JugadorDatos jd : ser.obtenerTopPlayers()) {
			System.out.println(jd.getNombre()+":"+jd.getPuntaje());
		}*/
	}
	
	/**
	 * Metodo que suma una cantidad de puntaje p
	 * indicado por parámetro
	 * @param p Es la cantidad de puntos que se desean sumar.
	 */
	public void addPuntaje(int p) {
		puntaje += p;
		pantalla.setPuntacion(puntaje);
//		System.out.println("SUMO " + p + " PUNTOS "); //Comentario
	}

	/**
	 * Metodo que avisa a todos los perseguidores que deben 
	 * asustarse.
	 */
	public void asustarPerseguidores() {
		nivelActual.asustarPerseguidores();
	}
	
	/**
	 * Notifica a la interfaz grafica para que saque un corazon 
	 * de la interfaz grafica
	 * @param vidasRestantes Es la cantidad de vidas que le
	 * quedan al jugador
	 */
	public void quitarVida(int vidasRestantes) {
		nivelActual.resetear();
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
