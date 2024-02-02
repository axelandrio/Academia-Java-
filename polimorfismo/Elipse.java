package com.polimorfismo;

public class Elipse extends Forma{
    private double ejeMayor;
    private double ejeMenor;

    public Elipse(double ejeMayor, double ejeMenor){
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    @Override
    public double calcularArea(){
        return Math.PI*(ejeMayor/2) * (ejeMenor/2);
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un Elipse con eje mayor de: " + ejeMayor + " y eje menor de: "+ ejeMenor);
    }
}
