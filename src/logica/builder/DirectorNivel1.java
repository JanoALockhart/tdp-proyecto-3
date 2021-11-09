package logica.builder;

import java.io.IOException;

public class DirectorNivel1 extends DirectorNivel{

	public DirectorNivel1(BuilderNivel armador) {
		super(armador);
	}
	
	public void armarNivel() {
		try {
			armador.reset();
			
			agregarPacDots("src/recursos/layouts/pacDotsLevel1.txt");
			
			
			//Agregar Jugador
			armador.agregarJugador(10,18);
			
			//Agregar fruta
			armador.agregarFruta(10,14);
			
			//Agregar power pellets
			armador.agregarPowerPellet(1,20);
			armador.agregarPowerPellet(19,20);
			armador.agregarPowerPellet(1,1);
			armador.agregarPowerPellet(19,1);
			
			//Agregar speed potion
			armador.agregarSpeedPotion(5,11);
			
			//Agregar bomba
			armador.agregarBomba(15,11);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
