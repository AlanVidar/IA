/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.busquedaprofunda;
import java.util.Random;

/**
 *
 * @author Medaf
 */
public class xd {

    private static final int FILAS = 11;
    private static final int COLUMNAS = 16;
    private static final int PARED = 1;
    private static final int CAMINO = 0;
    private static final int SALIDA = 9;

    public static void main(String[] args) {
        // Generar 10 laberintos
        for (int i = 0; i < 10; i++) {
            int[][] laberinto = generarLaberinto();
            imprimirLaberinto(laberinto, i + 1);
        }

        // Seleccionar un laberinto aleatorio
        int laberintoSeleccionado = new Random().nextInt(10) + 1;
        System.out.println("\nLaberinto seleccionado: " + laberintoSeleccionado);
    }

    public static int[][] generarLaberinto() {
        int[][] laberinto = new int[FILAS][COLUMNAS];
        Random random = new Random();

        // Llenar el laberinto con caminos y paredes aleatorias
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                laberinto[i][j] = random.nextInt(2); // 0 o 1
            }
        }

        // Asegurar que la entrada y salida estén despejadas
        laberinto[0][0] = CAMINO;
        laberinto[FILAS - 1][COLUMNAS - 1] = SALIDA;

        return laberinto;
    }
    
    
        private static void imprimirLaberinto(int[][] laberinto, int numero) {
        System.out.println("Laberinto " + numero + ":");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}