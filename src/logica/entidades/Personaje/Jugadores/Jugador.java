package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.partida.Partida;

public class Jugador extends Personaje {

	protected int cantBombas;
	protected int vidas;
	protected TimerEfecto miTimerEfecto;
	private static Jugador instance;
	private Partida miPartida;
	
	private Jugador(String img, int width, int height, Celda c, int vel, Mapa map) {
		 super(img,width,height,c,vel,map);
		 vidas = 3; //TODO VERIFICAR CANT
		 visi = new VisitadorJugador();
	}
	
	public static Jugador getInstance(String img,Celda c, int vel,Mapa map) {
		if(instance == null) {
			instance = new Jugador(img,c.getAncho(),c.getAlto(),c,vel,map);
			System.out.println("h:"+c.getAncho()+",w:"+c.getAncho());
		}
		return instance;
	}
	
	public static Jugador getInstance() {
		return instance;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void perderVida() {
		vidas--;
		if(vidas == 0)
			Partida.getInstance(null, null).perder();
	}
	
	public void accept(Visitor v) {		
		v.serAfectadoPor(this);
	}
	
	public void ponerBomaba() {
		
	}
	
	public void AumentarVelocidad(int duracion) {
		
	}

	public void addPuntaje(int p) {
		miPartida.addPuntaje(p);
	}
	
	//TODO Funca esto?
	//TODO hola?
}
