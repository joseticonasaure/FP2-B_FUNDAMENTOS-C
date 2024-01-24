import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Controler{
	Vista vista;
	Mapa mapa;
	
	public Controler (Vista vista, Mapa mapa) {
		this.vista = vista;
		this.mapa = mapa;
	}
	public void mostrarMapa() {
		mapa.iniciarJuego();
		SwingUtilities.invokeLater(() -> {
			String[][] tablero = mapa.getTablero();
			ArrayList<Ejercito> reinoA = mapa.getReinoA();
			ArrayList<Ejercito> reinoB = mapa.getReinoB();
			new Vista(tablero, reinoA, reinoB);
		});
	}
}
