public class Tablero {
	public static void main(String[] args) {

	Runtime runtime = Runtime.getRuntime();
	long totalMemoria = runtime.totalMemory();
	     
	 //usando el patron de diseño MVC(modelo vista controlador)
         Mapa mapa = new Mapa();
         Vista vista = new Vista();
	 Controler controller = new Controler(vista,mapa);
         controller.mostrarMapa();
	        
         long memoriaLibre = runtime.freeMemory();
	 long memoriaUsada = totalMemoria - memoriaLibre;
         System.out.println("Memoria utilizada: " + memoriaUsada / (1024 * 1024) + "MB");
    	}
}
