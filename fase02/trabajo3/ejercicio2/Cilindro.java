class Cilindro {
       private double longitud;
       private Circulo c;
    public Cilindro(double x, double y, double r, double l){
        this.c = new Circulo(x,y,r);
        this.longitud = l;
    }
    public double superficie(){
        double radio = c.getRadio();
        return 2 * radio * (longitud + radio);
    }
}
