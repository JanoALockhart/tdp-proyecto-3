package logica.entidades.Personaje;

import logica.entidades.Entidad;
import logica.entidades.visitadores.*;

public abstract class Personaje extends Entidad {
	
	private int direccion;
	private int velocidad;
	
	public void avanzar() {
		
	}
	
	private void verificarCambioDeCelda() {

	}
	
	public void cambiarDireccion(int dir) {

	}
	
	public void accept(Visitor v) {
		
	}
	
	
}
