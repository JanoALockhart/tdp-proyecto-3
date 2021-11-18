package logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores;

import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.entidades.visitadores.Visitor;
import logica.geometria.Pixel;
import logica.mapa.Celda;

public class Muerto extends StatePerseguidor {

	public Muerto(Perseguidor fantasma) {
		super(fantasma);
	}

	@Override
	public Pixel calcularObj() {
		// TODO SERIA VOLVER A LA CASA
		if(miFantasma.getPosInicial().equals(miFantasma.getPos())) {
			miFantasma.perseguir();
		}
		return miFantasma.getPosInicial();
	}

	@Override
	public void activarEfecto() {
		//NO HAY EFECTO CUANDO SE COLISIONA CON UN FANTASMA MUERTO
	}

}
