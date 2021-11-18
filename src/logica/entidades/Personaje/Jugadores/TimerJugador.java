package logica.entidades.Personaje.Jugadores;

public class TimerJugador extends Thread{
	
	private Jugador miJugador;
	private int vel;
	private boolean continuar;
	
	public TimerJugador(Jugador miJugador, int vel) {
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
				e.printStackTrace();
				System.out.println(e.getMessage());
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
