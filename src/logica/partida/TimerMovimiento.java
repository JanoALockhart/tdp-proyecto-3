package logica.partida;

/**
 *  La clase TimerMovimiento tiene la responsabilidad
 *  de avisar a la partida cada cierto tiempo que
 *  le envie mensaje a los perseguidores para que 
 *  se muevan.
 */
public class TimerMovimiento implements Runnable{
	
	protected ControladorPerseguidores menteEnemigos;
	protected int vel;
	protected boolean continuar;
	
	/**
	 * Constructor TimerMovimiento
	 * @param miPartida Es la partida a la que se le avisa
	 * que mueva los perseguidores.
	 * @param vel Es la cantidad de tiempo entre avisos a la partida.
	 */
	public TimerMovimiento(ControladorPerseguidores mente, int vel) {
		menteEnemigos = mente;
		this.vel = vel;
		continuar = true;
	}

	/**
	 * Metodo que establece el tiempo entre avisos.
	 * @param v Es la cantidad de tiempo entre avisos
	 */
	public void setVel(int v) {
		vel = v;
	}
	
	@Override
	public void run() {
		while(continuar) {
			try {
				Thread.sleep(vel);
				menteEnemigos.moverPerseguidores();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * Metodo que termina la ejecucion del método run
	 */
	public void detener() {
		continuar = false;
	}
	
	/**
	 * Metodo que ejecuta el metodo run
	 */
	public void empezar() {
		continuar = true;
		run();
	}
	
}
