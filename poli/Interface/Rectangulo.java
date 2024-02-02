package com.poli.Interface;

public class Rectangulo implements Forma{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto){
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double calcularArea(){
        return getAlto() * getAncho();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con ancho: " + getAncho() + " y alto de: " + getAlto();
    }

}
