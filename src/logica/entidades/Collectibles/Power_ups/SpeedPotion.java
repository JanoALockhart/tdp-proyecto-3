package logica.entidades.Collectibles.Power_ups;

import logica.entidades.Personaje.Jugadores.Jugador;
import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;
import main.Main;

public class SpeedPotion extends PowerUp {
	protected int duracion;
	protected int velocidadExtra;
	
	public SpeedPotion(EntidadGrafica ent, Mapa map) {
		super(ent, map);
	}

	/**Es el que se encarga de activar el efecto de la potion que es aumentar la velocidad;
	 * @param v recibe un visitor que luego se manda a los distintos visitadores
	 */
	@Override
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}

	/**
	 * Este metodo aumenta la velociadad del jugador
	 */
	@Override
	public void activarEfecto() {
		int duracion = Integer.parseInt(Main.personajesConfig.getProperty("duracionSP"));
		int velExtra = Integer.parseInt(Main.personajesConfig.getProperty("velExtraSP"));
		
		Jugador.getInstance().AumentarVelocidad(duracion, velExtra);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
		
		Partida.getInstance().reproducirSonido("../recursos/sonidos/SpeedPotion.wav", -15.0f);
		
	}


}
