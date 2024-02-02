package com.polimorfismo;

public class Circulo extends Forma{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un círculo con radio: " + radio);
    }
}
