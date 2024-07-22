package org.arbol;


import javax.swing.JOptionPane;

import org.arbol.Nodo;
import org.arbol.Arbol;


public class Main extends javax.swing.JFrame {

    private Arbol arbol;//Se instancia el objeto arbol
    
    public Main() {
        initComponents();
        arbol = new Arbol(); //Se inicializa el arbol
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_RegistroNodos = new javax.swing.JPanel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Peso = new javax.swing.JLabel();
        jButton_Salvar = new javax.swing.JButton();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Peso = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Editar = new javax.swing.JButton();
        jButton_Remover = new javax.swing.JButton();
        jPanelRecorridos = new javax.swing.JPanel();
        jLabel_PreOrden = new javax.swing.JLabel();
        jLabel_InOrden = new javax.swing.JLabel();
        jLabel_PostOrden = new javax.swing.JLabel();
        jTextField_PreOrden = new javax.swing.JTextField();
        jLabel_Tiempo = new javax.swing.JLabel();
        jTextField_InOrden = new javax.swing.JTextField();
        jTextField_PostOrden = new javax.swing.JTextField();
        jTextField_Tiempo_Pre = new javax.swing.JTextField();
        jTextField_Tiempo_In = new javax.swing.JTextField();
        jTextField_Tiempo_Post = new javax.swing.JTextField();
        jButton_Ejecutar = new javax.swing.JButton();
        jComboBox_Recorridos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_ID.setText("ID:");

        jLabel_Nombre.setText("Nombre:");

        jLabel_Peso.setText("Peso:");

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });

        jTextField_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PesoActionPerformed(evt);
            }
        });

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jButton_Editar.setText("Editar");
        jButton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarActionPerformed(evt);
            }
        });

        jButton_Remover.setText("Remover Texto");
        jButton_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_RegistroNodosLayout = new javax.swing.GroupLayout(jPanel_RegistroNodos);
        jPanel_RegistroNodos.setLayout(jPanel_RegistroNodosLayout);
        jPanel_RegistroNodosLayout.setHorizontalGroup(
            jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegistroNodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ID)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jLabel_Peso))
                .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RegistroNodosLayout.createSequentialGroup()
                        .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_RegistroNodosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jButton_Salvar)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel_RegistroNodosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Editar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Remover))
                    .addGroup(jPanel_RegistroNodosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(105, 105, 105))
        );
        jPanel_RegistroNodosLayout.setVerticalGroup(
            jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegistroNodosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ID)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Peso)
                    .addComponent(jTextField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel_RegistroNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Editar)
                    .addComponent(jButton_Remover))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de nodos", jPanel_RegistroNodos);

        jLabel_PreOrden.setText("Recorrido PreOrden");

        jLabel_InOrden.setText("Recorrido InOrden");

        jLabel_PostOrden.setText("Recorrido PostOrden");

        jTextField_PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PreOrdenActionPerformed(evt);
            }
        });

        jLabel_Tiempo.setText("Tiempos:");

        jTextField_InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_InOrdenActionPerformed(evt);
            }
        });

        jTextField_PostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PostOrdenActionPerformed(evt);
            }
        });

        jTextField_Tiempo_Pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Tiempo_PreActionPerformed(evt);
            }
        });

        jTextField_Tiempo_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Tiempo_InActionPerformed(evt);
            }
        });

        jTextField_Tiempo_Post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Tiempo_PostActionPerformed(evt);
            }
        });

        jButton_Ejecutar.setText("Ejecutar");
        jButton_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EjecutarActionPerformed(evt);
            }
        });

        jComboBox_Recorridos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PreOrden", "InOrden", "PostOrden" }));
        jComboBox_Recorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_RecorridosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRecorridosLayout = new javax.swing.GroupLayout(jPanelRecorridos);
        jPanelRecorridos.setLayout(jPanelRecorridosLayout);
        jPanelRecorridosLayout.setHorizontalGroup(
            jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecorridosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRecorridosLayout.createSequentialGroup()
                        .addComponent(jLabel_PreOrden)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_PreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRecorridosLayout.createSequentialGroup()
                        .addComponent(jLabel_PostOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_PostOrden))
                    .addGroup(jPanelRecorridosLayout.createSequentialGroup()
                        .addComponent(jLabel_InOrden)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField_InOrden)))
                .addGap(69, 69, 69)
                .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Tiempo)
                    .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Tiempo_Pre)
                        .addComponent(jTextField_Tiempo_In)
                        .addComponent(jTextField_Tiempo_Post, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecorridosLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jComboBox_Recorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jButton_Ejecutar)
                .addGap(131, 131, 131))
        );
        jPanelRecorridosLayout.setVerticalGroup(
            jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecorridosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Recorridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Ejecutar))
                .addGap(32, 32, 32)
                .addComponent(jLabel_Tiempo)
                .addGap(18, 18, 18)
                .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PreOrden)
                    .addComponent(jTextField_PreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Tiempo_Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_InOrden)
                    .addComponent(jTextField_InOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Tiempo_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRecorridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PostOrden)
                    .addComponent(jTextField_PostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Tiempo_Post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Recorridos", jPanelRecorridos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jTextField_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PesoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jTextField_ID.getText());
            String nombre = jTextField_Nombre.getText();
            int peso = Integer.parseInt(jTextField_Peso.getText());

            Nodo nuevoNodo = new Nodo(id, nombre, peso);
            arbol.insertar(nuevoNodo);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(this, "Nodo guardado exitosamente.");
        } catch (NumberFormatException e) {
            // Manejo de excepción si la entrada no es válida
            JOptionPane.showMessageDialog(this, "Por favor, introduzca valores válidos para el ID y el Peso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_SalvarActionPerformed
    
    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        try {
            int peso = Integer.parseInt(jTextField_Peso.getText());
            Nodo nodo = arbol.buscar(peso);

            if (nodo != null) {
                // Mostrar la información del nodo encontrado
                jTextField_Nombre.setText(nodo.getNombre());
                jTextField_ID.setText(String.valueOf(nodo.getId()));
            } else {
                // Mensaje si el nodo no se encuentra
                JOptionPane.showMessageDialog(this, "Nodo no encontrado.");
            }
        } catch (NumberFormatException e) {
            // Manejo de excepción si la entrada no es válida
            JOptionPane.showMessageDialog(this, "Por favor, introduzca un valor válido para el ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jTextField_ID.getText());
            String nombre = jTextField_Nombre.getText();
            int peso = Integer.parseInt(jTextField_Peso.getText());

            Nodo nodo = arbol.buscar(id);
            if (nodo != null) {
                nodo.setNombre(nombre);
                nodo.setPeso(peso);
                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Nodo editado exitosamente.");
            } else {
                // Mostrar un mensaje si el nodo no se encuentra
                JOptionPane.showMessageDialog(this, "Nodo no encontrado.");
            }
        } catch (NumberFormatException e) {
            // Manejo de excepción si la entrada no es válida
            JOptionPane.showMessageDialog(this, "Por favor, introduzca valores válidos para el ID y el Peso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_EditarActionPerformed
    
    
    private void jButton_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoverActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jTextField_ID.getText());
            Nodo nodo = arbol.buscar(id);

            if (nodo != null) {
                arbol.eliminar(id);
                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Nodo eliminado exitosamente.");
                // Limpiar los campos de texto después de eliminar
                jTextField_Nombre.setText("");
                jTextField_Peso.setText("");
            } else {
                // Mostrar un mensaje si el nodo no se encuentra
                JOptionPane.showMessageDialog(this, "Nodo no encontrado.");
            }
        } catch (NumberFormatException e) {
            // Manejo de excepción si la entrada no es válida
            JOptionPane.showMessageDialog(this, "Por favor, introduzca un valor válido para el ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_RemoverActionPerformed

    private void jComboBox_RecorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_RecorridosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_RecorridosActionPerformed
    
    
    
    private void jButton_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EjecutarActionPerformed

    try {
        int peso = Integer.parseInt(jTextField_Peso.getText());
        Nodo nodo = arbol.buscar(peso);

        if (nodo != null) {
            
        arbol.reiniciarContadorComparaciones();
        String recorridoSeleccionado = (String) jComboBox_Recorridos.getSelectedItem();
  
    switch (recorridoSeleccionado) {
        case "PreOrden":
            jTextField_PreOrden.setText(arbol.preOrden(nodo));
            // Mostrar el contador de comparaciones después de los recorridos
            jTextField_Tiempo_Pre.setText(arbol.getContadorComparacionesPreOrden() + " comparaciones");
            break;
        case "InOrden":
            jTextField_InOrden.setText(arbol.inOrden(nodo));
            // Mostrar el contador de comparaciones después de los recorridos
            jTextField_Tiempo_In.setText(arbol.getContadorComparacionesInOrden() + " comparaciones");
            break;
        case "PostOrden":
            jTextField_PostOrden.setText(arbol.postOrden(nodo));
            // Mostrar el contador de comparaciones después de los recorridos
            jTextField_Tiempo_Post.setText(arbol.getContadorComparacionesPostOrden() + " comparaciones");
            break;
    }
        } else {
            // Mensaje si el nodo no se encuentra
            JOptionPane.showMessageDialog(this, "Nodo no encontrado.");
        }
    } catch (NumberFormatException e) {
        // Manejo de excepción si la entrada no es válida
        JOptionPane.showMessageDialog(this, "Por favor, introduzca un valor válido para el Peso.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_jButton_EjecutarActionPerformed

    private void jTextField_PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PreOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PreOrdenActionPerformed

    private void jTextField_InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_InOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_InOrdenActionPerformed

    private void jTextField_PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PostOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PostOrdenActionPerformed

    private void jTextField_Tiempo_PreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Tiempo_PreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Tiempo_PreActionPerformed

    private void jTextField_Tiempo_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Tiempo_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Tiempo_InActionPerformed

    private void jTextField_Tiempo_PostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Tiempo_PostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Tiempo_PostActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Editar;
    private javax.swing.JButton jButton_Ejecutar;
    private javax.swing.JButton jButton_Remover;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JComboBox<String> jComboBox_Recorridos;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_InOrden;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Peso;
    private javax.swing.JLabel jLabel_PostOrden;
    private javax.swing.JLabel jLabel_PreOrden;
    private javax.swing.JLabel jLabel_Tiempo;
    private javax.swing.JPanel jPanelRecorridos;
    private javax.swing.JPanel jPanel_RegistroNodos;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_InOrden;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Peso;
    private javax.swing.JTextField jTextField_PostOrden;
    private javax.swing.JTextField jTextField_PreOrden;
    private javax.swing.JTextField jTextField_Tiempo_In;
    private javax.swing.JTextField jTextField_Tiempo_Post;
    private javax.swing.JTextField jTextField_Tiempo_Pre;
    // End of variables declaration//GEN-END:variables
}
