package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.Persiguiendo;
import logica.geometria.Pixel;
import logica.mapa.Celda;
import main.Main;

public class ClydePersiguiendo extends Persiguiendo {
	
	public ClydePersiguiendo(Perseguidor fantasma) {
		super(fantasma);
	}
	
	public Celda calcularCeldaObj(){
		return null;
	}

	@Override
	public Pixel calcularObj() {
		Pixel obj = null;
		Pixel pxJug = Jugador.getInstance().getPos();
		int largoCelda = Integer.parseInt(Main.dimentionConfig.getProperty("altoCelda"));
		double distancia = miFantasma.getPos().distanciaA(pxJug) / (4*largoCelda);
		if( distancia <= 4  )
			obj = pxJug;
		else
			obj = miFantasma.getPosInicial();
		return null;
	}

}
