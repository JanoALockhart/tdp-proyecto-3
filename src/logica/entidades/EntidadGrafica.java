package logica.entidades;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGrafica{   
		protected String dirImg;
		protected JLabel jlbl;
		protected ImageIcon icon;
		
		public EntidadGrafica(String dir, int PosX, int PosY, int width, int height) {
			dirImg = dir;
			icon = new ImageIcon(EntidadGrafica.class.getResource(dir));
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
		
}
