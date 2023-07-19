package org.walruscode.tda_intro.interfaces;

/**
 * TDA Cola
 */
public interface Cola<T> {

    boolean encolar(T elemento);

    /**
     * Retorna nulo si la cola está vacía
     */
    T sacar();

    /**
     * Retorna nulo si la cola está vacía
     */
    T primero();

    /**
     * Retorna nulo si la cola está vacía
     */
    T ultimo();

    int size();

    int maxSize();

    boolean estaVacia();
}
