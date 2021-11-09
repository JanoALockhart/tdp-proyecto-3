package logica.builder;

public class DirectorNivel2 extends DirectorNivel{
	
	public DirectorNivel2(BuilderNivel armador) {
		super(armador);
	}
	
	public void armarNivel() {
		//agregar pacDots
		try {
			agregarPacDots("src/recursos/layouts/pacDotsLevel2.txt");
			
			//Agregar Jugador
			armador.agregarJugador(4,22);
			
			//Agregar power pellets
			armador.agregarPowerPellet(15, 18);
			armador.agregarPowerPellet(5, 5);
			
			//Agregar fruta
			armador.agregarFruta(13, 7);
			
			//Agregar potions
			armador.agregarSpeedPotion(1, 1);
			armador.agregarBomba(19, 22);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
