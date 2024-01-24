
import java.util.*;
public class Controler{
	Vista vista;
	Mapa mapa;
	
	public Controler (Vista vista, Mapa mapa) {
		this.vista = vista;
		this.mapa = mapa;
	}
	public void mostrarMapa() {
		String[][] tablero = mapa.getTablero();
		ArrayList<Ejercito> reinoA = mapa.getReinoA();
		ArrayList<Ejercito> reinoB = mapa.getReinoB();
		mapa.iniciarJuego();
		Vista.imprimirTablero(tablero, reinoA, reinoB);
	}
}
