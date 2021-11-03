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
		try {
			agregarCeldaCon(miFabrica.construirPacDot(),1,1);
			agregarCeldaCon(miFabrica.construirPacDot(),2,1);
			agregarCeldaCon(miFabrica.construirPacDot(),3,1);
			agregarCeldaCon(miFabrica.construirPacDot(),4,1);
			agregarCeldaCon(miFabrica.construirPacDot(),5,1);
			agregarCeldaCon(miFabrica.construirPacDot(),6,1);
			agregarCeldaCon(miFabrica.construirPacDot(),7,1);
			agregarCeldaCon(miFabrica.construirPacDot(),8,1);
			agregarCeldaCon(miFabrica.construirPacDot(),9,1);
			agregarCeldaCon(miFabrica.construirPacDot(),11,1);
			agregarCeldaCon(miFabrica.construirPacDot(),12,1);
			agregarCeldaCon(miFabrica.construirPacDot(),13,1);
			agregarCeldaCon(miFabrica.construirPacDot(),14,1);
			agregarCeldaCon(miFabrica.construirPacDot(),15,1);
			agregarCeldaCon(miFabrica.construirPacDot(),17,1);
			agregarCeldaCon(miFabrica.construirPacDot(),18,1);
			agregarCeldaCon(miFabrica.construirPacDot(),19,1);
			agregarCeldaCon(miFabrica.construirPacDot(),1,2);
			agregarCeldaCon(miFabrica.construirPacDot(),7,2);
			agregarCeldaCon(miFabrica.construirPacDot(),9,2);
			agregarCeldaCon(miFabrica.construirPacDot(),11,2);
			agregarCeldaCon(miFabrica.construirPacDot(),15,2);
			agregarCeldaCon(miFabrica.construirPacDot(),17,2);
			agregarCeldaCon(miFabrica.construirPacDot(),18,2);
			agregarCeldaCon(miFabrica.construirPacDot(),19,2);
			agregarCeldaCon(miFabrica.construirPacDot(),1,3);
			agregarCeldaCon(miFabrica.construirPacDot(),3,3);
			agregarCeldaCon(miFabrica.construirPacDot(),4,3);
			agregarCeldaCon(miFabrica.construirPacDot(),5,3);
			agregarCeldaCon(miFabrica.construirPacDot(),7,3);
			agregarCeldaCon(miFabrica.construirPacDot(),9,3);
			agregarCeldaCon(miFabrica.construirPacDot(),11,3);
			agregarCeldaCon(miFabrica.construirPacDot(),15,3);
			agregarCeldaCon(miFabrica.construirPacDot(),16,3);
			agregarCeldaCon(miFabrica.construirPacDot(),17,3);
			agregarCeldaCon(miFabrica.construirPacDot(),18,3);
			agregarCeldaCon(miFabrica.construirPacDot(),19,3);
			agregarCeldaCon(miFabrica.construirPacDot(),1,4);
			agregarCeldaCon(miFabrica.construirPacDot(),3,4);
			agregarCeldaCon(miFabrica.construirPacDot(),5,4);
			agregarCeldaCon(miFabrica.construirPacDot(),7,4);
			agregarCeldaCon(miFabrica.construirPacDot(),9,4);
			agregarCeldaCon(miFabrica.construirPacDot(),11,4);
			agregarCeldaCon(miFabrica.construirPacDot(),15,4);
			agregarCeldaCon(miFabrica.construirPacDot(),17,4);
			agregarCeldaCon(miFabrica.construirPacDot(),18,4);
			agregarCeldaCon(miFabrica.construirPacDot(),19,4);
			agregarCeldaCon(miFabrica.construirPacDot(),1,5);
			agregarCeldaCon(miFabrica.construirPacDot(),3,5);
			agregarCeldaCon(miFabrica.construirPacDot(),5,5);
			agregarCeldaCon(miFabrica.construirPacDot(),7,5);
			agregarCeldaCon(miFabrica.construirPacDot(),9,5);
			agregarCeldaCon(miFabrica.construirPacDot(),11,5);
			agregarCeldaCon(miFabrica.construirPacDot(),12,5);
			agregarCeldaCon(miFabrica.construirPacDot(),13,5);
			agregarCeldaCon(miFabrica.construirPacDot(),14,5);
			agregarCeldaCon(miFabrica.construirPacDot(),15,5);
			agregarCeldaCon(miFabrica.construirPacDot(),17,5);
			agregarCeldaCon(miFabrica.construirPacDot(),18,5);
			agregarCeldaCon(miFabrica.construirPacDot(),19,5);
			agregarCeldaCon(miFabrica.construirPacDot(),1,6);
			agregarCeldaCon(miFabrica.construirPacDot(),3,6);
			agregarCeldaCon(miFabrica.construirPacDot(),5,6);
			agregarCeldaCon(miFabrica.construirPacDot(),7,6);
			agregarCeldaCon(miFabrica.construirPacDot(),9,6);
			agregarCeldaCon(miFabrica.construirPacDot(),11,6);
			agregarCeldaCon(miFabrica.construirPacDot(),13,6);
			agregarCeldaCon(miFabrica.construirPacDot(),15,6);
			agregarCeldaCon(miFabrica.construirPacDot(),1,7);
			agregarCeldaCon(miFabrica.construirPacDot(),3,7);
			agregarCeldaCon(miFabrica.construirPacDot(),5,7);
			agregarCeldaCon(miFabrica.construirPacDot(),6,7);
			agregarCeldaCon(miFabrica.construirPacDot(),7,7);
			agregarCeldaCon(miFabrica.construirPacDot(),9,7);
			agregarCeldaCon(miFabrica.construirPacDot(),11,7);
			agregarCeldaCon(miFabrica.construirPacDot(),13,7);
			agregarCeldaCon(miFabrica.construirPacDot(),14,7);
			agregarCeldaCon(miFabrica.construirPacDot(),15,7);
			agregarCeldaCon(miFabrica.construirPacDot(),16,7);
			agregarCeldaCon(miFabrica.construirPacDot(),17,7);
			agregarCeldaCon(miFabrica.construirPacDot(),18,7);
			agregarCeldaCon(miFabrica.construirPacDot(),19,7);
			agregarCeldaCon(miFabrica.construirPacDot(),1,8);
			agregarCeldaCon(miFabrica.construirPacDot(),3,8);
			agregarCeldaCon(miFabrica.construirPacDot(),9,8);
			agregarCeldaCon(miFabrica.construirPacDot(),11,8);
			agregarCeldaCon(miFabrica.construirPacDot(),15,8);
			agregarCeldaCon(miFabrica.construirPacDot(),19,8);
			agregarCeldaCon(miFabrica.construirPacDot(),1,9);
			agregarCeldaCon(miFabrica.construirPacDot(),3,9);
			agregarCeldaCon(miFabrica.construirPacDot(),4,9);
			agregarCeldaCon(miFabrica.construirPacDot(),5,9);
			agregarCeldaCon(miFabrica.construirPacDot(),6,9);
			agregarCeldaCon(miFabrica.construirPacDot(),7,9);
			agregarCeldaCon(miFabrica.construirPacDot(),8,9);
			agregarCeldaCon(miFabrica.construirPacDot(),9,9);
			agregarCeldaCon(miFabrica.construirPacDot(),11,9);
			agregarCeldaCon(miFabrica.construirPacDot(),13,9);
			agregarCeldaCon(miFabrica.construirPacDot(),14,9);
			agregarCeldaCon(miFabrica.construirPacDot(),15,9);
			agregarCeldaCon(miFabrica.construirPacDot(),17,9);
			agregarCeldaCon(miFabrica.construirPacDot(),18,9);
			agregarCeldaCon(miFabrica.construirPacDot(),19,9);
			agregarCeldaCon(miFabrica.construirPacDot(),1,10);
			agregarCeldaCon(miFabrica.construirPacDot(),9,10);
			agregarCeldaCon(miFabrica.construirPacDot(),10,10);
			agregarCeldaCon(miFabrica.construirPacDot(),11,10);
			agregarCeldaCon(miFabrica.construirPacDot(),12,10);
			agregarCeldaCon(miFabrica.construirPacDot(),13,10);
			agregarCeldaCon(miFabrica.construirPacDot(),15,10);
			agregarCeldaCon(miFabrica.construirPacDot(),17,10);
			agregarCeldaCon(miFabrica.construirPacDot(),1,11);
			agregarCeldaCon(miFabrica.construirPacDot(),2,11);
			agregarCeldaCon(miFabrica.construirPacDot(),3,11);
			agregarCeldaCon(miFabrica.construirPacDot(),4,11);
			agregarCeldaCon(miFabrica.construirPacDot(),5,11);
			agregarCeldaCon(miFabrica.construirPacDot(),6,11);
			agregarCeldaCon(miFabrica.construirPacDot(),7,11);
			agregarCeldaCon(miFabrica.construirPacDot(),8,11);
			agregarCeldaCon(miFabrica.construirPacDot(),9,11);
			agregarCeldaCon(miFabrica.construirPacDot(),11,11);
			agregarCeldaCon(miFabrica.construirPacDot(),13,11);
			agregarCeldaCon(miFabrica.construirPacDot(),15,11);
			agregarCeldaCon(miFabrica.construirPacDot(),17,11);
			agregarCeldaCon(miFabrica.construirPacDot(),3,12);
			agregarCeldaCon(miFabrica.construirPacDot(),5,12);
			agregarCeldaCon(miFabrica.construirPacDot(),7,12);
			agregarCeldaCon(miFabrica.construirPacDot(),9,12);
			agregarCeldaCon(miFabrica.construirPacDot(),11,12);
			agregarCeldaCon(miFabrica.construirPacDot(),12,12);
			agregarCeldaCon(miFabrica.construirPacDot(),13,12);
			agregarCeldaCon(miFabrica.construirPacDot(),14,12);
			agregarCeldaCon(miFabrica.construirPacDot(),15,12);
			agregarCeldaCon(miFabrica.construirPacDot(),16,12);
			agregarCeldaCon(miFabrica.construirPacDot(),17,12);
			agregarCeldaCon(miFabrica.construirPacDot(),18,12);
			agregarCeldaCon(miFabrica.construirPacDot(),19,12);
			agregarCeldaCon(miFabrica.construirPacDot(),3,13);
			agregarCeldaCon(miFabrica.construirPacDot(),4,13);
			agregarCeldaCon(miFabrica.construirPacDot(),5,13);
			agregarCeldaCon(miFabrica.construirPacDot(),6,13);
			agregarCeldaCon(miFabrica.construirPacDot(),7,13);
			agregarCeldaCon(miFabrica.construirPacDot(),8,13);
			agregarCeldaCon(miFabrica.construirPacDot(),9,13);
			agregarCeldaCon(miFabrica.construirPacDot(),10,13);
			agregarCeldaCon(miFabrica.construirPacDot(),11,13);
			agregarCeldaCon(miFabrica.construirPacDot(),19,13);
			agregarCeldaCon(miFabrica.construirPacDot(),1,14);
			agregarCeldaCon(miFabrica.construirPacDot(),2,14);
			agregarCeldaCon(miFabrica.construirPacDot(),3,14);
			agregarCeldaCon(miFabrica.construirPacDot(),5,14);
			agregarCeldaCon(miFabrica.construirPacDot(),7,14);
			agregarCeldaCon(miFabrica.construirPacDot(),9,14);
			agregarCeldaCon(miFabrica.construirPacDot(),11,14);
			agregarCeldaCon(miFabrica.construirPacDot(),12,14);
			agregarCeldaCon(miFabrica.construirPacDot(),13,14);
			agregarCeldaCon(miFabrica.construirPacDot(),14,14);
			agregarCeldaCon(miFabrica.construirPacDot(),15,14);
			agregarCeldaCon(miFabrica.construirPacDot(),16,14);
			agregarCeldaCon(miFabrica.construirPacDot(),17,14);
			agregarCeldaCon(miFabrica.construirPacDot(),19,14);
			agregarCeldaCon(miFabrica.construirPacDot(),1,15);
			agregarCeldaCon(miFabrica.construirPacDot(),3,15);
			agregarCeldaCon(miFabrica.construirPacDot(),4,15);
			agregarCeldaCon(miFabrica.construirPacDot(),5,15);
			agregarCeldaCon(miFabrica.construirPacDot(),6,15);
			agregarCeldaCon(miFabrica.construirPacDot(),7,15);
			agregarCeldaCon(miFabrica.construirPacDot(),8,15);
			agregarCeldaCon(miFabrica.construirPacDot(),9,15);
			agregarCeldaCon(miFabrica.construirPacDot(),11,15);
			agregarCeldaCon(miFabrica.construirPacDot(),17,15);
			agregarCeldaCon(miFabrica.construirPacDot(),19,15);
			agregarCeldaCon(miFabrica.construirPacDot(),1,16);
			agregarCeldaCon(miFabrica.construirPacDot(),5,16);
			agregarCeldaCon(miFabrica.construirPacDot(),9,16);
			agregarCeldaCon(miFabrica.construirPacDot(),11,16);
			agregarCeldaCon(miFabrica.construirPacDot(),13,16);
			agregarCeldaCon(miFabrica.construirPacDot(),14,16);
			agregarCeldaCon(miFabrica.construirPacDot(),15,16);
			agregarCeldaCon(miFabrica.construirPacDot(),17,16);
			agregarCeldaCon(miFabrica.construirPacDot(),19,16);
			agregarCeldaCon(miFabrica.construirPacDot(),1,17);
			agregarCeldaCon(miFabrica.construirPacDot(),2,17);
			agregarCeldaCon(miFabrica.construirPacDot(),3,17);
			agregarCeldaCon(miFabrica.construirPacDot(),4,17);
			agregarCeldaCon(miFabrica.construirPacDot(),5,17);
			agregarCeldaCon(miFabrica.construirPacDot(),6,17);
			agregarCeldaCon(miFabrica.construirPacDot(),9,17);
			agregarCeldaCon(miFabrica.construirPacDot(),11,17);
			agregarCeldaCon(miFabrica.construirPacDot(),13,17);
			agregarCeldaCon(miFabrica.construirPacDot(),15,17);
			agregarCeldaCon(miFabrica.construirPacDot(),17,17);
			agregarCeldaCon(miFabrica.construirPacDot(),19,17);
			agregarCeldaCon(miFabrica.construirPacDot(),2,18);
			agregarCeldaCon(miFabrica.construirPacDot(),6,18);
			agregarCeldaCon(miFabrica.construirPacDot(),9,18);
			agregarCeldaCon(miFabrica.construirPacDot(),11,18);
			agregarCeldaCon(miFabrica.construirPacDot(),13,18);
			agregarCeldaCon(miFabrica.construirPacDot(),15,18);
			agregarCeldaCon(miFabrica.construirPacDot(),17,18);
			agregarCeldaCon(miFabrica.construirPacDot(),19,18);
			agregarCeldaCon(miFabrica.construirPacDot(),1,19);
			agregarCeldaCon(miFabrica.construirPacDot(),2,19);
			agregarCeldaCon(miFabrica.construirPacDot(),3,19);
			agregarCeldaCon(miFabrica.construirPacDot(),5,19);
			agregarCeldaCon(miFabrica.construirPacDot(),6,19);
			agregarCeldaCon(miFabrica.construirPacDot(),7,19);
			agregarCeldaCon(miFabrica.construirPacDot(),9,19);
			agregarCeldaCon(miFabrica.construirPacDot(),11,19);
			agregarCeldaCon(miFabrica.construirPacDot(),13,19);
			agregarCeldaCon(miFabrica.construirPacDot(),15,19);
			agregarCeldaCon(miFabrica.construirPacDot(),17,19);
			agregarCeldaCon(miFabrica.construirPacDot(),19,19);
			agregarCeldaCon(miFabrica.construirPacDot(),1,20);
			agregarCeldaCon(miFabrica.construirPacDot(),3,20);
			agregarCeldaCon(miFabrica.construirPacDot(),5,20);
			agregarCeldaCon(miFabrica.construirPacDot(),7,20);
			agregarCeldaCon(miFabrica.construirPacDot(),9,20);
			agregarCeldaCon(miFabrica.construirPacDot(),11,20);
			agregarCeldaCon(miFabrica.construirPacDot(),13,20);
			agregarCeldaCon(miFabrica.construirPacDot(),15,20);
			agregarCeldaCon(miFabrica.construirPacDot(),16,20);
			agregarCeldaCon(miFabrica.construirPacDot(),17,20);
			agregarCeldaCon(miFabrica.construirPacDot(),19,20);
			agregarCeldaCon(miFabrica.construirPacDot(),1,21);
			agregarCeldaCon(miFabrica.construirPacDot(),3,21);
			agregarCeldaCon(miFabrica.construirPacDot(),5,21);
			agregarCeldaCon(miFabrica.construirPacDot(),7,21);
			agregarCeldaCon(miFabrica.construirPacDot(),9,21);
			agregarCeldaCon(miFabrica.construirPacDot(),11,21);
			agregarCeldaCon(miFabrica.construirPacDot(),13,21);
			agregarCeldaCon(miFabrica.construirPacDot(),19,21);
			agregarCeldaCon(miFabrica.construirPacDot(),1,22);
			agregarCeldaCon(miFabrica.construirPacDot(),2,22);
			agregarCeldaCon(miFabrica.construirPacDot(),3,22);
			agregarCeldaCon(miFabrica.construirPacDot(),4,22);
			agregarCeldaCon(miFabrica.construirPacDot(),5,22);
			agregarCeldaCon(miFabrica.construirPacDot(),7,22);
			agregarCeldaCon(miFabrica.construirPacDot(),8,22);
			agregarCeldaCon(miFabrica.construirPacDot(),9,22);
			agregarCeldaCon(miFabrica.construirPacDot(),11,22);
			agregarCeldaCon(miFabrica.construirPacDot(),12,22);
			agregarCeldaCon(miFabrica.construirPacDot(),13,22);
			agregarCeldaCon(miFabrica.construirPacDot(),14,22);
			agregarCeldaCon(miFabrica.construirPacDot(),15,22);
			agregarCeldaCon(miFabrica.construirPacDot(),16,22);
			agregarCeldaCon(miFabrica.construirPacDot(),17,22);
			agregarCeldaCon(miFabrica.construirPacDot(),18,22);
			agregarCeldaCon(miFabrica.construirPacDot(),19,22);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
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
