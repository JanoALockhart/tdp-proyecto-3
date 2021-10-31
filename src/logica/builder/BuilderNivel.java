package logica.builder;

import logica.mapa.Mapa;

public interface BuilderNivel {

	public void reset();
	public void armarNivel1();
	public void armarNivel2();
	public void armarNivel3();
	public Mapa getNivelArmado();
	
}
