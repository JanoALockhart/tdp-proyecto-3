package logica.entidades.Personaje.Jugadores;

public class TimerEfecto implements Runnable{
	
	protected Jugador miJugador;
	protected boolean continuar;
	protected int contador;
	
	public TimerEfecto(Jugador miJugador,int contador) {
		this.miJugador = miJugador;
		this.continuar = true;
		this.contador = contador;
	}
	
	@Override
	public void run() {
		while(continuar) {
			try {
				Thread.sleep(1000);
				if(contador == 0) {
					continuar = false;
				}
				contador--;
				miJugador.avanzar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
