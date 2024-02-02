package com.abstrac;

public class Rectangulo extends Forma {
    private double ancho, alto;

    public Rectangulo(double base, double altura){
        this.ancho = base;
        this.alto = altura;
    }

    @Override
    public double calcularArea(){
        return ancho * alto;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un rectángulo de " + ancho + " por " + alto + " de alto");
    }
}
