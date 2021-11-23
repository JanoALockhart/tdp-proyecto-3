package logica.entidades.Collectibles.Power_ups;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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
		
		try {
			Clip cli = AudioSystem.getClip();
			cli.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/logica/entidades/Collectibles/Power_ups/SpeedPotion.wav")));
			
			FloatControl gainControl = 
				    (FloatControl) cli.getControl(FloatControl.Type.MASTER_GAIN);
				gainControl.setValue(-15.0f);
			
			cli.start();
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}


}
