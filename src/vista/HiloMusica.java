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
	 * Implementación de la música y sonidos
	 * @param fuente Source de la música principal
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
	 * Método que activara la música
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
	 * Método que resumira la música en caso de pausada y pausará si esta reproduciendose
	 */
	public void audioPause() {
		if(pause)clip.start();
		else clip.stop();
		pause=!pause;
	}
	
	/**
	 * Método que revisa si la música está pausada
	 * @return pause True si esta pausada
	 * 				 False si no esta pausada
	 */
	public boolean getPause() {
		return pause;
	}
	
	/**
	 * Método que cierra el hilo de la música
	 */
	public void closeMusicTread() {
		clip.close();
	}
	
	/**
	 * Método que reproduce un sonido
	 * @param source Fuente del sonido
	 * @param volume Número real que modifica al volumen en que el sonido se reproducira
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
