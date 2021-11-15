 package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.partida.Partida;

public class Jugador extends Personaje {

	protected int cantBombas;
	protected int vidas;
	protected int direccionGuardada;
	protected TimerEfecto miTimerEfecto;
	private static Jugador instance;
	private Partida miPartida;
	protected TimerJugador miTimerJugador;
	
	private Jugador(String img, int width, int height, Celda c, int vel, Mapa map) {
		 super(img,width,height,c,vel,map);
		 vidas = 3; //TODO VERIFICAR CANT
		 visi = new VisitadorJugador();		 
		 direccionGuardada = ESTE;
		 this.miTimerJugador = new TimerJugador(this, vel);
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
		//miPartida.reposicionar();
		/*
		 * Hay que reposicionar todo
		 * Resetear posiciones
		 * Eliminar de las celdas que ocupan
		 * y asignar a nuevas celdas
		 */
		if(vidas == 0)
			Partida.getInstance(null, null).perder();
		System.out.println("Se perdio vida");
	}
	
	public void accept(Visitor v) {		
		v.serAfectadoPor(this);
	}
	
	public void ponerBomaba() {
		//TODO IMPLEMENTAR BOMBA
	}
	
	public void AumentarVelocidad(int duracion) {
		
	}

	public void addPuntaje(int p) {
		miPartida.addPuntaje(p);
	}
	
	public void iniciarTimer() {
		Thread hilo = new Thread(miTimerJugador);
		hilo.start();
	}
	
	public void avanzar() {
		super.cambiarDireccion(direccionGuardada);
		super.avanzar();
	}
	
	public void cambiarDireccion(int dir) {
		direccionGuardada = dir;
	}
	
	
	
	//TODO Funca esto?
	//TODO hola?
}
