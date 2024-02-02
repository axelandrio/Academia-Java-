package com.poli.Interface;

public class Cuadrado implements Forma{
    private double lado;

    public Cuadrado(double lado){
        this.setLado(lado);
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        if(lado > 0)
            this.lado = lado;
    }

    public double calcularArea(){
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con lado: " + getLado();
    }
}
