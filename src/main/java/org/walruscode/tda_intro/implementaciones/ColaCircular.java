package org.walruscode.tda_intro.implementaciones;

import org.walruscode.tda_intro.interfaces.Cola;

public class  ColaCircular<T> implements Cola<T> {

    private T[] arreglo;
    private final int maxSize;
    private int size;
    private int primero;
    private int ultimo;

    public ColaCircular(int maxSize) {
        this.maxSize = maxSize;

        arreglo = (T[]) new Object[maxSize];
        primero = 0;
        ultimo = 1;
        size = 0;
    }

    @Override
    public boolean encolar(T elemento) {
        if (size == maxSize) return false;

        ultimo = Math.floorMod(ultimo - 1, maxSize);
        arreglo[ultimo] = elemento;
        size++;

        return true;
    }

    @Override
    public T sacar() {
        if (size == 0) return null;

        T elemento = arreglo[primero];

        primero = Math.floorMod(primero - 1, maxSize);
        size--;

        return elemento;
    }

    @Override
    public T primero() {
        return arreglo[primero];
    }

    @Override
    public T ultimo() {
        return arreglo[ultimo];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int maxSize() {
        return maxSize;
    }

    @Override
    public boolean estaVacia() {
        return size == 0;
    }
}
