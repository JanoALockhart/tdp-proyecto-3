package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.visitadores.*;

public class Blinky extends Perseguidor {

	public Blinky(String img, int width, int height, Celda c, int vel, Mapa map) {
		super(img,width,height,c,vel,map);
		celdaObjetivo = calcularObj();
	}
	
	@Override
	public void chequearDireccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptVisitor(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public Celda calcularObj() {
		Celda c = miMapa.getPosicionJugador();
		return c;
	}

	@Override
	public void avanzar() {
		
	}

	@Override
	public void asustar() {
		// TODO Auto-generated method stub
		
	}

	
}
