package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import main.Main;

public class TimerAsustado implements Runnable{

	protected int contador;
	protected Perseguidor miPersiguidor;
	
	public TimerAsustado(Perseguidor miPerseguidor) {
		this.miPersiguidor = miPerseguidor;
		contador = 0;
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
		miPersiguidor.perseguir();
	}
	
	public void anotherOne() {
		contador+=Integer.parseInt(Main.personajesConfig.getProperty("tiempoAsustado"));
	}
	
	public boolean isZero() {
		return contador==0;
	}
}
