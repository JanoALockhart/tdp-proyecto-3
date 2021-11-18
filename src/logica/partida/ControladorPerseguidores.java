package logica.partida;

import java.util.LinkedList;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.TimerAsustado;
import main.Main;

public class ControladorPerseguidores {
	private LinkedList<Perseguidor> enemigos;
	private TimerMovimiento timerMov;
	private TimerAsustado timerAsustado;//TODO ver si esto es factible
	
	public ControladorPerseguidores() {
		enemigos = new LinkedList<Perseguidor>();
	}
	
	/**
	 * Agrega un persegidor para que sea controlado por este controlador
	 * @param per Es el perseguidor que se desea agregar
	 */
	public void addPerseguidor(Perseguidor per) {
		enemigos.add(per);
	}
	
	/**
	 * Metodo que asusta a todos los perseguidores y crea un timer
	 * con una cuenta regresiva para que cuando se termine el 
	 * tiempo del efecto vuelvan al estado normal
	 */
	public void asustarPerseguidores() {
		for(Perseguidor per : enemigos) {
			per.asustar();
		}
		//Crear aca el timer de asustarlos
	}
	
	//TODO habria que crear un metodo desasustar
	//para que asi haya un solo thread???
	
	/**
	 * Metodo que comunica a todos los perseguidores que se
	 * muevan un paso.
	 */
	public void moverPerseguidores() {
		for(Perseguidor per : enemigos) {
			per.avanzar();
		}
	}
	
	/**
	 * Provoca que los perseguidores se coloquen en sus posiciones iniciales del mapa
	 */
	public void resetPerseguidores() {
		for(Perseguidor per : enemigos) {
			per.resetearPosInicial();
		}
	}
	
	/**
	 * Inicializa el timer que le indica a los perseguidores moverse
	 */
	public void iniciarTimer() {
		int velEnemigos = Integer.parseInt(Main.personajesConfig.getProperty("velEnemigos"));
		timerMov = new TimerMovimiento(this,velEnemigos);
		Thread hilo = new Thread(timerMov);
		hilo.start();
	}
	
	public void detenerPerseguidores() {
		timerMov.detener();
	}
}
