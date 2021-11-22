package logica.entidades.Entornos;

import main.Main;

public class TimerExplosion extends Thread {
	protected Explosivo miExplosivo;
	protected int tiempoExplosion, duracionFuego;
	
	public TimerExplosion(Explosivo miExplosivo) {
		this.miExplosivo = miExplosivo;
		tiempoExplosion = Integer.parseInt(Main.personajesConfig.getProperty("tiempoExplosion"));
		duracionFuego = Integer.parseInt(Main.personajesConfig.getProperty("duracionFuego"));
	}
	
	public void run() {
		while(tiempoExplosion != 0) {
			try {
				Thread.sleep(1000);
				tiempoExplosion--;
			}catch(Exception e) {e.printStackTrace();}
		}
		miExplosivo.explotar();
		
		while(duracionFuego != 0) {
			try {
				Thread.sleep(1000);
				duracionFuego--;
			}catch(Exception e) {e.printStackTrace();}
		}
		miExplosivo.apagar();
	}
	
}
