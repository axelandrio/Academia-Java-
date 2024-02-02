package com.poli.Interface;

public class Circulo implements Forma{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        if(radio > 0)
            this.radio = radio;
        else
            System.out.println("El radio debe ser mayor a 0");
    }

    @Override
    public double calcularArea(){
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con radio: " + getRadio(); // Uso de getter para acceder al radio
    }
}
