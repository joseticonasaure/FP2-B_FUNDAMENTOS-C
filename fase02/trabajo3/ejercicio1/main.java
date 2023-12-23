public class ej1{
 public static void main(String[] args) {
      Punto p1 = new Punto(1, 5);
      Punto p2 = new Punto(4, 8)
			Circulo circulo = new Circulo(3, 2, 5);
      double distanciaP = p1.distancia(p2);
      System.out.println("La distancia entre estos 2 puntos es "+distanciaP);
      System.out.println("El radio del circulo es "+circulo.getRadio())
	 }
}
