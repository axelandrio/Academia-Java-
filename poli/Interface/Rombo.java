package com.poli.Interface;

public class Rombo implements Forma{
    private double diagonalMayor;
    private double diagonalMenor;
    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.setDiagonalMayor(diagonalMayor);
        this.setDiagonalMenor(diagonalMenor);
    }


    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularArea(){
        return (getDiagonalMayor() * getDiagonalMenor())/2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " con diagonal mayor: " + getDiagonalMayor() + " y diagonal menor de: " + getDiagonalMenor();
    }
}
