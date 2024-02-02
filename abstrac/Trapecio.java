package com.abstrac;

public class Trapecio extends Forma {
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return ((baseMayor+baseMenor)/2)*altura;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un círculo con base mayor de: " + baseMayor + ", base menor de: " + baseMenor + " y altura de: " + altura);
    }
}
