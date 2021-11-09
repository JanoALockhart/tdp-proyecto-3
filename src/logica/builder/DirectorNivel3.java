package logica.builder;

public class DirectorNivel3 extends DirectorNivel{
	
	public DirectorNivel3(BuilderNivel armador) {
		super(armador);
	}
	
	public void armarNivel() {
		try {
			agregarPacDots("src/recursos/layouts/pacDotsLevel3.txt");
			
			//Agregar Jugador
			armador.agregarJugador(1,22);
			
			//Agregar PowerPellets
			armador.agregarPowerPellet(13,15);
			armador.agregarPowerPellet(15,15);
			armador.agregarPowerPellet(17,15);
			
			//Agregar Potion
			armador.agregarSpeedPotion(1, 7);
			armador.agregarBomba(11, 2);
			
			//Agregar fruta
			armador.agregarFruta(7, 2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
