package logica.entidades.Personaje.Jugadores;

import logica.entidades.entGrafica.JugadorGrafico;
import main.Main;

public class TimerEfecto implements Runnable{
	
	protected Jugador<? extends JugadorGrafico> miJugador;
	protected int contador;
	protected boolean seguir;
	
	public TimerEfecto(Jugador<? extends JugadorGrafico> miJugador) {
		this.miJugador = miJugador;
		this.contador = 0;
		seguir=true;
	}
	
	public void setTimepo(int c){		
		contador = c;
	}
	
	@Override
	public void run() {
		seguir=true;
		while(contador != 0 && seguir) {
			try {
				contador--;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		miJugador.decrementarVelocidad();
	}
	
	public void anotherOne() {
		contador=Integer.parseInt(Main.personajesConfig.getProperty("duracionSP"));
	}
	
	public boolean isZero() {
		return contador==0;
	}
	
	public void detener() {
		seguir = false;
		contador=0;
	}
}
