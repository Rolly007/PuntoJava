package com.company;

    public class Punto {
        double x;
        double y;
    public Punto(double px, double py){
        this.x=px;
        this.y=py;
    }
    public Punto calcular(Punto p1){
        double punto1=Math.pow(this.x-p1.x,2);
        double punto2=Math.pow(this.y-p1.y,2);
        double resultado = Math.sqrt(punto1+punto2);
        Punto p = new Punto(resultado, 0);
        return p;
    }

    public void mostrar(){
        System.out.print("La distancia entre los puntos es: "+x);
    }
}
