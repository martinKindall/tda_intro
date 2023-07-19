package org.walruscode.tda_intro.ejemplos;

import org.walruscode.tda_intro.implementaciones.ListaEnlazada;
import org.walruscode.tda_intro.interfaces.Lista;

public class EjemploLista {

    public static void main(String[] args) {
        Lista<String> palabras = new ListaEnlazada<>();

        palabras.agregar("Hola");
        palabras.agregar("mundo");
        palabras.agregar("desde");
        palabras.agregar("una");
        palabras.agregar("lista");
        palabras.agregar(":)");

        for (int i = 0; i < palabras.largo(); i++) {
            System.out.print(palabras.get(i));
            System.out.print(" ");
        }
    }
}
