package logica.entidades.Entornos;

import logica.entidades.Entidad;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.VisitadorEntorno;
import logica.mapa.Mapa;

public abstract class Entorno extends Entidad<EntidadGrafica> {
	public abstract void activarEfecto();
	
	public Entorno(EntidadGrafica ent, Mapa map) {
		super(map);
		miObjetoGrafico = ent;
		visi = new VisitadorEntorno();
	}
	
	
}
