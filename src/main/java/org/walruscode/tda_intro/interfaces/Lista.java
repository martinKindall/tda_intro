package org.walruscode.tda_intro.interfaces;

/**
 * TDA Lista
 */
public interface Lista<T> {

    boolean estaVacia();

    T get(int pos);

    void agregar(T valor);

    /**
     * Inserta el elemento en la posición dada.
     */
    void agregar(int pos, T valor);

    /**
     * Elimina el elemento en la posición dada
     */
    void borrar(int pos);

    int largo();
}
