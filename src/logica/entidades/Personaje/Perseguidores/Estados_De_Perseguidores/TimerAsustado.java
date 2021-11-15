package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

public class TimerAsustado implements Runnable{

	protected int contador;
	
	public TimerAsustado() {
		
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
		
	}
	
}
