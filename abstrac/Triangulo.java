package com.abstrac;

public class Triangulo extends Forma {
    private double base, altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return base * altura;
    }
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triángulo con base " + base + " y altura " + altura);
    }
}
