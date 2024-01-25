import java.util.*;
public class Controler{
	Vista vista;
	Mapa mapa;
	
	public Controler (Vista vista, Mapa mapa) {
		this.vista = vista;
		this.mapa = mapa;
	}
	public void mostrarMapa() {
		mapa.iniciarJuego();
		String[][] tablero = mapa.getTablero();
		ArrayList<Ejercito> reinoA = mapa.getReinoA();
		ArrayList<Ejercito> reinoB = mapa.getReinoB();
		vista.imprimirTablero(tablero, reinoA, reinoB);
	}
}
