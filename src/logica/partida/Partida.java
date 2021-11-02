/**
 * 
 */
package logica.partida;

import logica.builder.*;
import logica.fabricas.*;
import logica.mapa.Mapa;
import vista.UserInterface;

/** 
 *
 */
public class Partida {
	private UserInterface pantalla;
	private BuilderNivel builder;
	private Mapa miMapa;
	private int puntaje;
	
	
	public Partida(UserInterface ui,FabricaElementos fab) {
		pantalla = ui;
		puntaje = 0;	
		builder = new ArquitectoNivel(fab);
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
