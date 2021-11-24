package logica.entidades.Collectibles.Puntos;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import logica.entidades.entGrafica.EntidadGrafica;
import logica.entidades.visitadores.*;
import logica.mapa.*;
import logica.partida.Partida;

public class Fruta extends Punto {
	
	public Fruta(int val, EntidadGrafica ent, Mapa m) {
		super(ent ,m);
		valor = val;
	}
	
	public void accept(Visitor v) {
		v.serAfectadoPor(this);
	}
	
	public void activarEfecto() {
		Partida.getInstance().addPuntaje(valor);
		miMapa.eliminarDeCeldasQueTocaba(this, getHitbox());//Se lo elimina
		Partida.getInstance().elimnarEntidadGrafica(this.miObjetoGrafico);
		
		Partida.getInstance().reproducirSonido("../recursos/sonidos/Fruta-Sound.wav", -10.0f);
		
		
	}

	
	
}
