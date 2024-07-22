package org.arbol;

public class Arbol {
    private Nodo raiz;
    private int contadorComparaciones = 0;
    private int contadorComparacionesPreOrden;
    private int contadorComparacionesInOrden;
    private int contadorComparacionesPostOrden;
    
    public Arbol() {
        this.raiz = null;
        this.contadorComparacionesPreOrden = 0;
        this.contadorComparacionesInOrden = 0;
        this.contadorComparacionesPostOrden = 0;
    }
        public Nodo getRaiz() {
        return raiz;
    }
    public void insertar(Nodo nodo) {
        if (raiz == null) {
            raiz = nodo;
        } else {
            insertarRec(raiz, nodo);
        }
    }

    private void insertarRec(Nodo raizSubarbol, Nodo nodo) {
        if (nodo.getPeso() < raizSubarbol.getPeso()) {
            if (raizSubarbol.getLeft() == null) {
                raizSubarbol.setLeft(nodo);
            } else {
                insertarRec(raizSubarbol.getLeft(), nodo);
            }
        } else {
            if (raizSubarbol.getRight() == null) {
                raizSubarbol.setRight(nodo);
            } else {
                insertarRec(raizSubarbol.getRight(), nodo);
            }
        }
    }

    public Nodo buscar(int peso) {
        //contadorComparaciones = 0; //Reinicio del contador
        
        return buscarRec(raiz, peso);
    }

    private Nodo buscarRec(Nodo raizSubarbol, int peso) {

    if (raizSubarbol == null || raizSubarbol.getPeso() == peso) {
        contadorComparaciones++;
        return raizSubarbol;
    }

    contadorComparaciones++;
    if (peso < raizSubarbol.getPeso()) {
        return buscarRec(raizSubarbol.getLeft(), peso);
    } else {
        return buscarRec(raizSubarbol.getRight(), peso);
    }
    
    }
    

    public void setContadorComparaciones(int contadorComparaciones) {
        this.contadorComparaciones = contadorComparaciones;
    }
    
    
    
    public void reiniciarContadorComparaciones() {
            contadorComparacionesPreOrden = 0;
            contadorComparacionesInOrden = 0;
            contadorComparacionesPostOrden = 0;
    }
    
    public void editar(int id, Nodo nuevoNodo) {
        eliminar(id); // Eliminamos el nodo con el ID dado
        insertar(nuevoNodo); // Insertamos el nuevo nodo
    }
    
    public void eliminar(int id) {
        raiz = eliminarRec(raiz, id);
    }

    private Nodo eliminarRec(Nodo raizSubarbol, int id) {
        if (raizSubarbol == null) {
            return null;
        }

        if (id < raizSubarbol.getId()) {
            raizSubarbol.setLeft(eliminarRec(raizSubarbol.getLeft(), id));
        } else if (id > raizSubarbol.getId()) {
            raizSubarbol.setRight(eliminarRec(raizSubarbol.getRight(), id));
        } else {
            // Nodo encontrado, realizar eliminación
            if (raizSubarbol.getLeft() == null) {
                return raizSubarbol.getRight();
            } else if (raizSubarbol.getRight() == null) {
                return raizSubarbol.getLeft();
            }

            // Nodo con dos hijos, encontrar sucesor inorden
            raizSubarbol.setId(encontrarMinimo(raizSubarbol.getRight()).getId());

            // Eliminar el sucesor inorden
            raizSubarbol.setRight(eliminarRec(raizSubarbol.getRight(), raizSubarbol.getId()));
        }
        return raizSubarbol;
    }

    private Nodo encontrarMinimo(Nodo nodo) {
        while (nodo.getLeft() != null) {
            nodo = nodo.getLeft();
        }
        return nodo;
    }
    
// Método para obtener el contador de comparaciones en preorden
public int getContadorComparacionesPreOrden() {
    return contadorComparacionesPreOrden;
}

// Método para obtener el contador de comparaciones en inorden
public int getContadorComparacionesInOrden() {
    return contadorComparacionesInOrden;
}

// Método para obtener el contador de comparaciones en postorden
public int getContadorComparacionesPostOrden() {
    return contadorComparacionesPostOrden;
}

    // Métodos de recorrido desde un nodo dado como raíz
    public String preOrden(Nodo nodo) {
        StringBuilder resultado = new StringBuilder();
        contadorComparacionesPreOrden = 0; // reinicia el contador local
        preOrdenRec(nodo, resultado);
        return resultado.toString();
    }

    private void preOrdenRec(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            resultado.append(nodo.getPeso()).append(" "); // Agregar el peso del nodo al resultado
            contadorComparacionesPreOrden++;
            preOrdenRec(nodo.getLeft(), resultado); // Recorrer el subárbol izquierdo
            preOrdenRec(nodo.getRight(), resultado); // Recorrer el subárbol derecho
        }
    }

    public String inOrden(Nodo nodo) {
        StringBuilder resultado = new StringBuilder();
        contadorComparacionesInOrden = 0; // reinicia el contador local
        inOrdenRec(nodo, resultado);
        return resultado.toString();
    }

    private void inOrdenRec(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            inOrdenRec(nodo.getLeft(), resultado); // Recorrer el subárbol izquierdo
            resultado.append(nodo.getPeso()).append(" "); // Agregar el peso del nodo al resultado
            contadorComparacionesInOrden++;
            inOrdenRec(nodo.getRight(), resultado); // Recorrer el subárbol derecho
        }
    }

    public String postOrden(Nodo nodo) {
        StringBuilder resultado = new StringBuilder();
        contadorComparacionesPostOrden = 0; // reinicia el contador local
        postOrdenRec(nodo, resultado);
        return resultado.toString();
    }

    private void postOrdenRec(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            postOrdenRec(nodo.getLeft(), resultado); // Recorrer el subárbol izquierdo
            postOrdenRec(nodo.getRight(), resultado); // Recorrer el subárbol derecho
            resultado.append(nodo.getPeso()).append(" "); // Agregar el peso del nodo al resultado
            contadorComparacionesPostOrden++;
        }
    }
    
}
