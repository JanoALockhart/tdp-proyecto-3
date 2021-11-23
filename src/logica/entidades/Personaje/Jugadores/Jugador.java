 package logica.entidades.Personaje.Jugadores;

import logica.entidades.Personaje.Personaje;
import logica.entidades.entGrafica.JugadorGrafico;
import logica.entidades.visitadores.*;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.partida.Partida;
import main.Main;

public class Jugador<JG extends JugadorGrafico> extends Personaje<JugadorGrafico> {

	protected int cantBombas;
	protected int vidas;
	protected int direccionGuardada;
	protected TimerEfecto miTimerEfecto;
	private static Jugador<JugadorGrafico> instance;
	private Partida miPartida;
	private TimerJugador miTimerJugador;
	
	private Jugador(JugadorGrafico jg, int vel, Mapa map) {
		 super(vel,map);
		 vidas = Integer.parseInt(Main.personajesConfig.getProperty("vidasJugador")); 
		 visi = new VisitadorJugador();		 
		 direccionGuardada = ESTE;
		 cantBombas=0;
		 miObjetoGrafico = jg;
		 this.miTimerEfecto = new TimerEfecto(this);
	}
	
	public static Jugador<JugadorGrafico> getInstance(JugadorGrafico jg, int vel,Mapa map) {
		if(instance == null) {
			instance = new Jugador<JugadorGrafico>(jg,vel,map);
		}
		return instance;
	}
	
	public static Jugador<JugadorGrafico> getInstance() {
		return instance;
	}
	
	public void reestablecerVidas() {
		vidas = Integer.parseInt(Main.personajesConfig.getProperty("vidasJugador")); 
	}
	
	public void perderVida() {
		vidas--;
		System.out.println("vidas Jugador: "+vidas);
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
		Pixel pos;
		if(cantBombas>0) {
			cantBombas--;
			pos = this.getPos();
			Partida.getInstance().crearExplosivo(pos.getX(), pos.getY());
		}
	}
	
	/**
	 * Metodo que suma una bomba al inventario del jugador
	 */
	public void agregarBomba() {
		cantBombas++;
		Partida.getInstance().actualizarBombas(cantBombas);
	}
	
	public void reestablecerBombas() {
		cantBombas=0;
	}
	
	public void AumentarVelocidad(int duracion, int velociadExtra) {
		Thread threadEfectoVelocidad;
		if(miTimerEfecto.isZero()) {
			miTimerEfecto.setTimepo(duracion);
			threadEfectoVelocidad = new Thread(miTimerEfecto);		
			threadEfectoVelocidad.start();		
		}else {
			miTimerEfecto.anotherOne();
		}
		miTimerJugador.setVel(velocidad - velociadExtra);
		miObjetoGrafico.setVeloz(direccion);
	}
	
	public void decrementarVelocidad() {
		miTimerJugador.setVel(velocidad);
		miObjetoGrafico.setNormal(direccion);
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
	
	
	public void colocarEnMapa(Celda cel, Mapa map) {
		miMapa = map;
		Pixel pInic = new Pixel(cel.getX()*cel.getAncho(),cel.getY()*cel.getAlto());
		miObjetoGrafico.setPos(pInic);
		miObjetoGrafico.setPosInicial(pInic); 
		miObjetoGrafico.setNormal(direccion);
		miMapa.colocarEnCeldasQueToca(this);
	}
	
}