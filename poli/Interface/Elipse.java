package com.poli.Interface;

public class Elipse implements Forma{
    private double ejeMayor;
    private double ejeMenor;

    public Elipse(double ejeMayor, double ejeMenor){
        this.setEjeMayor(ejeMayor);
        this.setEjeMenor(ejeMenor);
    }


    public double getEjeMayor() {
        return ejeMayor;
    }

    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public double getEjeMenor() {
        return ejeMenor;
    }

    public void setEjeMenor(double ejeMenor) {
        this.ejeMenor = ejeMenor;
    }

    @Override
    public double calcularArea(){
        return Math.PI*(getEjeMayor()/2) * (getEjeMenor()/2);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con eje mayor: " + getEjeMayor() + " y un eje menor de: " + getEjeMenor();
    }
}
