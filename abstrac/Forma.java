package com.abstrac;

public abstract class Forma {
    //Método abstracto para calcular área
    public abstract double calcularArea();

    //Método abstracto para dibujar la forma
    public abstract void dibujar();

    //Método toString que proporciona el nombre de la clase de la instancia actual

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
