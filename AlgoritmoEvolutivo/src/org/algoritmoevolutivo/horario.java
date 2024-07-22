/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.algoritmoevolutivo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Medaf
 */
public class horario {
    private List<List<Clase>> horario;

    public horario(int numDias, int numBloques) {
        horario = new ArrayList<>(numDias);
        for (int i = 0; i < numDias; i++) {
            List<Clase> dia = new ArrayList<>(numBloques);
            for (int j = 0; j < numBloques; j++) {
               dia.add(new Clase("", "", ""));
            }
            horario.add(dia);
        }
    }

    public String obtenerProfesor(int dia, int bloque) {
        return horario.get(dia).get(bloque).getProfesor();
    }

    public String obtenerMateria(int dia, int bloque) {
        return horario.get(dia).get(bloque).getMateria();
    }

    public String obtenerSalon(int dia, int bloque) {
        return horario.get(dia).get(bloque).getAula();
    }

    public void asignarClase(int dia, int bloque, String profesor, String materia, String salon) {
        horario.get(dia).set(bloque, new Clase(profesor, materia, salon));
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (List<Clase> dia : horario) {
            result.append(dia).append("\n");
        }
        return result.toString();
    }

    // Clase interna para representar una clase en el horario
    private static class Clase {
        private String profesor;
        private String materia;
        private String aula;

        public Clase(String profesor, String materia, String aula) {
            this.profesor = profesor;
            this.materia = materia;
            this.aula = aula;
        }

        public String getProfesor() {
            return profesor;
        }

        public String getMateria() {
            return materia;
        }

        public String getAula() {
            return aula;
        }

        @Override
        public String toString() {
            return "[" + profesor + ", " + materia + ", " + aula + "]";
        }
    }




}


