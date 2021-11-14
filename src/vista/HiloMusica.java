package vista;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class HiloMusica extends Thread {
	
	private String fuente;
	
	private Thread musical;
	
	public HiloMusica(String fuente) {
		this.fuente=fuente;
		musical = new Thread(new Runnable() {
			public void run() {
				audioOn();
			}
		});
		musical.start();
	}
	
	public void audioOn() {
		File file=new File(fuente);
		AudioInputStream music;
		try {
			music = AudioSystem.getAudioInputStream(file);
			
			Clip clip=AudioSystem.getClip();
			clip.open(music);
			
			clip.start();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
}
