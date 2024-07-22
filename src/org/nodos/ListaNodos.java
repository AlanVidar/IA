
package org.nodos;

import java.util.ArrayList;

public class ListaNodos {
    private ArrayList<nodo>lista;
    
    public ListaNodos(ArrayList<nodo> lista){
        this.lista = lista;
    }
    public void AgregarNodo(nodo nodo){
        this.lista.add(nodo);
    }
    public ArrayList<nodo> getActualizar(){
        return this.lista;
    }
    public nodo Buscar(nodo nodo){
        nodo aux= null;
        for(nodo n : lista){
            if(n.getNodo_id() == nodo.getNodo_id()){
                aux = new nodo();
                aux.setNodo_id(n.getNodo_id());
                aux.setNombre(n.getNombre());
                aux.setPeso(n.getPeso());
            }
        }
        
        return aux;
    }
    
    public int NuevoNodo(){
        return 0;
    }
    public void EditarNodo(nodo nodoEditado){
        for (nodo n : lista) {
            if (n.getNodo_id() == nodoEditado.getNodo_id()){
                n.setNombre(nodoEditado.getNombre());
                n.setPeso(nodoEditado.getPeso());
                break;
            }
        }
    }
    public void EliminarNodo(nodo nodoEliminar){
        lista.removeIf(n -> n.getNodo_id() == nodoEliminar.getNodo_id());
    }
}
