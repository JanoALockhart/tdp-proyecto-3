package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.Persiguiendo;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public class InkyPersiguiendo extends Persiguiendo {
	protected Perseguidor miPana;
	
	public InkyPersiguiendo(Perseguidor fantasma, Perseguidor pana) {
		super(fantasma);
		miPana = pana;
	}
	
	public Celda calcularCeldaObj(){
		return null;
	}

	/**
	 * Se obtiene el vector que se forma entra Pacman y Blinky
	 * Origen = Pacman
	 * Fin = Blinky
	 * Una vez obtenidas las diferencias entre el Fin y el Origen
	 * Se multiplica ese resultado (las coordenadas) por -1
	 * Con el fin de rotar 180 grados el vector
	 * Una vez obtenido esta rotacion
	 * Se suman las coordenadas a la posicion de pacman 
	 */
	@Override
	public Pixel calcularObj() {
		Pixel obj = null;
		Pixel pxlJug = Jugador.getInstance().getPos();
		Pixel pxlPana = miPana.getPos();
		int difX = pxlPana.getX() - pxlJug.getX();
		int difY = pxlPana.getY() - pxlJug.getY();
		//Se multiplican las coordenadas del vector obtenido x -1
		//De esta manera se rota el vector 180 grados
		difX *= -1;
		difY *= -1;
		//Se suma este vector rotado a la posicion del pacman para obtener las coordenadas finales
		int posX = pxlJug.getX() + difX;
		int posY = pxlJug.getY() + difY;
		obj = new Pixel(posX, posY);
		return obj;
	}

}
