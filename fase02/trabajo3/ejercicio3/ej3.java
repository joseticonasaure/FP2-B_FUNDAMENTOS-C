interface Barco {
    void navegar();
}
interface Avion {
    void volar();
}

// Clase Hidroavion que implementa las interfaces Barco y Avion
class Hidroavion implements Barco, Avion{
    @Override
    public void navegar(){
        System.out.println("El hidroavión navega por el agua.");
    }

    @Override
    public void volar(){
        System.out.println("El hidroavión despega y vuela.");
    }
}

public class ej3{
    public static void main(String[] args){
        Hidroavion miHidroavion = new Hidroavion();
        miHidroavion.navegar();
        miHidroavion.volar();
    }
}
