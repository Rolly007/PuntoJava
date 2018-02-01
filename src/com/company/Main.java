package com.company;

public class Main {

    public static void main(String[] args) {
        Punto p1= new Punto(1,0);
        Punto p2= new Punto(100,0);

        Punto resultado=p2.calcular(p1);
        resultado.mostrar();
    }
}
