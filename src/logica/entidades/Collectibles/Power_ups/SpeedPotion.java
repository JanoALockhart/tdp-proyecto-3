package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.*;
import logica.mapa.*;

public class SpeedPotion extends PowerUp {
	protected int duracion;
	
	public SpeedPotion(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho(),c.getAlto(),c, map);
	}

	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public void activarEfecto() {
		Jugador.getInstance(null, null, 0, null).AumentarVelocidad(4);
	}


}
