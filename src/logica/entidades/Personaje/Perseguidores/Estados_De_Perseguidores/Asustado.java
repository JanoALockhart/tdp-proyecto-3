package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.visitadores.Visitor;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import logica.partida.Partida;

public class Asustado extends StatePerseguidor {

	protected TimerAsustado miTimerAsustado;
	
	
	public Asustado(Perseguidor fantasma) {
		super(fantasma);
	}

	@Override
	public Pixel calcularObj() {
		//TODO se elije un pixel random
		return null;
	}


	@Override
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(200);
		miFantasma.morir();
	}

}
