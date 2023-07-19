package org.walruscode.tda_intro.ejemplos;

import org.walruscode.tda_intro.implementaciones.ColaCircular;
import org.walruscode.tda_intro.interfaces.Cola;

public class EjemploCola {

    public static void main(String[] args) {

        Cola<Double> numeros = new ColaCircular<>(50);

        numeros.encolar(2.2);
        numeros.encolar(251.22);
        numeros.encolar(12313.474);
        numeros.encolar(12.5);

        System.out.println(numeros.size());
        System.out.println(numeros.sacar());
        System.out.println(numeros.sacar());

        numeros.encolar(755.0);
        numeros.encolar(32000.0);

        System.out.println(numeros.sacar());
        System.out.println(numeros.sacar());
        System.out.println(numeros.estaVacia());
    }
}
