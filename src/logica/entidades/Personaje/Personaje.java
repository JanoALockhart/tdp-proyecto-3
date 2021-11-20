package logica.entidades.Personaje;

import java.awt.Rectangle;

import logica.entidades.Entidad;
import logica.entidades.entGrafica.PersonajeGrafico;
import logica.entidades.visitadores.*;
import logica.geometria.HitBox;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import logica.mapa.Mapa;

public abstract class Personaje<PG extends PersonajeGrafico> extends Entidad<PG> {
	
	protected int direccion;
	protected int velocidad;
	public static final int NORTE = 0;
	public static final int SUR = 2;
	public static final int ESTE = 1;
	public static final int OESTE = 3;
	
	public Personaje(int vel, Mapa map) {
		super(map);
		velocidad = vel;
		direccion = ESTE;
	}
	
		public void moverNorte() {
			miObjetoGrafico.moverNorte();
		}

		public void moverSur() {
			miObjetoGrafico.moverSur();
		}
		
		public void moverEste() {
			miObjetoGrafico.moverEste();
		}
		
		public void moverOeste() {
			miObjetoGrafico.moverOeste();
		}
	
	/**
	 * Metodo que mueve la entidad en la dirección que tiene
	 * actualmente (si es posible), envía a Mapa su hitbox previa al
	 * movimiento y la nueva hitbox para que la entidad sea 
	 * referenciada por las celdas que toca y le comunica a mapa que
	 * efectúe las colisiones.
	 */
	public void avanzar() {
		HitBox oldHitbox = miObjetoGrafico.getRect();//Se crea una copia antigua de la hitbox
		switch(direccion) {
			case NORTE:
				if(verificarCambioDeCelda()) {
					moverNorte();
				}
				break;
			case SUR:
				if(verificarCambioDeCelda()) {
					moverSur();
				}
				break;
			case ESTE:
				if(verificarCambioDeCelda()) {
					moverEste();
				}
				break;
			case OESTE:
				if(verificarCambioDeCelda()) {
					moverOeste();
				}
				break;
		}
		miMapa.reposicionar(this, oldHitbox);
		miMapa.efectuarColisiones(this);
	}
	
	public int getDireccion() {return direccion;}
	
	public boolean verificarCambioDeCelda() {
		return miMapa.verificarMovimiento(direccion,miObjetoGrafico.getRect());
	}
	
	/**
	 * Metodo que verifica si se puede girar en la direccion indicada.
	 * Es decir, que luego de girar, pueda avanzar.
	 * @param dir Es la direccion en la que se quiere girar el personaje
	 * @return True si puede girar, false en caso contrario
	 */
	public boolean verificarCambioDireccion(int dir) {
		return miMapa.verificarMovimiento(dir,miObjetoGrafico.getRect());
	}
	
	public void cambiarDireccion(int dir) {
		if(verificarCambioDireccion(dir)) {
			direccion = dir;
			miObjetoGrafico.rotarSprite(dir);
		}
			
	}
	
	public void resetearPosInicial() {
		HitBox hitBox = miObjetoGrafico.getRect();
		miObjetoGrafico.setPos(miObjetoGrafico.getPosInicial());
		miObjetoGrafico.setNormal(direccion);
		miMapa.reposicionar(this, hitBox);
		//Por métodos como este se tuvieron que usar wildcards (?) en la genericidad para evitar casteo
		/**
		 * The method reposicionar(Entidad<EntidadGrafica>, HitBox) in the type Mapa is not applicable 
		 * for the arguments (Entidad<EG>, HitBox)
		 */
	}
	
	public abstract void accept(Visitor v);
	
	
}
