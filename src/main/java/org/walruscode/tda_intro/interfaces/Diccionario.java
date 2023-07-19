package org.walruscode.tda_intro.interfaces;

/**
 * TDA Diccionario
 */
public interface Diccionario<K, V> {

    /**
     * Retorna nulo si la llave no existe
     */
    V leer(K llave);

    void insertar(K llave, V valor);

    void borrar(K llave);
}
