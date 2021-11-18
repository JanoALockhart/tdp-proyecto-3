package logica.builder;


import logica.entidades.Entidad;
import logica.entidades.Personaje.Perseguidores.Perseguidor;
import logica.fabricas.FabricaElementos;
import logica.mapa.*;
import logica.partida.ControladorPerseguidores;

/** 
 * Esta clase tiene la responsabilidad de brindar los métodos
 * necesarios para posicionar elementos en el mapa.
 */
public class ArquitectoNivel implements BuilderNivel{
	private FabricaElementos miFabrica;
	private Mapa map;
	private ControladorPerseguidores mentePerseguidores;
	
	
	/**
	 * Constructior del arquitecto nivel
	 * @param fabrica
	 */
	public ArquitectoNivel(FabricaElementos fabrica) {
		map = new Mapa();
		miFabrica = fabrica;
		mentePerseguidores = new ControladorPerseguidores();
	}
	
	/**
	 * Metodo que devuelve la instancia de mapa armada 
	 * hasta el momento
	 * @return Devuelve el mapa armado hasta el momento.
	 */
	public Mapa getNivelArmado() {
		return map;
	}
	
	public ControladorPerseguidores getMentePerseguidores() {
		return mentePerseguidores;
	}
	
	public void reset() {
		map = new Mapa();
	}
	
	public void agregarCeldaVacia(int x, int y) throws Exception{
		
		Celda cel = miFabrica.construirCelda(x,y);
		map.agregarCelda(cel);
		
	}
	
	public void agregarPacDot(int x, int y) throws Exception{
		Celda cel;
		Entidad pac;
		
		cel = miFabrica.construirCelda(x,y);
		pac = miFabrica.construirPacDot(cel,map);
		
		cel.add(pac);
		map.addContador();
		map.agregarCelda(cel);
	}
	
	//TODO revisar para hacer mejor
	//Tal vez metodo posicionar en mapa como el de Jugador pero a todas las entidades
	public void agregarJugador(int x,int y) throws Exception{
		Celda cel;
		Entidad personaje;
		
		cel = miFabrica.construirCelda(x,y);
		map.agregarCelda(cel);
		personaje = miFabrica.construirJugador(cel,map);
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
		mentePerseguidores.addPerseguidor(blinky);
		
		cel.add(blinky);
		map.agregarCelda(cel);
	}
}
