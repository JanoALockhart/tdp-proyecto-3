 package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.visitadores.*;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.partida.Partida;
import main.Main;

public class Jugador extends Personaje {

	protected int cantBombas;
	protected int vidas;
	protected int direccionGuardada;
	protected TimerEfecto miTimerEfecto;
	private static Jugador instance;
	private Partida miPartida;
	private TimerJugador miTimerJugador;
	
	//private Thread threadEfectoVelocidad;
	
	private Jugador(String img, int width, int height, Celda c, int vel, Mapa map) {
		 super(img,width,height,c,vel,map);
		 vidas = Integer.parseInt(Main.personajesConfig.getProperty("vidasJugador")); 
		 visi = new VisitadorJugador();		 
		 direccionGuardada = ESTE;
		 cantBombas=0;
		 this.miTimerEfecto = new TimerEfecto(this);
	}
	
	public static Jugador getInstance(String img,Celda c, int vel,Mapa map) {
		if(instance == null) {
			instance = new Jugador(img,c.getAncho(),c.getAlto(),c,vel,map);
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
		if(vidas == 0) {
			Partida.getInstance().perder();
		}else {
			Partida.getInstance().quitarVida(vidas);
		}
		
		
	}
	
	public void accept(Visitor v) {		
		v.serAfectadoPor(this);
	}
	
	public void ponerBomaba() {
		if(cantBombas>0) {
			cantBombas--;
			//TODO poner en mapa el explisivo
		}
	}
	
	/**
	 * Metodo que suma una bomba al inventario del jugador
	 */
	public void agregarBomba() {
		cantBombas++;
		Partida.getInstance().actualizarBombas(cantBombas);
	}
	
	public void AumentarVelocidad(int duracion, int velociadExtra) {
		Thread threadEfectoVelocidad;
		if(miTimerEfecto.isZero()) {			 
			threadEfectoVelocidad = new Thread(miTimerEfecto);		
			miTimerEfecto.setTimepo(duracion);	
			threadEfectoVelocidad.start();		
		}else {
			miTimerEfecto.anotherOne();
		}
		miTimerJugador.setVel(velocidad - velociadExtra);
	}
	
	public void decrementarVelocidad() {
		miTimerJugador.setVel(velocidad);
	}

	public void addPuntaje(int p) {
		miPartida.addPuntaje(p);
	}
	
	public void iniciarTimer() {
		miTimerJugador = new TimerJugador(this,velocidad);
		miTimerJugador.start();
	}
	
	public void detener() {
		miTimerJugador.detener();
		miTimerEfecto.detener();
	}
	
	public void avanzar() {
		super.cambiarDireccion(direccionGuardada);
		super.avanzar();
	}
	
	public void cambiarDireccion(int dir) {
		direccionGuardada = dir;
	}
	
	
	//TODO Revisar esto para hacerlo mejor
	public void colocarEnMapa(Celda cel, Mapa map) {
		miMapa = map;
		Pixel pInic = new Pixel(cel.getX()*cel.getAncho(),cel.getY()*cel.getAlto());
		miObjetoGrafico.setPos(pInic);
		posInicial = pInic;
		miMapa.colocarEnCeldasQueToca(this);
	}
}
