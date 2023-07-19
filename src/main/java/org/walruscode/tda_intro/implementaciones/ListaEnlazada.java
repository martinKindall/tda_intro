package org.walruscode.tda_intro.implementaciones;

import org.walruscode.tda_intro.estructuras.Nodo;
import org.walruscode.tda_intro.interfaces.Lista;

public class ListaEnlazada<T> implements Lista<T> {

    private final Nodo<T> cabeza;
    private int size;

    public ListaEnlazada() {
        this.cabeza = new Nodo<>();
        this.size = 0;
    }

    @Override
    public boolean estaVacia() {
        return cabeza.siguiente == null;
    }

    @Override
    public T get(int pos) {
        if (pos < 0 || (pos + 1 > size)) return null;

        int idx = 0;
        Nodo<T> actual = cabeza.siguiente;

        while (actual != null) {
            if (idx < pos) {
                idx++;
                actual = actual.siguiente;
                continue;
            }

            return actual.valor;
        }

        return null;
    }

    @Override
    public void agregar(T valor) {
        agregar(size, valor);
    }

    @Override
    public void agregar(int pos, T valor) {
        if (pos > size || pos < 0) return;

        Nodo<T> actual = cabeza.siguiente;
        Nodo<T> prev = cabeza;

        int i = 0;
        while (i++ < pos) {
            prev = actual;
            actual = actual.siguiente;
        }

        prev.siguiente = new Nodo<>(valor, actual);

        size++;
    }

    @Override
    public void borrar(int pos) {
        if (pos >= size || pos < 0) return;

        Nodo<T> actual = cabeza.siguiente;
        Nodo<T> prev = cabeza;

        int i = 0;
        while (i++ < pos) {
            prev = actual;
            actual = actual.siguiente;
        }

        prev.siguiente = actual.siguiente;

        size--;
    }

    @Override
    public int largo() {
        return size;
    }
}
