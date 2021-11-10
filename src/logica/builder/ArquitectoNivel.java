package logica.builder;

import logica.entidades.Entidad;
import logica.fabricas.FabricaElementos;
import logica.mapa.*;

public class ArquitectoNivel implements BuilderNivel{
	private FabricaElementos miFabrica;
	private Mapa nivel;
	
	
	public ArquitectoNivel(FabricaElementos fabrica) {
		nivel = new Mapa();
		miFabrica = fabrica;
	}
	
	@Override
	public Mapa getNivelArmado() {
		return nivel;
	}
	
	public void reset() {
		nivel = new Mapa();
	}
	
	/**
	 * Metodo que se encarga de agregar en el nivel, una celda en la posicion
	 * (x,y) pasadas por parámetro, con una entidad, tambien pasada por
	 * parámetro. Si la entidad es null, la celda se crea vacía.
	 * @param entity Es la entidad que estará en la celda. Si es nula,
	 * la celda se creará vacía.
	 * @param x Es la coordenada x de la celda en el mapa.
	 * @param y Es la coordenada y de la celda en el mapa.
	 */
	public void agregarPacDot(int x, int y) throws Exception{
		Celda cel;
		Entidad pac;
		
		cel = miFabrica.construirCelda(x,y);
		pac = miFabrica.construirPacDot(cel,nivel);
		
		cel.add(pac);
		nivel.addContador();
		nivel.agregarCelda(cel);
	}
	
	public void agregarJugador(int x,int y) throws Exception{
		Celda cel;
		Entidad personaje;
		
		cel = miFabrica.construirCelda(x,y);
		personaje = miFabrica.construirJugador(cel,nivel);
		
		cel.add(personaje);
		nivel.agregarCelda(cel);
	}
	
	public void agregarFruta(int x,int y) throws Exception{
		Celda cel;
		Entidad fruta;
		
		cel = miFabrica.construirCelda(x,y);
		fruta = miFabrica.construirFruta(cel,nivel);
		
		cel.add(fruta);
		nivel.agregarCelda(cel);
	}
	
	public void agregarPowerPellet(int x,int y) throws Exception{
		Celda cel;
		Entidad pp;
		
		cel = miFabrica.construirCelda(x,y);
		pp = miFabrica.construirPowerPellet(cel,nivel);
		
		cel.add(pp);
		nivel.agregarCelda(cel);
	}
	
	public void agregarSpeedPotion(int x,int y) throws Exception{
		Celda cel;
		Entidad sp;
		
		cel = miFabrica.construirCelda(x,y);
		sp = miFabrica.construirSpeedPotion(cel,nivel);
		
		cel.add(sp);
		nivel.agregarCelda(cel);
	}
	
	public void agregarBomba(int x,int y) throws Exception{
		Celda cel;
		Entidad bomba;
		
		cel = miFabrica.construirCelda(x,y);
		bomba = miFabrica.construirBomba(cel,nivel);
		
		cel.add(bomba);
		nivel.agregarCelda(cel);
	}
}
