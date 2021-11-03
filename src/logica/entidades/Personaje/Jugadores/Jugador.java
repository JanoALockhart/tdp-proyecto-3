package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.visitadores.*;

public class Jugador extends Personaje {

	protected int cantBombas;
	protected int vidas;
	protected TimerEfecto miTimerEfecto;
	protected Jugador intance;
	
	public Jugador() {
		 
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void perderVida() {

	}
	
	public void avanzar() {
		
	} 
	
	public void accept(Visitor v) {
		
	}
	
	public void ponerBomaba() {
		
	}
	
	public void AumentarVelocidad(int duracion) {
		
	}
	
	public Jugador getInstance() {
		return this;
	}
}
