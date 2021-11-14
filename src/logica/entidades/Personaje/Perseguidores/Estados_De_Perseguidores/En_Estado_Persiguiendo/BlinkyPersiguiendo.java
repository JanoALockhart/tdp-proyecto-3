package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo;

import java.awt.Point;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.Persiguiendo;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public class BlinkyPersiguiendo extends Persiguiendo {
	
	public BlinkyPersiguiendo() {
		
	}
	
	public Pixel calcularObj(){
		System.out.println("calcularCeldaObj:"+Jugador.getInstance().getPos()!=null);
		return Jugador.getInstance().getPos();
	}
	

}
