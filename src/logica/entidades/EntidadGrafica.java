package logica.entidades;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGrafica{   
		protected String dirImg;
		protected JLabel jlbl;
		protected ImageIcon icon;
		protected int width, height;
		
		public EntidadGrafica(String dir, int PosX, int PosY, int width, int height) {
			dirImg = dir;
			
			//Resize imageIcon
			icon = new ImageIcon(EntidadGrafica.class.getResource(dir));
			Image imgResized = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        icon = new ImageIcon(imgResized);
			
			this.width = width;
			this.height = height;
			jlbl = new JLabel(icon);
			jlbl.setBounds(PosX, PosY, width, height);
			jlbl.setVisible(true);
			
	        
		}
		
		public String getImg() {
			return dirImg;
		}
		
		public JLabel getLbl() {
			return jlbl;
		}
		
		public Rectangle getRect() { return jlbl.getBounds();}
		
		public ImageIcon getIcon() { return icon;}
		
		public void rotarSprite() {
			//TODO
		}
		
		//METODOS MOVER
		public void moverNorte() {
			jlbl.setLocation(jlbl.getX(), jlbl.getY()-1);
		}
		
		public void moverSur() {
			jlbl.setLocation(jlbl.getX(), jlbl.getY()+1);
		}
		
		public void moverEste() {
			jlbl.setLocation(jlbl.getX()+1, jlbl.getY());
		}
		
		public void moverOeste() {
			jlbl.setLocation(jlbl.getX()-1, jlbl.getY());
		}
}
