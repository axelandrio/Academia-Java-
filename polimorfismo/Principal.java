package com.polimorfismo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3));
        formas.add(new Rectangulo(8,6));
        formas.add(new Triangulo(5,7));
        formas.add(new Cuadrado(10));
        formas.add(new Trapecio(10,7,5));
        formas.add((new Elipse(8, 4)));
        formas.add(new Rombo(12, 8));

        for(Forma forma: formas){
            System.out.println("-----------------------------");
            System.out.println(forma);
            System.out.println("Área: " + forma.calcularArea());
            forma.dibujar();
        }
    }
}
