package org.walruscode.tda_intro.estructuras;

public class NodoB<K, V> {

    public final K llave;
    public final V valor;
    public NodoB<K, V> siguiente;

    public NodoB(K llave, V valor, NodoB<K, V> siguiente) {
        this.llave = llave;
        this.valor = valor;
        this.siguiente = siguiente;
    }
}
