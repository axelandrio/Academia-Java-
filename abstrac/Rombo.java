package com.abstrac;

public class Rombo extends Forma {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea(){
        return (diagonalMayor*diagonalMenor)/2;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un rombo con diagonal mayor de: " + diagonalMayor + " y diagonal menor de: " + diagonalMenor);
    }
}
