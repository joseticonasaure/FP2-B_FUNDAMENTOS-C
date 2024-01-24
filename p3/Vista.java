
import java.util.*;
public class Vista {
	
	public static void imprimirTablero(String[][] tablero, ArrayList<Ejercito> reinoA, ArrayList<Ejercito> reinoB) {
    	for (char columna = 'A'; columna <= 'J'; columna++) {
            System.out.print("        " + columna);
        }
        System.out.println();
        System.out.println("     ________ ________ ________ ________ ________ ________ ________ ________ ________ ________ ");
        for (int i = 0; i < tablero.length; i++) {
        	if(i+1 < 10) {
        		System.out.print(" " + (i + 1));
        	} else {
        		System.out.print(i+1); 
        	}
        	System.out.print("  ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null) {
                    String reinoEjercito = tablero[i][j];
                    String[] partes = reinoEjercito.split(" ");
                    String nombreReino = partes[0];
                    int indiceEjercito = Integer.parseInt(partes[1]);
                    Ejercito ejercitoEncontrado = null;
                    for (Ejercito ejercito : reinoA) {
                        if (ejercito.getNombreReino().equals(nombreReino) && reinoA.indexOf(ejercito) == indiceEjercito) {
                            ejercitoEncontrado = ejercito;
                            break;
                        }
                    }
                    if (ejercitoEncontrado == null) {
                        for (Ejercito ejercito : reinoB) {
                            if (ejercito.getNombreReino().equals(nombreReino) && reinoB.indexOf(ejercito) == indiceEjercito) {
                                ejercitoEncontrado = ejercito;
                                break;
                            }
                        }
                    }
                    if (ejercitoEncontrado != null) {
                        int totalSoldados = ejercitoEncontrado.getNumeroSoldados();
                        int vidaTotal = ejercitoEncontrado.getSumaVidaTotal();
                        String info = totalSoldados + "-" + vidaTotal + "-" + nombreReino.charAt(0);
                        System.out.printf("| %1$-7s", info);
                    } else {
                        System.out.print("|        ");
                    }
                } else {
                    System.out.print("|        ");
                }
            }
            System.out.println("|"); 
            System.out.println("    -------------------------------------------------------------------------------------------");
        }
    }
}


