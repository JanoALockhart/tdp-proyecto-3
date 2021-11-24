package logica.entidades.Personaje.Jugadores;

import logica.entidades.entGrafica.JugadorGrafico;

public class TimerJugador extends Thread{
	
	private Jugador<? extends JugadorGrafico> miJugador;
	private int vel;
	private boolean continuar;
	
	public TimerJugador(Jugador<? extends JugadorGrafico> miJugador, int vel) {
		this.miJugador = miJugador;
		this.vel = vel;
	}

	public void setVel(int v) {
		vel = v;
	}
	
	@Override
	public void run() {
		continuar = true;
		while(continuar) {
			try {
				Thread.sleep(vel);
				miJugador.avanzar();
			} catch (Exception e) {

			}
		}
		
	}

	public void detener() {
		continuar = false;
	}
	
	public void empezar() {
		continuar = true;
	}
	
}
