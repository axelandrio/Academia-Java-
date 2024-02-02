package com.polimorfismo;
import java.util.*;
public class Rectangulo extends Forma{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
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
