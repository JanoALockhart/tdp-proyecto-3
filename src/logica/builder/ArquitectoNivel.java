package logica.builder;

public class ArquitectoNivel implements BuilderNivel{
	
	private Mapa nivel;
	
	
	public ArquitectoNivel() {
		nivel = new Mapa();
	}


	/**
	 * Metodo que posiciona celdas y entidades para el nivel1
	 */
	public void armarNivel1() {
		
		
	}


	/**
	 * Metodo que posiciona celdas y entidades para el nivel2
	 */
	public void armarNivel2() {
		
		
	}


	
	public void armarNivel3() {
		
		
	}


	@Override
	public Mapa getNivelArmado() {
		return nivel;
	}
	
	public void reset() {
		nivel = new Mapa();
	}
	
}
