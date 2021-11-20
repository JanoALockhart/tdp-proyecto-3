package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.InkyPersiguiendo;
import logica.entidades.entGrafica.PerseguidorGrafico;
import logica.entidades.visitadores.*;

public class Inky extends Perseguidor {
	
	public Blinky miPana;

	public Inky(PerseguidorGrafico skin, int vel, Mapa map, Blinky miPana ) {
		super(skin,vel,map);	
		state = new InkyPersiguiendo(this);    
		visi = new VisitadorPerseguidor();
		this.miPana = miPana;
	}

	@Override
	public void perseguir() {
		state = new InkyPersiguiendo(this);
		miObjetoGrafico.setNormal(direccion);
	}
	

}
