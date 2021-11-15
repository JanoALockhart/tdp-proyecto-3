package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class SpeedPotion extends PowerUp {
	protected int duracion;
	protected int velocidadExtra;
	
	public SpeedPotion(String img, int width,int height,Celda c, Mapa map) {
		super(img ,c.getAncho(),c.getAlto(),c, map);
	}

	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	@Override
	public void activarEfecto() {
		Jugador.getInstance().AumentarVelocidad(20, 10);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}


}
