package vista;

import javax.swing.JPanel;

public interface State {
	public void seApretoDerecha();
	public void seApretoIzquierda();
	public void seApretoAbajo();
	public void seApretoArriba();
	public void seApretoEnter();
	public void seApretoEspacio();
	public void refrescarLabels();
	public JPanel getPanel();
	public String getName();
}
