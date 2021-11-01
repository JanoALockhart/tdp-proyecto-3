package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.visitadores.Visitor;
import logica.mapa.Celda;

public class Asustado implements StatePerseguidor {

	protected TimerAsustado miTimerAsustado;
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Celda calcularObj() {
		// TODO Auto-generated method stub
		return null;
	}

}
