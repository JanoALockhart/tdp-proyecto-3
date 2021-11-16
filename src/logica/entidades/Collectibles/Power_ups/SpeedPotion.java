package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;
import main.Main;

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
		int duracion = Integer.parseInt(Main.personajesConfig.getProperty("duracionSP"));
		int velExtra = Integer.parseInt(Main.personajesConfig.getProperty("velExtraSP"));
		
		Jugador.getInstance().AumentarVelocidad(duracion, velExtra);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
	}


}
