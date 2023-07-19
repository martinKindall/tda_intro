package org.walruscode.tda_intro.ejemplos;

import org.walruscode.tda_intro.implementaciones.TablaHash;
import org.walruscode.tda_intro.interfaces.Diccionario;

public class EjemploDiccionario {

    public static void main(String[] args) {

        Diccionario<String, Gato> gatos = new TablaHash<>();

        gatos.insertar("gato1", new Gato("Garfield", 5));
        gatos.insertar("gato2", new Gato("Felix", 9));

        System.out.println(gatos.leer("gatoNoExistente"));
        System.out.println(gatos.leer("gato1"));
        System.out.println(gatos.leer("gato2"));

        gatos.insertar("gato1", new Gato("Garfield y sus amigos", 6));
        System.out.println(gatos.leer("gato1"));

        gatos.borrar("gato2");
        System.out.println(gatos.leer("gato2"));
    }


    static class Gato {
        String nombre;
        int edad;

        Gato(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false;

            if (o instanceof Gato gato) return gato.nombre.equals(nombre);

            return false;
        }

        @Override
        public int hashCode() {
            return nombre.hashCode();
        }

        @Override
        public String toString() {
            return "El gato es " + nombre + " y su edad es " + edad;
        }
    }
}
