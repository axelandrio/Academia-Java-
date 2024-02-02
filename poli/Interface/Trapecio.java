package com.poli.Interface;

public class Trapecio implements Forma{
    private double baseMayor;
    private double baseMenor;
    private double altura;


    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.setBaseMayor(baseMayor);
        this.setBaseMenor(baseMenor);
        this.setAltura(altura);
    }


    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return ((getBaseMayor()+getBaseMenor())/2) * getAltura();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con base mayor: " + getBaseMayor() + " , base menor de: " + getBaseMenor() + " y altura de: " + getAltura();
    }
}
