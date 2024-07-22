/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.busquedaprofunda;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.swing.JFrame;
import java.util.Random;


/**
 *
 * @author Medaf
 */

public class Main extends javax.swing.JFrame {
    
    
    private final List<Integer> camino = new ArrayList<>();
    private int[][] mapa;
    public int indiceLaberinto = 1; // Laberinto inicial

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        //mapa = xd.generarLaberinto();
        mapa = laberintosPred.obtenerLaberinto(indiceLaberinto);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("ENCONTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cambiar Laberinto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 // Utiliza el laberinto específico para la búsqueda
        mapa = laberintosPred.obtenerLaberinto(indiceLaberinto);

        boolean encontrado = BusquedaAnchura(mapa, 1, 1);

        if (encontrado) {
            repaint();
            System.out.println("¡Camino encontrado!");
        } else {
            System.out.println("No se encontró un camino.");
        }

        // Actualiza al siguiente laberinto
        //indiceLaberinto = (indiceLaberinto % laberintosPred.obtenerCantidadLaberintos()) + 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        indiceLaberinto++;
        reiniciarLaberinto();
        repaint(); // Para redibujar el nuevo laberinto
    }//GEN-LAST:event_jButton2ActionPerformed

    private void reiniciarLaberinto() {
    //mapa = xd.generarLaberinto(); // Utiliza tu método para generar un nuevo laberinto
    //camino.clear(); // Limpia el camino anterior
    //System.out.println("Laberinto reiniciado.");
    
    mapa = laberintosPred.obtenerLaberinto(indiceLaberinto); // Utiliza tu método para obtener el laberinto actual
    camino.clear(); // Limpia el camino anterior

    System.out.println("Laberinto reiniciado.");
    
    if(indiceLaberinto==7){
        indiceLaberinto=1;
        mapa = laberintosPred.obtenerLaberinto(indiceLaberinto); // Utiliza tu método para obtener el laberinto actual
        camino.clear(); // Limpia el camino anterior

    }
}
    @Override
public void paint(Graphics g) {
    super.paint(g);

    int cellSize = 20;

    // Ajustar posición del laberinto
    int offsetX = 30;
    int offsetY = 30;

    // Draw the maze
    for (int row = 0; row < mapa.length; row++) {
        for (int col = 0; col < mapa[0].length; col++) {
            Color color;
            switch (mapa[row][col]) {
                case 1:
                    color = Color.BLACK; // Pared
                    break;
                case 9:
                    color = Color.RED; // Salida
                    break;
                default:
                    color = Color.WHITE; // Camino
            }
            g.setColor(color);
            g.fillRect(offsetX + col * cellSize, offsetY + row * cellSize, cellSize, cellSize);

            // Dibujar bordes del camino en rojo
            if (camino.contains(col) && camino.contains(row)) {
                g.setColor(Color.RED);
                g.drawRect(offsetX + col * cellSize, offsetY + row * cellSize, cellSize, cellSize);
            }
        }
    }

    // Draw the path in green
    for (int i = 0; i < camino.size(); i += 2) {
        int caminoX = camino.get(i);
        int caminoY = camino.get(i + 1);

        // Ajustar las coordenadas del camino según el desplazamiento
        int adjustedX = offsetX + caminoX * cellSize;
        int adjustedY = offsetY + caminoY * cellSize;

        g.setColor(Color.green);
        g.fillRect(adjustedX, adjustedY, cellSize, cellSize);
    }
}


     public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    
public boolean BusquedaAnchura(int[][] mapa, int x, int y) {
    return BusquedaAnchuraHelper(mapa, x, y);
}

private boolean BusquedaAnchuraHelper(int[][] mapa, int x, int y) {
    Queue<Integer> queue = new LinkedList<>();
    Map<Integer, Integer> visited = new HashMap<>();

    int startKey = getKey(x, y, mapa[0].length);
    queue.add(startKey);
    visited.put(startKey, -1); // Usamos -1 para representar el inicio

    while (!queue.isEmpty()) {
        int currentKey = queue.poll();
        int currentX = getX(currentKey, mapa[0].length);
        int currentY = getY(currentKey, mapa[0].length);

        if (mapa[currentY][currentX] == 9) { // Encontró la salida
            reconstructPath(visited, currentKey);
            return true;
        }

        int[] Nodos = {0, 1, 0, -1, 1, 0, -1, 0}; // Movimientos posibles (derecha, abajo, izquierda, arriba)

        for (int i = 0; i < Nodos.length; i += 2) {
            int nextX = currentX + Nodos[i];
            int nextY = currentY + Nodos[i + 1];
            int nextKey = getKey(nextX, nextY, mapa[0].length);

            if (isValid(nextX, nextY, mapa) && !visited.containsKey(nextKey) && mapa[nextY][nextX] != 1) {
                queue.add(nextKey);
                visited.put(nextKey, currentKey);
            }
        }
    }

    return false; // No se encontró un camino
}

// Métodos auxiliares para manejar las coordenadas y claves
private int getKey(int x, int y, int width) {
    return y * width + x;
}

private int getX(int key, int width) {
    return key % width;
}

private int getY(int key, int width) {
    return key / width;
}

private boolean isValid(int x, int y, int[][] mapa) {
    return x >= 0 && x < mapa[0].length && y >= 0 && y < mapa.length;
}

private void reconstructPath(Map<Integer, Integer> visited, int endKey) {
    int currentKey = endKey;
    List<Integer> reversedCamino = new ArrayList<>(); // Lista temporal para almacenar el camino invertido

    while (currentKey != -1) {
        int currentX = getX(currentKey, mapa[0].length);
        int currentY = getY(currentKey, mapa[0].length);
        reversedCamino.add(currentX);
        reversedCamino.add(currentY);
        currentKey = visited.get(currentKey);
    }

    // Invertir la lista antes de agregarla al camino
    for (int i = reversedCamino.size() - 2; i >= 0; i -= 2) {
        camino.add(reversedCamino.get(i));
        camino.add(reversedCamino.get(i + 1));
    }
}



     
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
