package vista;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class HiloMusica extends Thread {
	
	private String fuente;
	
	private Thread musical;
	
	private boolean pause;
	
	private Clip clip;
	
	/**
	 * Implementaci�n de la m�sica y sonidos
	 * @param fuente Source de la m�sica principal
	 */
	public HiloMusica(String fuente) {
		this.fuente=fuente;
		musical = new Thread(new Runnable() {
			public void run() {
				audioOn();
			}
		});
		musical.start();
		pause=false;
	}
	
	/**
	 * M�todo que activara la m�sica
	 */
	public void audioOn() {
		File file=new File(fuente);
		AudioInputStream music;
		try {
			music = AudioSystem.getAudioInputStream(file);
			
			Clip clip=AudioSystem.getClip();
			this.clip=clip;
			
			this.clip.open(music);
			
			
			
			this.clip.start();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | IllegalStateException e) {

		}
	}
	
	/**
	 * M�todo que resumira la m�sica en caso de pausada y pausar� si esta reproduciendose
	 */
	public void audioPause() {
		if(pause)clip.start();
		else clip.stop();
		pause=!pause;
	}
	
	/**
	 * M�todo que revisa si la m�sica est� pausada
	 * @return pause True si esta pausada
	 * 				 False si no esta pausada
	 */
	public boolean getPause() {
		return pause;
	}
	
	/**
	 * M�todo que cierra el hilo de la m�sica
	 */
	public void closeMusicTread() {
		clip.close();
	}
	
	/**
	 * M�todo que reproduce un sonido
	 * @param source Fuente del sonido
	 * @param volume N�mero real que modifica al volumen en que el sonido se reproducira
	 */
	public void reproducirSonido(String source, float volume) {
		try {
			Clip cli = AudioSystem.getClip();
			cli.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(source)));
			
			FloatControl gainControl = 
				    (FloatControl) cli.getControl(FloatControl.Type.MASTER_GAIN);
				gainControl.setValue(volume);
			
			cli.start();
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}
}
