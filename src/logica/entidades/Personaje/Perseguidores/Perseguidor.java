package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;

import java.awt.Point;

import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.StatePerseguidor;
import logica.entidades.visitadores.*;
import logica.geometria.Pixel;

public abstract class Perseguidor extends Personaje implements Asustable{

	protected Pixel pixelObjetivo;
	protected StatePerseguidor state;
	
	public Perseguidor(String img, int width, int height, Celda c,int vel,Mapa map) {
		super(img,width,height,c,vel,map);
		//TODO Elegir state inicial, hacer los distintos estados 
	}
	
	public void chequearDireccion() {
		
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void activarEfecto() {
		state.activarEfecto();
	}
	
	public void avanzar() {
		Pixel pixel = state.calcularObj();
		int dirCalculada = calcularDirObjetivo(pixel);
		
		
		cambiarDireccion(dirCalculada);
		//Ultima operacion, el fantasma debe usar el avanzar de la clase Personaje
		super.avanzar();
	}
	
	private int calcularDirObjetivo(Pixel pixelObj) {
		int dirAux;
		int dirFinal = NORTE;
		double distanciaMinima =  Double.MAX_VALUE;
		double dist;
		Pixel pxlCircundantes[] = new Pixel[4];
		Pixel actual = this.getPos();
		pxlCircundantes[NORTE] = new Pixel(actual.getX(),actual.getY()-1); //norte
		pxlCircundantes[ESTE] = new Pixel(actual.getX()+1,actual.getY()); //este
		pxlCircundantes[SUR] = new Pixel(actual.getX(),actual.getY()+1); //sur
		pxlCircundantes[OESTE] = new Pixel(actual.getX()-1,actual.getY()); //oeste
		
		for(dirAux = NORTE; dirAux<pxlCircundantes.length; dirAux++) {
			dist = pxlCircundantes[dirAux].distanciaA(pixelObj);
			//El unico problema que tiene esto es cuando hay mas celdas juntas que uno de ancho
			if(dist<distanciaMinima && miMapa.verificarMovimiento(dirAux, getHitbox()) && dirAux!=(getDireccion()+2)%4) {
				distanciaMinima = dist;
				dirFinal = dirAux;
			}
		}
		
		return dirFinal;
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
	
	public void rotar180() {
		switch(direccion) {
		case Personaje.NORTE:
			direccion = Personaje.SUR;
			break;
		case Personaje.SUR:
			direccion = Personaje.NORTE;
			break;
		case Personaje.ESTE:
			direccion = Personaje.OESTE;
			break;
		case Personaje.OESTE:
			direccion = Personaje.ESTE;
			break;
				
		}
	}
	
	
	
	public StatePerseguidor getState() {return state;}
}
