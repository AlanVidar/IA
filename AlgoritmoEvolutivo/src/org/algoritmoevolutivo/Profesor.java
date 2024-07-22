/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.algoritmoevolutivo;

/**
 *
 * @author Medaf
 */
public class Profesor {
    
    private String nombre;
    private int prioridad;
    private boolean disponible;
    
    public Profesor(String nombre, int prioridad, boolean disponible) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
