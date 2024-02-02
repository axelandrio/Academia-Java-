package com.poli.Interface;

public class Triangulo implements Forma{

    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con base: " + getBase() + " y altura de: " + getAltura();
    }
}
