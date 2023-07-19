package org.walruscode.tda_intro.interfaces;

public interface Diccionario<K, V> {

    V leer(K llave);

    void insertar(K llave, V valor);

    void borrar(K llave);
}
