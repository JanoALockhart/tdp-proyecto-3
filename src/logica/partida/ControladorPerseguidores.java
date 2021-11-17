package logica.partida;

import java.util.LinkedList;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.TimerAsustado;

public class ControladorPerseguidores {
	private LinkedList<Perseguidor> enemigos;
	private TimerMovimiento timerMov;
	private TimerAsustado timerAsustado;
	
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
	
	/**
	 * Metodo que comunica a todos los perseguidores que se
	 * muevan un paso.
	 */
	public void moverPerseguidores() {
		for(Perseguidor per : enemigos) {
			per.avanzar();
		}
	}
	
	public void resetPerseguidores() {
		for(Perseguidor per : enemigos) {
			per.resetearPosInicial();
		}
	}
	
	public void iniciarTimer() {
		//TODO crear aca el timer de movimiento
	}
	
	public void detenerPerseguidores() {
		//TODO destruir? o pausar el timer de movimiento
	}
}
