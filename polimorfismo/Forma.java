package com.polimorfismo;

public class Forma {
    public double calcularArea(){
        return 0; //
    }

    public void dibujar(){
        System.out.println("Dibujando una forma desconocida");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
