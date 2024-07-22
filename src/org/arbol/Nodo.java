package org.arbol;


public class Nodo {
    private int id;
    private String nombre;
    private int peso;
    private Nodo left;
    private Nodo right;
    
    public Nodo(int id, String nombre, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.left = null;
        this.right = null;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
}
