package logica.partida;

public class TimerMovimiento implements Runnable{
	
	protected Partida miPartida;
	protected int vel;
	protected boolean continuar;
	
	public TimerMovimiento(Partida miPartida, int vel) {
		this.miPartida = miPartida;
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
				miPartida.moverPerseguidores();
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
