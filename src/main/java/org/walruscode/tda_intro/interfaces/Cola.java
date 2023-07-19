package org.walruscode.tda_intro.interfaces;

/**
 * TDA Cola
 */
public interface Cola<T> {

    boolean encolar(T elemento);

    T sacar();

    T primero();

    T ultimo();

    int size();

    int maxSize();

    boolean estaVacia();
}
