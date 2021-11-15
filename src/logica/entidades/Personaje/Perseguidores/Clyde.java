package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.BlinkyPersiguiendo;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.ClydePersiguiendo;
import logica.entidades.visitadores.*;

public class Clyde extends Perseguidor {

	public Clyde(String img, Celda c, int vel, Mapa map) {
		super(img,c.getAlto(),c.getAlto(),c,vel,map);	
		state = new ClydePersiguiendo(this);    
		visi = new VisitadorPerseguidor();
	}

	@Override
	public void perseguir() {
		state = new ClydePersiguiendo(this); 
	}
	


}
