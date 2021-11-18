package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.Persiguiendo;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import main.Main;

public class PinkyPersiguiendo extends Persiguiendo {
	
	public PinkyPersiguiendo(Perseguidor fantasma) {
		super(fantasma);
	}
	
	public Celda calcularCeldaObj(){
		return null;
	}

	/**
	 * El objetivo de pinky son 4 celdas adelante de pacman
	 * Por lo tanto se tiene que tener en cuenta la direccion
	 * de pacman, luego de eso sumar 4 celdas a su posicion,
	 * ese es el objetivo
	 */
	@Override
	public Pixel calcularObj() {
		int altoCelda = Integer.parseInt(Main.dimentionConfig.getProperty("altoCelda"));
		int anchoCelda = Integer.parseInt(Main.dimentionConfig.getProperty("anchoCelda"));
		
		Pixel obj = null;
		Pixel pxJug = Jugador.getInstance().getPos();
		switch(Jugador.getInstance().getDireccion()) {
			case Jugador.NORTE: 
				obj = new Pixel(pxJug.getX(), pxJug.getY()-4*altoCelda);
				break;
			case Jugador.ESTE:
				obj = new Pixel(pxJug.getX()+4*anchoCelda, pxJug.getY());
				break;
			case Jugador.SUR:
				obj = new Pixel(pxJug.getX(), pxJug.getY()+4*altoCelda);
				break;
			case Jugador.OESTE:
				obj = new Pixel(pxJug.getX()-4*anchoCelda, pxJug.getY());
				break;
			
		}
		return obj;
	}

}
