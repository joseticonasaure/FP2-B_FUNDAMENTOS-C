class Circulo{
    private Punto p;
    private double radio;
    public Circulo(double x, double y, double r){
         this.p = new Punto(x, y);
         this.radio = r;
    }
    public double getRadio(){
         return radio;
    }
    public double getCentro(){
         return p;
    }
}
