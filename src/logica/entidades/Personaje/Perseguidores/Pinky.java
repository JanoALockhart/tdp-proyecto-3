package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.PinkyPersiguiendo;
import logica.entidades.visitadores.*;

public class Pinky extends Perseguidor {

	public Pinky(String img, Celda c, int vel, Mapa map) {
		super(img,c.getAlto(),c.getAlto(),c,vel,map);	
		state = new PinkyPersiguiendo(this);    
		visi = new VisitadorPerseguidor();
	}

	@Override
	public void perseguir() {
		state = new PinkyPersiguiendo(this);  
	}
	
	

}
