package org.arbol;

import java.util.ArrayList;
import java.util.List;

public class ListaNodos {
    private List<Nodo> nodos;

    public ListaNodos() {
        this.nodos = new ArrayList<>();
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void removerNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public Nodo buscarNodo(int id) {
        for (Nodo nodo : nodos) {
            if (nodo.getId() == id) {
                return nodo;
            }
        }
        return null;
    }

    // Otros métodos según sea necesario
}
