package logica.entidades.Collectibles;

import logica.entidades.*;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.VisitadorCollectible;
import logica.mapa.Celda;
import logica.mapa.Mapa;

public abstract class Collectible extends Entidad<EntidadGrafica> {
	
	public Collectible(EntidadGrafica ent, Mapa m) {
		super(m);
		miObjetoGrafico = ent;
		visi = new VisitadorCollectible();
	}
	
	public abstract void activarEfecto();
}
