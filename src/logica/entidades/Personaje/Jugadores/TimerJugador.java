package logica.entidades.Personaje.Jugadores;

public class TimerJugador implements Runnable{
	
	protected Jugador miJugador;
	protected int vel;
	protected boolean continuar;
	
	public TimerJugador(Jugador miJugador, int vel) {
		this.miJugador = miJugador;
		this.vel = vel;
		continuar = true;
	}

	public void setVel(int v) {
		vel = v;
	}
	
	@Override
	public void run() {
		while(continuar) {
			try {
				Thread.sleep(vel);
				miJugador.avanzar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public void detener() {
		continuar = false;
	}
	
	public void empezar() {
		continuar = true;
		run();
	}
	
}
