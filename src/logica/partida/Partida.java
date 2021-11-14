/**
 * 
 */
package logica.partida;

import java.util.LinkedList;

import logica.builder.*;
import logica.entidades.*;
import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Jugadores.Jugador;
import logica.fabricas.*;
import logica.mapa.Mapa;
import vista.*;
/** 
 *
 */
public class Partida {
	private PantallaNivel pantalla;
	private BuilderNivel builder;
	private Mapa miMapa;
	private Jugador player;
	private Iterable<Personaje> enemigos;
	private TimerMovimiento timerAvisaEnemigos;
	private int puntaje;
	
	private static Partida instance;
	
	
	private Partida(PantallaNivel ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);
		DirectorNivel directorLvl = new DirectorNivel(builder);//TODO cambiar a otro nivel
		directorLvl.armarNivel("src/recursos/layouts/Nivel1.txt");

		miMapa = builder.getNivelArmado();
		player = Jugador.getInstance();
		enemigos = builder.getPerseguidores();
		
		Iterable<Entidad> entidades = miMapa.getTodasLasEntidades();
		LinkedList<EntidadGrafica> entGraficas = new LinkedList<EntidadGrafica>();
		for(Entidad ent : entidades) {
			entGraficas.add(ent.getEntidadGrafica());
		}
		
		pantalla.imprimirMapa(entGraficas, fab.getLevel1Layout());//TODO cambiar al layout de otro lvl
		//TODO tal vez haya que tener atributo tipo fabrica
		
		//Inicializar Timers
		Jugador.getInstance().iniciarTimer();
		
		timerAvisaEnemigos = new TimerMovimiento(this,60);
		Thread hilo = new Thread(timerAvisaEnemigos);
		hilo.start();
		
		
	}
	
	public static Partida getInstance(PantallaNivel ui, FabricaElementos fab) {
		if(instance == null) {
			instance = new Partida(ui,fab);
			System.out.println("bool:"+instance!=null);
		}
		return instance;
	}
	
	public static Partida getInstance() {
		return instance;
	}
	
	public void siguienteNivel() {
		/*
		nivelActual.detenerPersonajes();
		nivelActual = nivelActual.getSiguiente();
		nivelActual.inicializar();
		*/
	}
	
	
	public void spawner() {
		
	}
	
	public void imprimirMapa() {
		
	}
	
	public void perder() {
		
	}
	
	public void victoria() {
		
	}
	
	public void seApretoArriba() {		
		Jugador.getInstance().cambiarDireccion(Jugador.NORTE);
	}
	
	public void seApretoDerecha() {
		player.cambiarDireccion(player.ESTE);
	}
	
	public void seApretoIzquierda() {
		player.cambiarDireccion(player.OESTE);
	}
	
	public void seApretoAbajo() {
		player.cambiarDireccion(player.SUR);
	}
	
	public void seApretoEnter() {
		
	}
	
	public void seApretoEspacio() {
	
	}
	
	public void addPuntaje(int p) {
		puntaje += p;
		pantalla.setPuntacion(puntaje);
		System.out.println("SUMO " + p + " PUNTOS ");
	}
	
	public void moverPerseguidores() {
		for(Personaje per : enemigos) {
			per.avanzar();
		}
	}
	
	public int getVidas() {
		return player.getVidas();
	}

	public void elimnarEntidadGrafica(EntidadGrafica entGrafica) {
		pantalla.eliminarLabel(entGrafica.getLbl());		
	}


}
