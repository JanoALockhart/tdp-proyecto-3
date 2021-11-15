package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;
import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.BlinkyPersiguiendo;
import logica.entidades.visitadores.*;

public class Blinky extends Perseguidor {

	public Blinky(String img, Celda c, int vel, Mapa map) {
		super(img,c.getAlto(),c.getAlto(),c,vel,map);	
		state = new BlinkyPersiguiendo(this);    
		visi = new VisitadorPerseguidor();
		//pixelObjetivo = state.calcularObj();
	}
	
	@Override
	public void chequearDireccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);//TODO Esto va o lo borramos???
	}


	@Override
	public void perseguir() {
		state = new BlinkyPersiguiendo(this);
	}

	
}
