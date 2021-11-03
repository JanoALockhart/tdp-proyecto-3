/**
 * 
 */
package logica.partida;

import java.util.LinkedList;

import logica.builder.*;
import logica.entidades.*;
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
	private int puntaje;
	
	
	public Partida(PantallaNivel ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);
		builder.armarNivel1();
		miMapa = builder.getNivelArmado();
		
		Iterable<Entidad> entidades = miMapa.getTodasLasEntidades();
		LinkedList<EntidadGrafica> entGraficas = new LinkedList<EntidadGrafica>();
		for(Entidad ent : entidades) {
			entGraficas.add(ent.getEntidadGrafica());
		}
		
		pantalla.imprimirMapa(entGraficas);
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
	
	public void addPuntaje() {
		
	}
	
	public void moverPerseguidores() {
		
	}


}
