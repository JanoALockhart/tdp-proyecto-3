/**
 * 
 */
package logica.partida;

import java.util.LinkedList;

import logica.builder.*;
import logica.entidades.*;
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
	private int puntaje;
	
	private static Partida instance;
	
	
	private Partida(PantallaNivel ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);
		DirectorNivel directorLvl = new DirectorNivel(builder);//TODO cambiar a otro nivel
		directorLvl.armarNivel("src/recursos/layouts/Nivel1.txt");

		miMapa = builder.getNivelArmado();
		player = Jugador.getInstance(null, null, 0, null); //TODO cuidado con la construccion de las cosas...
		
		Iterable<Entidad> entidades = miMapa.getTodasLasEntidades();
		LinkedList<EntidadGrafica> entGraficas = new LinkedList<EntidadGrafica>();
		for(Entidad ent : entidades) {
			entGraficas.add(ent.getEntidadGrafica());
		}
		
		pantalla.imprimirMapa(entGraficas, fab.getLevel1Layout());//TODO cambiar al layout de otro lvl
		//TODO tal vez haya que tener atributo tipo fabrica
	}
	
	public static Partida getInstance(PantallaNivel ui, FabricaElementos fab) {
		if(instance == null) {
			instance = new Partida(ui,fab);
		}
		return instance;
	}
	
	public static Partida getInstance() {
		return instance;
	}
	
	public void siguienteNivel() {
		
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
		player.cambiarDireccion(player.NORTE);
		player.avanzar();
	}
	
	public void seApretoDerecha() {
		player.cambiarDireccion(player.ESTE);
		player.avanzar();
	}
	
	public void seApretoIzquierda() {
		player.cambiarDireccion(player.OESTE);
		player.avanzar();
	}
	
	public void seApretoAbajo() {
		player.cambiarDireccion(player.SUR);
		player.avanzar();
	}
	
	public void seApretoEnter() {
		
	}
	
	public void seApretoEspacio() {
		player.avanzar();
	}
	
	public void addPuntaje(int p) {
		puntaje += p;
		System.out.println("SUMO " + p + " PUNTOS ");
	}
	
	public void moverPerseguidores() {
		
	}
	
	public int getVidas() {
		return player.getVidas();
	}


}
