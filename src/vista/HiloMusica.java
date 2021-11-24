package vista;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class HiloMusica extends Thread {
	
	private String fuente;
	
	private Thread musical;
	
	private boolean pause;
	
	private Clip clip;
	
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
	
	public void audioPause() {
		if(pause)clip.start();
		else clip.stop();
		pause=!pause;
	}
	
	public boolean getPause() {
		return pause;
	}
	
	public void onGameClosed() {
		clip.close();
	}
	
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
