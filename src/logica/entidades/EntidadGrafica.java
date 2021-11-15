package logica.entidades;

import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import logica.geometria.Pixel;
import main.Main;

public class EntidadGrafica{   
		protected String dirImg;
		protected JLabel jlbl;
		protected ImageIcon icon;
		protected int width, height, priority;
		private static final int pixelPorPaso = Integer.parseInt(Main.dimentionConfig.getProperty("pixelPorPaso"));
		
		public EntidadGrafica(String dir, int PosX, int PosY, int width, int height, int priority) {
			dirImg = dir;
			
			//Resize imageIcon
			icon = new ImageIcon(EntidadGrafica.class.getResource(dir));
			Image imgResized = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        icon = new ImageIcon(imgResized);
			
			this.width = width;
			this.height = height;
			this.priority = priority;
			jlbl = new JLabel(icon);
			jlbl.setBounds(PosX, PosY, width, height);
			jlbl.setVisible(true);
		}
		
		public EntidadGrafica(String dir, int PosX, int PosY, int width, int height) {
			this(dir, PosX, PosY, width, height, 1);
		}
		
		public String getImg() {
			return dirImg;
		}
		
		public JLabel getLbl() {
			return jlbl;
		}
		
		/**
		 * Devuelve un rectangulo que es la hitbox del personaje.
		 * Tiene un pixel menos de ancho y de largo.
		 * @return Un nuevo rectangulo que representa la hitbox de la entidad.
		 */
		public Rectangle getRect() { 
			//return jlbl.getBounds();
			Rectangle lbl = jlbl.getBounds();
			Rectangle hitBox = new Rectangle((int)lbl.getX(), (int) lbl.getY(),(int)lbl.getWidth()-1,(int)lbl.getHeight()-1);
			return hitBox;
		}
		
		public ImageIcon getIcon() { return icon;}
		
		public void rotarSprite() {
			//TODO
		}
		
		//METODOS MOVER
		public void moverNorte() {
			jlbl.setLocation(jlbl.getX(), jlbl.getY()-pixelPorPaso);
		}
		
		public void moverSur() {
			jlbl.setLocation(jlbl.getX(), jlbl.getY()+pixelPorPaso);
		}
		
		public void moverEste() {
			jlbl.setLocation(jlbl.getX()+pixelPorPaso, jlbl.getY());
		}
		
		public void moverOeste() {
			jlbl.setLocation(jlbl.getX()-pixelPorPaso, jlbl.getY());
		}

		public int getPriority() {
			return priority;
		}
		
		public Pixel getPos() {
			return new Pixel(jlbl.getX(),jlbl.getY());
		}
		
		public void setPos(Pixel pxl) {
			jlbl.setLocation(pxl.getX(),pxl.getY());
		}
}
