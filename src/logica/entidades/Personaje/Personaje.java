package logica.entidades.Personaje;

import logica.entidades.Entidad;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;
import logica.mapa.Mapa;

public abstract class Personaje extends Entidad {
	
	protected int direccion;
	protected int velocidad;
	public static final int NORTE = 1;
	public static final int SUR = 2;
	public static final int ESTE = 3;
	public static final int OESTE = 4;
	
	public Personaje(String img, int width, int height, Celda c,int vel,Mapa map) {
		super(img,width,height,c,map);
		velocidad = vel;
		direccion = ESTE;
	}
	
	public void avanzar() {
		switch(direccion) {
			case NORTE:
				if(verificarCambioDeCelda()) {
					moverNorte();
					//TODO MAPA DEBE CHEQUEAR COLISIONES
				}
				break;
			case SUR:
				if(verificarCambioDeCelda()) {
					moverSur();
					//TODO MAPA DEBE CHEQUEAR COLISIONES
				}
				break;
			case ESTE:
				if(verificarCambioDeCelda()) {
					moverEste();
					//TODO MAPA DEBE CHEQUEAR COLISIONES
				}
				break;
			case OESTE:
				if(verificarCambioDeCelda()) {
					moverOeste();
					//TODO MAPA DEBE CHEQUEAR COLISIONES
				}
				break;
		}
	}
	
	public int getDireccion() {return direccion;}
	
	public boolean verificarCambioDeCelda() {
		return miMapa.verificarMovimiento(direccion,miObjetoGrafico.getRect());
	}
	
	public boolean verificarCambioDireccion(int dir) {
		return miMapa.verificarMovimiento(dir,miObjetoGrafico.getRect());
	}
	
	public void cambiarDireccion(int dir) {
		if(verificarCambioDireccion(dir))
			direccion = dir;
	}
	
	public void accept(Visitor v) {
		
	}
	
	
}
