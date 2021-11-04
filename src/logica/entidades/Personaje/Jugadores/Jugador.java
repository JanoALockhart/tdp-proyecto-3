package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;
import logica.mapa.Mapa;

public class Jugador extends Personaje {

	protected int cantBombas;
	protected int vidas;
	protected TimerEfecto miTimerEfecto;
	private static Jugador instance;
	
	private Jugador(String img, int width, int height, Celda c, int vel, Mapa map) {
		 super(img,width,height,c,vel,map);
		 vidas = 3; //TODO VERIFICAR CANT
		 
	}
	
	public static Jugador getInstance(String img,Celda c, int vel,Mapa map) {
		if(instance == null) {
			instance = new Jugador(img,c.getAncho(),c.getAlto(),c,vel,map);
			System.out.println("h:"+c.getAncho()+",w:"+c.getAncho());
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
