package logica.entidades.Personaje;

import logica.entidades.Entidad;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public abstract class Personaje extends Entidad {
	
	protected int direccion;
	protected int velocidad;
	public static final int NORTE = 1;
	public static final int SUR = 2;
	public static final int ESTE = 3;
	public static final int OESTE = 4;
	
	public Personaje(String img, int width, int height, Celda c,int vel) {
		super(img,width,height,c);
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
		//TODO miMapa.verificarMovimiento(direccion);
		return true;
	}
	
	public boolean verificarCambioDireccion() {
		
	}
	
	public void cambiarDireccion(int dir) {
		if(verificarCambio)
		direccion = dir;
	}
	
	public void accept(Visitor v) {
		
	}
	
	
}
