package logica.entidades.Personaje;

import logica.entidades.Entidad;
import logica.entidades.visitadores.*;
import logica.mapa.Celda;

public abstract class Personaje extends Entidad {
	
	protected int direccion;
	protected int velocidad;
	protected static final int NORTE = 1;
	protected static final int SUR = 2;
	protected static final int ESTE = 3;
	protected static final int OESTE = 4;
	
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
	
	public boolean verificarCambioDeCelda() {
		miMapa.verificarMovimiento(direccion);
	}
	
	public void cambiarDireccion(int dir) {
		direccion = dir;
	}
	
	public void accept(Visitor v) {
		
	}
	
	
}
