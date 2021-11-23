package logica.entidades.entGrafica;

import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import logica.geometria.HitBox;
import logica.geometria.Pixel;
import main.Main;

public class EntidadGrafica{   
		protected String imgDefault;
		protected JLabel jlbl;
		protected Pixel posInicial;
		protected int width, height, priority;
		
		public EntidadGrafica(String dir, int posX, int posY, int width, int height, int priority) {
			imgDefault = dir;
			posInicial = new Pixel(posX,posY);
			
			//Resize imageIcon
			ImageIcon icon = new ImageIcon(EntidadGrafica.class.getResource(dir));
			Image imgResized = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        icon = new ImageIcon(imgResized);
			
			this.width = width;
			this.height = height;
			this.priority = priority;
			jlbl = new JLabel(icon);
			jlbl.setBounds(posX, posY, width, height);
			jlbl.setVisible(true);
		}
		
		public EntidadGrafica(String dir, int PosX, int PosY, int width, int height) {
			this(dir, PosX, PosY, width, height, 1);
		}
		
		public String getImg() {
			return imgDefault;
		}
		
		public JLabel getLbl() {
			return jlbl;
		}
		
		/**
		 * Devuelve un rectangulo que es la hitbox del personaje.
		 * Tiene un pixel menos de ancho y de largo.
		 * @return Un nuevo rectangulo que representa la hitbox de la entidad.
		 */
		public HitBox getRect() { 
			//return jlbl.getBounds();
			Rectangle lbl = jlbl.getBounds();
			HitBox hitBox = new HitBox((int)lbl.getX(), (int) lbl.getY(),(int)lbl.getWidth()-1,(int)lbl.getHeight()-1);
			return hitBox;
		}

		public int getPriority() {
			return priority;
		}
		
		public Pixel getPos() {
			return new Pixel(jlbl.getX(),jlbl.getY());
		}
		
		public Pixel getPosInicial() {
			return posInicial;
		}
		
		public void setPosInicial(Pixel nuevoPxl) {
			posInicial = nuevoPxl;
		}
		
		public void setPos(Pixel pxl) {
			jlbl.setLocation(pxl.getX(),pxl.getY());
		}
}
