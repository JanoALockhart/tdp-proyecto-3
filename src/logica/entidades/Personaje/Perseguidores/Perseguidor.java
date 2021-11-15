package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;

import java.awt.Point;

import logica.entidades.Personaje.Personaje;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.StatePerseguidor;
import logica.entidades.visitadores.*;
import logica.geometria.Pixel;

import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.*;

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
		super.avanzar();
	}
	
	private int calcularDirObjetivo(Pixel pixelObj) {
		int dirFinal = NORTE;
		
		int dirAux;
		double distanciaMinima =  Double.MAX_VALUE;
		double dist;
		int cantDescartadas = 0;
		
		Pixel pxlCircundantes[] = new Pixel[4];
		Pixel actual = this.getPos();
		pxlCircundantes[NORTE] = new Pixel(actual.getX(),actual.getY()-1); //norte
		pxlCircundantes[ESTE] = new Pixel(actual.getX()+1,actual.getY()); //este
		pxlCircundantes[SUR] = new Pixel(actual.getX(),actual.getY()+1); //sur
		pxlCircundantes[OESTE] = new Pixel(actual.getX()-1,actual.getY()); //oeste
		
		//Por cada pixel en cada direccion, evaluar cual es la mejor posible
		for(dirAux = NORTE; dirAux<pxlCircundantes.length; dirAux++) {
			dist = pxlCircundantes[dirAux].distanciaA(pixelObj);
			//Si se puede ir en la direccion dirAux, no es la direccion opuesta a la del fantasma y tiene la menor distancia al objetivo...
			if(miMapa.verificarMovimiento(dirAux, getHitbox()) && dirAux!=(getDireccion()+2)%4 && dist<distanciaMinima) {
				distanciaMinima = dist;
				dirFinal = dirAux;
			}else {
				cantDescartadas++;
			}
		}
		
		//Si se descartaron las cuatro direcciones, esta en un callejon sin salida.
		//Entonces tiene que volver por donde vino ()
		if(cantDescartadas==4) {
			rotar180();
			dirFinal = direccion;
		}
		
		return dirFinal;
	}
	
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
	
	
	//ESTADOS 
	/**
	 * Estado asustado,
	 * En este estado elije un camino random;
	 * Si es tocado en este estado,
	 * Se pasa al estado muerto
	 * Si sobrevive, pasa al estado perseguir
	 * 
	 */
	public void asustar() {
		StatePerseguidor estadoViejo = state;
		state = new Asustado(this);//Por aca se deberia utilizar el timer
	}
	
	public void desAsustar() {
		
	}
	
	/**
	 * Dependiendo el fantasma se le asigna un perseguir distinto
	 */
	public abstract void perseguir();
	
	/**
	 * El fantasma entra en estado muerto;
	 * vuelve a su casilla,
	 * y se resetea su estado a perseguidor
	 * 
	 */
	public void morir() {
		//TODO implementar
//		if(pos == casilla de muerto) {
//			perseguir()
//		}
	}
	
	
	public StatePerseguidor getState() {return state;}
}
