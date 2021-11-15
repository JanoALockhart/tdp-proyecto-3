package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.BlinkyPersiguiendo;
import logica.entidades.visitadores.*;

public class Blinky extends Perseguidor {

	public Blinky(String img, Celda c, int vel, Mapa map) {
		super(img,c.getAlto(),c.getAlto(),c,vel,map);	
		state = new BlinkyPersiguiendo();    
		visi = new VisitadorPerseguidor();
		//pixelObjetivo = state.calcularObj();
	}
	
	@Override
	public void chequearDireccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public void asustar() {
		// TODO Auto-generated method stub
		
	}

	
}
