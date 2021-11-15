package logica.entidades.Personaje.Jugadores;

public class TimerEfecto implements Runnable{
	
	protected Jugador miJugador;
	protected int contador;
	
	public TimerEfecto(Jugador miJugador) {
		this.miJugador = miJugador;
		this.contador = 0;
	}
	
	public void setTimepo(int c){
		contador = c;
	}
	
	@Override
	public void run() {
		while(contador != 0) {
			try {
				contador--;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		miJugador.decrementarVelocidad();
	}
	
}
