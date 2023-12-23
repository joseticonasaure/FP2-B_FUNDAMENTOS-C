class Punto {
   private double x, y;
      
   public Punto(double x, double y){
      this.x = x;
      this.y = y;
   }
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   public double distancia(Punto p){
       double distanciaX = this.x - p.getX();
       double distanciaY = this.y - p.getY();
       return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
   }
}
