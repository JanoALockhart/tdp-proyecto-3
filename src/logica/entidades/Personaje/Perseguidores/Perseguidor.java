package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.StatePerseguidor;
import logica.entidades.visitadores.*;

public abstract class Perseguidor extends Personaje implements Asustable{

	protected Celda celdaObjetivo;
	protected StatePerseguidor state;
	
	public Perseguidor(String img, int width, int height, Celda c,int vel,Mapa map) {
		super(img,width,height,c,vel,map);
		//TODO Elegir state inicial, hacer los distintos estados 
	}
	
	public abstract void chequearDireccion();
	
	public abstract void acceptVisitor(Visitor v);
	
	public abstract Celda calcularObj();
	
	public void avanzar() {
		super.avanzar();
	}
	
	public abstract void asustar();
	
	/**
	 * Utiliza celda.distanciaA para calcular pitagoras
	 * @param c Celda objetivo a la que se quiere llegar
	 * @return
	 */
	public double calcularDis(Celda c) {
		Celda pos = miMapa.getCelda(getX(), getY());
		return pos.distanciaA(c);
	}
	
}
