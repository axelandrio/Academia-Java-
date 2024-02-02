package com.polimorfismo;

public class Cuadrado extends Forma{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un cuadrado con lado de: " + lado);
    }
}


