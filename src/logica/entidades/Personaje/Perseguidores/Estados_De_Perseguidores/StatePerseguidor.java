package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import java.awt.Point;

import logica.entidades.visitadores.*;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public interface StatePerseguidor {

	public void accept(Visitor v);
	
	public Pixel calcularObj();
	
}
