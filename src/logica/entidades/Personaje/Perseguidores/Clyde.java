package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.BlinkyPersiguiendo;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.ClydePersiguiendo;
import logica.entidades.entGrafica.PerseguidorGrafico;
import logica.entidades.visitadores.*;

public class Clyde extends Perseguidor {

	public Clyde(PerseguidorGrafico skin, String img, Celda c, int vel, Mapa map) {
		super(skin, img,c.getAlto(),c.getAlto(),c,vel,map);	
		state = new ClydePersiguiendo(this);    
		visi = new VisitadorPerseguidor();
	}

	@Override
	public void perseguir() {
		state = new ClydePersiguiendo(this); 
		miObjetoGrafico.setNormal(direccion);
	}
	


}
