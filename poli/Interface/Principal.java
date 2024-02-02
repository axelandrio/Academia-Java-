package com.poli.Interface;

import java.util.ArrayList;
import java.util.List;

public class Principal {
        public static void main(String[] args) {
            List<Forma> formas = new ArrayList<>();
            formas.add(new Circulo(3));
            formas.add(new Cuadrado(10));
            formas.add(new Rectangulo(9,5));
            formas.add(new Rombo(8,6));
            formas.add(new Trapecio(10, 7, 5));
            formas.add(new Triangulo(7, 10));
            for (Forma forma : formas) {
                System.out.println("-----------------------------");
                System.out.println(forma);
                System.out.println("Área: " + forma.calcularArea());
            }
        }
    }
