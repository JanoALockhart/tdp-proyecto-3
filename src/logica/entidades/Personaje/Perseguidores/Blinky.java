package logica.entidades.Personaje.Perseguidores;

import logica.mapa.Celda;
import logica.mapa.Mapa;

import java.util.Properties;

import logica.entidades.Personaje.Perseguidores.Estados_De_Perseguidores.En_Estado_Persiguiendo.BlinkyPersiguiendo;
import logica.entidades.entGrafica.PerseguidorGrafico;
import logica.entidades.visitadores.*;

public class Blinky extends Perseguidor {

	public Blinky(PerseguidorGrafico skin, String img, Celda c, int vel, Mapa map) {
		super(skin, img,c.getAlto(),c.getAlto(),c,vel,map);	
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
		miObjetoGrafico.setNormal(direccion);
	}

	
}
