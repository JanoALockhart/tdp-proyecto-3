package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.StatePerseguidor;
import logica.entidades.visitadores.*;

public abstract class Perseguidor extends Personaje implements Asustable{

	protected Celda celdaObjetivo;
	protected StatePerseguidor state;
	
	
	public abstract void chequearDireccion();
	
	public abstract void acceptVisitor(Visitor v);
	
	public abstract Celda calcularObj();
	
	public abstract void avanzar();
	
	public abstract void asustar();
	
}
