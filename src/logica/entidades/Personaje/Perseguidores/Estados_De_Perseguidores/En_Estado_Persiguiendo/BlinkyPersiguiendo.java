package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.Persiguiendo;
import logica.geometria.Pixel;

public class BlinkyPersiguiendo extends Persiguiendo {
	
	public BlinkyPersiguiendo(Perseguidor fantasma) {
		super(fantasma);
	}
	
	public Pixel calcularObj(){
		return Jugador.getInstance().getPos();
	}
	

}
