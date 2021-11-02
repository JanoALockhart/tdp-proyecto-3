/**
 * 
 */
package logica.partida;

import logica.builder.*;
import logica.fabricas.*;
import logica.mapa.Mapa;
import vista.*;
/** 
 *
 */
public class Partida {
	private State pantalla;
	private BuilderNivel builder;
	private Mapa miMapa;
	private int puntaje;
	
	
	public Partida(State ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);
		builder.armarNivel1();
		miMapa = builder.getNivelArmado();
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
