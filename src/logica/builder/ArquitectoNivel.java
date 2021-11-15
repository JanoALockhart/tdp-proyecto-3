package logica.builder;

import java.util.LinkedList;

import logica.entidades.Entidad;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.fabricas.FabricaElementos;
import logica.mapa.*;

public class ArquitectoNivel implements BuilderNivel{
	private FabricaElementos miFabrica;
	private Mapa map;
	private LinkedList<Perseguidor> fantasmas;//TODO Revisar
	
	
	public ArquitectoNivel(FabricaElementos fabrica) {
		map = new Mapa();
		miFabrica = fabrica;
		fantasmas = new LinkedList<Perseguidor>();//TODO REvisar
	}
	
	@Override
	public Mapa getNivelArmado() {
		return map;
	}
	
	//TODO REVISAR
	public Iterable<Perseguidor> getPerseguidores(){
		return fantasmas;
	}
	
	public void reset() {
		map = new Mapa();
	}
	
	public void agregarCeldaVacia(int x, int y) throws Exception{
		
		Celda cel = miFabrica.construirCelda(x,y);
		map.agregarCelda(cel);
		
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
		pac = miFabrica.construirPacDot(cel,map);
		
		cel.add(pac);
		map.addContador();
		map.agregarCelda(cel);
	}
	
	public void agregarJugador(int x,int y) throws Exception{
		Celda cel;
		Entidad personaje;
		
		cel = miFabrica.construirCelda(x,y);
		personaje = miFabrica.construirJugador(cel,map);
		
		cel.add(personaje);
		map.agregarCelda(cel);
	}
	
	public void agregarFruta(int x,int y) throws Exception{
		Celda cel;
		Entidad fruta;
		
		cel = miFabrica.construirCelda(x,y);
		fruta = miFabrica.construirFruta(cel,map);
		
		cel.add(fruta);
		map.agregarCelda(cel);
	}
	
	public void agregarPowerPellet(int x,int y) throws Exception{
		Celda cel;
		Entidad pp;
		
		cel = miFabrica.construirCelda(x,y);
		pp = miFabrica.construirPowerPellet(cel,map);
		
		cel.add(pp);
		map.agregarCelda(cel);
	}
	
	public void agregarSpeedPotion(int x,int y) throws Exception{
		Celda cel;
		Entidad sp;
		
		cel = miFabrica.construirCelda(x,y);
		sp = miFabrica.construirSpeedPotion(cel,map);
		
		cel.add(sp);
		map.agregarCelda(cel);
	}
	
	public void agregarBomba(int x,int y) throws Exception{
		Celda cel;
		Entidad bomba;
		
		cel = miFabrica.construirCelda(x,y);
		bomba = miFabrica.construirBomba(cel,map);
		
		cel.add(bomba);
		map.agregarCelda(cel);
	}
	
	public void agregarBlinky(int x, int y) throws Exception{
		Celda cel;
		Perseguidor blinky;
		
		cel = miFabrica.construirCelda(x, y);
		blinky = miFabrica.construirBlinky(cel, map);
		fantasmas.add(blinky);
		
		cel.add(blinky);
		map.agregarCelda(cel);
	}
}
