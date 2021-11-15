package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.Persiguiendo;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public class InkyPersiguiendo extends Persiguiendo {
	
	public InkyPersiguiendo(Perseguidor fantasma) {
		super(fantasma);
	}
	
	public Celda calcularCeldaObj(){
		return null;
	}

	@Override
	public Pixel calcularObj() {
		// TODO Auto-generated method stub
		return null;
	}

}
