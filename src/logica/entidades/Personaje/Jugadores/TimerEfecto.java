package logica.entidades.Personaje.Jugadores;

public class TimerEfecto implements Runnable{
	
	protected Jugador miJugador;
	protected boolean continuar;
	protected int contador;
	
	public TimerEfecto(Jugador miJugador) {
		this.miJugador = miJugador;
		this.continuar = true;
		this.contador = 0;
	}
	
	public void setTimepo(int c){
		contador = c;
	}
	
	@Override
	public void run() {
		while(contador != 0) {
			try {
				System.out.println(contador);
//				if(contador == 0) {
//					
//					continuar = false;
//					break;
//				}
				contador--;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		miJugador.decrementarVelocidad();
	}
	
}
