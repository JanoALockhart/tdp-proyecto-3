package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public interface StatePerseguidor {

	public void accept(Visitor v);
	
	public Celda calcularObj();
	
}
