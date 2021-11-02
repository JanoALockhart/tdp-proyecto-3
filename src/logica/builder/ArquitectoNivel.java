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


	/**
	 * Metodo que posiciona celdas y entidades para el nivel1
	 */
	public void armarNivel1() {
		try {
			agregarCeldasCon(miFabrica.construirPacDot(),1,1,9,1);
			agregarCeldasCon(miFabrica.construirPacDot(),11,1,19,1);
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,2,1,3);
			agregarCeldasCon(miFabrica.construirPacDot(),4,2,4,3);
			agregarCeldasCon(miFabrica.construirPacDot(),9,2,9,3);
			agregarCeldasCon(miFabrica.construirPacDot(),11,2,11,3);
			agregarCeldasCon(miFabrica.construirPacDot(),16,2,16,3);
			agregarCeldasCon(miFabrica.construirPacDot(),19,2,19,3);
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,4,19,4);
			
			agregarCeldaCon(miFabrica.construirPacDot(),1,5);
			agregarCeldaCon(miFabrica.construirPacDot(),4,5);
			agregarCeldaCon(miFabrica.construirPacDot(),6,5);
			agregarCeldaCon(miFabrica.construirPacDot(),14,5);
			agregarCeldaCon(miFabrica.construirPacDot(),16,5);
			agregarCeldaCon(miFabrica.construirPacDot(),19,5);
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,6,4,6);
			agregarCeldasCon(miFabrica.construirPacDot(),6,6,9,6);
			agregarCeldasCon(miFabrica.construirPacDot(),11,6,14,6);
			agregarCeldasCon(miFabrica.construirPacDot(),16,6,19,6);
			
			agregarCeldaCon(miFabrica.construirPacDot(),4,7);
			agregarCeldaCon(miFabrica.construirPacDot(),9,7);
			agregarCeldaCon(miFabrica.construirPacDot(),11,7);
			agregarCeldaCon(miFabrica.construirPacDot(),16,7);
			
			agregarCeldaCon(miFabrica.construirPacDot(),4,8);
			agregarCeldaCon(miFabrica.construirPacDot(),16,8);
			agregarCeldasCon(miFabrica.construirPacDot(),6,8,14,8);
			
			agregarCeldasCon(miFabrica.construirPacDot(),4,9,4,10);
			agregarCeldasCon(miFabrica.construirPacDot(),6,9,6,10);
			agregarCeldasCon(miFabrica.construirPacDot(),14,9,14,10);
			agregarCeldasCon(miFabrica.construirPacDot(),16,9,16,10);
		
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,11,6,11);
			agregarCeldasCon(miFabrica.construirPacDot(),14,11,19,11);
			
			agregarCeldasCon(null,8,10,12,12);
			//Agregar enemigos
			/*
			agregarCeldaCon(miFabrica.construirBlinky(),8,10);
			agregarCeldaCon(miFabrica.construirPinky(),12,10);
			agregarCeldaCon(miFabrica.construirInky(),12,12);
			agregarCeldaCon(miFabrica.construirClyde(),8,12);
			*/
			
			agregarCeldasCon(miFabrica.construirPacDot(),4,12,4,15);
			agregarCeldasCon(miFabrica.construirPacDot(),6,12,6,15);
			agregarCeldasCon(miFabrica.construirPacDot(),14,12,14,15);
			agregarCeldasCon(miFabrica.construirPacDot(),16,12,16,15);
			
			agregarCeldasCon(miFabrica.construirPacDot(),7,14,13,14);
		
			agregarCeldasCon(miFabrica.construirPacDot(),1,16,9,16);
			agregarCeldasCon(miFabrica.construirPacDot(),11,16,19,16);
			
			agregarCeldaCon(miFabrica.construirPacDot(),1,17);
			agregarCeldaCon(miFabrica.construirPacDot(),5,17);
			agregarCeldaCon(miFabrica.construirPacDot(),9,17);
			agregarCeldaCon(miFabrica.construirPacDot(),11,17);
			agregarCeldaCon(miFabrica.construirPacDot(),15,17);
			agregarCeldaCon(miFabrica.construirPacDot(),19,17);
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,18,3,18);
			agregarCeldasCon(miFabrica.construirPacDot(),5,18,15,18);
			agregarCeldasCon(miFabrica.construirPacDot(),17,18,15,18);
			
			agregarCeldaCon(miFabrica.construirPacDot(),3,19);
			agregarCeldaCon(miFabrica.construirPacDot(),5,19);
			agregarCeldaCon(miFabrica.construirPacDot(),7,19);
			agregarCeldaCon(miFabrica.construirPacDot(),13,19);
			agregarCeldaCon(miFabrica.construirPacDot(),15,19);
			agregarCeldaCon(miFabrica.construirPacDot(),17,19);
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,20,5,20);
			agregarCeldasCon(miFabrica.construirPacDot(),7,20,9,20);
			agregarCeldasCon(miFabrica.construirPacDot(),11,20,13,20);
			agregarCeldasCon(miFabrica.construirPacDot(),15,20,19,20);
			
			agregarCeldaCon(miFabrica.construirPacDot(),1,21);
			agregarCeldaCon(miFabrica.construirPacDot(),9,21);
			agregarCeldaCon(miFabrica.construirPacDot(),11,21);
			agregarCeldaCon(miFabrica.construirPacDot(),19,21);
			
			agregarCeldasCon(miFabrica.construirPacDot(),1,22,19,22);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	/**
	 * Metodo que posiciona celdas y entidades para el nivel2
	 */
	public void armarNivel2() {
		//TODO
		
	}


	
	public void armarNivel3() {
		//TODO
		
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
	private void agregarCeldaCon(Entidad entity, int x, int y) throws Exception{
		Celda cel;
			
		cel = miFabrica.construirCelda(x,y);
		if(entity!=null) {
			cel.add(entity);
		}
		nivel.agregarCelda(cel);
	}
	
	/**
	 * Metodo que se encarga de colocar una region de celdas utilizando las coordenadas
	 * pasadas por parámetro. Es decir, se crearán celdas desde la posicion (x1,y1)
	 * hasta la posicion (x2,y2). Estas celdas pueden ser creadas con clones de una entidad pasada
	 * por parámetro. Si la entidad, es null, las celdas creadas estaran vacias.
	 * @param entity Es la entidad
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	private void agregarCeldasCon(Entidad entity, int x1, int y1, int x2, int y2) throws Exception {
		//Hacemos swap si es necesario para que el recorrido quede desde las 
		//menores coordenadas hacia las mayores.
		int aux;
		if(x2<x1) {
			aux=x1;
			x1=x2;
			x2=x1;
		}
		if(y2<y1) {
			aux=y1;
			y1=y2;
			y2=y1;
		}
		
		for(int posX=x1; posX<=x2; posX++) {
			for(int posY=y1; posY<=y2; posY++) {
				//agregarCeldaCon(entity.clone(),posX,posY);
			}
		}
	}
	
}
