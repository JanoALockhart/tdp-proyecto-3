package logica.entidades.Personaje.Jugadores;

import main.Main;

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
				System.out.println(contador);
				contador--;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		miJugador.decrementarVelocidad();
	}
	
	public void anotherOne() {
		contador+=Integer.parseInt(Main.personajesConfig.getProperty("duracionSP"));
	}
	
	public boolean isZero() {
		return contador==0;
	}
}
