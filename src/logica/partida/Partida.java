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
	
	
	public Partida(PantallaNivel ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);
		builder.armarNivel1();//TODO cambiar a otro nivel
		miMapa = builder.getNivelArmado();
		player = Jugador.getInstance(null, null, puntaje, null); //TODO cuidado con la construccion de las cosas...
		
		Iterable<Entidad> entidades = miMapa.getTodasLasEntidades();
		LinkedList<EntidadGrafica> entGraficas = new LinkedList<EntidadGrafica>();
		for(Entidad ent : entidades) {
			entGraficas.add(ent.getEntidadGrafica());
		}
		
		pantalla.imprimirMapa(entGraficas, fab.getLevel1Layout());//TODO cambiar al layout de otro lvl
		//TODO tal vez haya que tener atributo tipo fabrica
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
		
	}
	
	public void seApretoDerecha() {
		
	}
	
	public void seApretoIzquierda() {
		
	}
	
	public void seApretoAbajo() {
		
	}
	
	public void seApretoEnter() {
		
	}
	
	public void seApretoEspacio() {
		player.avanzar();
	}
	
	public void addPuntaje() {
		
	}
	
	public void moverPerseguidores() {
		
	}
	
	public int getVidas() {
		return player.getVidas();
	}


}
