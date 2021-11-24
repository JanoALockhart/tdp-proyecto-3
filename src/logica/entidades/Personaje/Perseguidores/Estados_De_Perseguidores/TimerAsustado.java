package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import main.Main;

public class TimerAsustado implements Runnable{

	protected int contador;
	protected Perseguidor miPersiguidor;
	protected boolean muerto;
	
	public TimerAsustado(Perseguidor miPerseguidor) {
		this.miPersiguidor = miPerseguidor;
		contador = 0;
		muerto = false;
	}
	
	public void setTimepo(int c){
		contador = c;
	}
	
	@Override
	public void run() {
		muerto = false;
		while(contador > 0 && !muerto) {
			try {
				contador--;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!muerto) {
			miPersiguidor.perseguir();
		}
		muerto = false;
	}
	
	public void anotherOne() {
		contador=Integer.parseInt(Main.personajesConfig.getProperty("tiempoAsustado"));
	}
	
	public boolean isZero() {
		return contador==0;
	}
	
	public void seMurio() {
		muerto = true;
		contador=0;
	}
}
