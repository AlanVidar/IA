/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.algoritmoevolutivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author Medaf
 */
public class AlgoritmoEvolutivo {
    private List<horario> muestra;
    private List<Profesor> listaProfesores;

    private int tamanoMuestra;
    private int numeroGeneracion;
    private int numProfesores;
    private int numSalones;
    private int numDias;
    private int numBloques;
    private int numMaterias;  // Agregado
    private double probabilidadMutacion;
    
    public AlgoritmoEvolutivo(int tamanoMuestra, int numeroGeneracion, List<Profesor> listaProfesores ,int numProfesores, int numSalones, int numDias, int numBloques,int numMaterias, double probabilidadMutacion) {
        this.tamanoMuestra = tamanoMuestra;
        this.numeroGeneracion = numeroGeneracion;
        this.muestra = new ArrayList<>();
        this.numProfesores = numProfesores;
        this.numSalones = numSalones;
        this.numDias = numDias;
        this.numBloques = numBloques;
        this.numMaterias = numMaterias;
        this.probabilidadMutacion = probabilidadMutacion; // Agrega esta línea
        
        this.listaProfesores = listaProfesores;

    }
    
     private Profesor obtenerProfesorPorNombre(String nombre) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getNombre().equals(nombre)) {
                return profesor;
            }
        }
        return null; // Si el profesor no se encuentra
    }

    private double evaluarAptitud(horario horario) {
        double aptitud = 0.0;

        // Otros criterios de evaluación que puedas tener

        // Evaluar prioridad de profesores
        for (int dia = 0; dia < numDias; dia++) {
            for (int bloque = 0; bloque < numBloques; bloque++) {
                String profesor = horario.obtenerProfesor(dia, bloque);
                Profesor profesorObj = obtenerProfesorPorNombre(profesor);
                if (profesorObj != null) {
                    aptitud += profesorObj.getPrioridad();
                }
            }
        }

        return aptitud;
    }
    
    
    private void reemplazarMuestra(List<horario> nuevosHorarios) {
        muestra.clear();
        muestra.addAll(nuevosHorarios);
    }
    
    public void ejecutar() {
        inicializarMuestra();
        for (int i = 0; i < numeroGeneracion; i++) {
            List<horario> seleccionados = seleccionar();
            List<horario> nuevosHorarios = cruzar(seleccionados);
            mutar(nuevosHorarios);
            reemplazarMuestra(nuevosHorarios);
        }
        horario mejorHorario = getMejorHorario();
        System.out.println("Mejor horario: \n" + mejorHorario);
    }

    public void inicializarMuestra() {
        for (int i = 0; i < tamanoMuestra; i++) {
            List<Profesor> profesoresDisponibles = new ArrayList<>(listaProfesores);

            horario horario = generarHorarioAleatorio();
            muestra.add(horario);
        }
    }


private horario generarHorarioAleatorio() {
    horario horario = new horario(numDias, numBloques);
    Random random = new Random();

    // Lista de profesores disponibles, inicialmente contiene todos los profesores
    List<Profesor> profesoresDisponibles = new ArrayList<>(listaProfesores);

    // Lógica para asignar aleatoriamente clases a profesores, materias y salones
    for (int dia = 0; dia < numDias; dia++) {
        for (int bloque = 0; bloque < numBloques; bloque++) {
            // Verificar si hay profesores disponibles
            if (!profesoresDisponibles.isEmpty()) {
                // Seleccionar profesor aleatorio
                int profesorIndex = random.nextInt(profesoresDisponibles.size());
                Profesor profesorSeleccionado = profesoresDisponibles.get(profesorIndex);

                // Verificar disponibilidad del profesor
                if (profesorSeleccionado.isDisponible()) {
                    // Asignar profesor al horario
                    String nombreProfesor = profesorSeleccionado.getNombre();
                    String materia = "Materia" + random.nextInt(numMaterias);
                    String salon = "Salon" + random.nextInt(numSalones);
                    horario.asignarClase(dia, bloque, nombreProfesor, materia, salon);

                    // Eliminar profesor seleccionado de la lista de profesores disponibles
                    //profesoresDisponibles.remove(profesorSeleccionado);
                }
            }
            // Puedes agregar un else para manejar el caso donde no hay profesores disponibles
        }
    }
    return horario;
}


private Profesor obtenerProfesorPrioritario(List<Profesor> profesoresDisponibles) {
    // Utiliza un comparador para ordenar la lista de profesores por prioridad
    profesoresDisponibles.sort(Comparator.comparingInt(Profesor::getPrioridad));

    // Devuelve el profesor con la mayor prioridad (el primero después de ordenar)
    return profesoresDisponibles.get(0);
}

    
        private List<horario> seleccionar() {
    List<horario> seleccionados = new ArrayList<>();
    Random random = new Random();

    // Implementar selección basada en aptitud (torneo)
    for (int i = 0; i < tamanoMuestra; i++) {
        int indice1 = random.nextInt(tamanoMuestra);
        int indice2 = random.nextInt(tamanoMuestra);

        horario horario1 = muestra.get(indice1);
        horario horario2 = muestra.get(indice2);

        // Evaluar y seleccionar el horario con mejor aptitud
        if (evaluarAptitud(horario1) < evaluarAptitud(horario2)) {
            seleccionados.add(horario1);
        } else {
            seleccionados.add(horario2);
        }
    }

    return seleccionados;
}

private List<horario> cruzar(List<horario> seleccionados) {
    List<horario> nuevosHorarios = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < tamanoMuestra; i += 2) {
        horario padre1 = seleccionados.get(i);
        horario padre2 = seleccionados.get(i + 1);

        // Implementar el cruce de un punto
        int puntoCruce = random.nextInt(numBloques);

        // Crear dos nuevos horarios a partir de los padres
        horario hijo1 = cruzarHorarios(padre1, padre2, puntoCruce);
        horario hijo2 = cruzarHorarios(padre2, padre1, puntoCruce);

        nuevosHorarios.add(hijo1);
        nuevosHorarios.add(hijo2);
    }

    return nuevosHorarios;
}
private horario cruzarHorarios(horario padre1, horario padre2, int puntoCruce) {
    horario hijo = new horario(numDias, numBloques);

    // Copiar la primera parte del horario del padre1 al hijo
    for (int dia = 0; dia < numDias; dia++) {
        for (int bloque = 0; bloque < puntoCruce; bloque++) {
            hijo.asignarClase(dia, bloque, padre1.obtenerProfesor(dia, bloque), padre1.obtenerMateria(dia, bloque), padre1.obtenerSalon(dia, bloque));
        }
    }

    // Copiar la segunda parte del horario del padre2 al hijo
    for (int dia = 0; dia < numDias; dia++) {
        for (int bloque = puntoCruce; bloque < numBloques; bloque++) {
            hijo.asignarClase(dia, bloque, padre2.obtenerProfesor(dia, bloque), padre2.obtenerMateria(dia, bloque), padre2.obtenerSalon(dia, bloque));
        }
    }

    return hijo;
}


private void mutar(List<horario> nuevosHorarios) {
    Random random = new Random();
    // Implementar la mutación de horarios
    for (horario horario : nuevosHorarios) {
        if (random.nextDouble() < probabilidadMutacion) {
            // Realizar la mutación (por ejemplo, intercambiar dos clases)
            int dia1 = random.nextInt(numDias);
            int bloque1 = random.nextInt(numBloques);
            int dia2 = random.nextInt(numDias);
            int bloque2 = random.nextInt(numBloques);

            String profesor1 = horario.obtenerProfesor(dia1, bloque1);
            String materia1 = horario.obtenerMateria(dia1, bloque1);
            String salon1 = horario.obtenerSalon(dia1, bloque1);

            String profesor2 = horario.obtenerProfesor(dia2, bloque2);
            String materia2 = horario.obtenerMateria(dia2, bloque2);
            String salon2 = horario.obtenerSalon(dia2, bloque2);

            horario.asignarClase(dia1, bloque1, profesor2, materia2, salon2);
            horario.asignarClase(dia2, bloque2, profesor1, materia1, salon1);
        }
    }
}


public horario getMejorHorario() {
    double mejorAptitud = Double.POSITIVE_INFINITY;
    horario mejorHorario = null;

    for (horario horario : muestra) {
        double aptitudActual = evaluarAptitud(horario);
        if (aptitudActual < mejorAptitud) {
            mejorAptitud = aptitudActual;
            mejorHorario = horario;
        }
    }

    return mejorHorario;
}


}
