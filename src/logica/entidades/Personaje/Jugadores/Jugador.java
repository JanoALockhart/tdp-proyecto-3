package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public class Jugador extends Personaje {

	protected int cantBombas;
	protected int vidas;
	protected TimerEfecto miTimerEfecto;
	private static Jugador instance;
	
	private Jugador(String img, int width, int height, Celda c, int vel) {
		 super(img,width,height,c,vel);
		 vidas = 3; //TODO VERIFICAR CANT
		 
	}
	
	public static Jugador getInstance(String img, int width, int height, Celda c, int vel) {
		if(instance == null) {
			instance = new Jugador(img,width,height,c,vel);
		}
		return instance;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void perderVida() {

	}
	
	public void accept(Visitor v) {
		
	}
	
	public void ponerBomaba() {
		
	}
	
	public void AumentarVelocidad(int duracion) {
		
	}
	
}
