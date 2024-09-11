/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import clases.Contacto;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarCliente
     */
    Contacto contacto;

    public AgregarCliente() {
        initComponents();
    }

    public boolean checkJtf() {
        return (jTFdni.getText().isEmpty() || jTFnombre.getText().isEmpty() || jTFapellido.getText().isEmpty() || jTFdireccion.getText().isEmpty() || jTFciudad.getText().isEmpty() || jTFtelefono.getText().isEmpty());
    }

    public void cleanjTF() {
        jTFdni.setText("");
        jTFnombre.setText("");
        jTFapellido.setText("");
        jTFdireccion.setText("");
        jTFciudad.setText("");
        jTFtelefono.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTFdni = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jTFapellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFdireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFciudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTFtelefono = new javax.swing.JTextField();
        jLdniMensaje = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();

        setClosable(true);

        jLabel6.setText("Ciudad");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTFdni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFdniFocusLost(evt);
            }
        });
        jTFdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFdniMousePressed(evt);
            }
        });
        jTFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFdniKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Formulario Agregar Cliente ");

        jLabel2.setText("Dni:");

        jLabel3.setText("Nombre:");

        jLabel7.setText("Telefono");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Direccion");

        jTFtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFtelefonoKeyTyped(evt);
            }
        });

        jLdniMensaje.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLdniMensaje.setText("Solo valores numericos");

        jLtelefono.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLtelefono.setText("Solo valores numericos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFdni)
                    .addComponent(jTFnombre)
                    .addComponent(jTFapellido)
                    .addComponent(jTFdireccion)
                    .addComponent(jTFciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLdniMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(52, 52, 52)
                .addComponent(jTFtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLtelefono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdniMensaje))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtelefono))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFdniKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isDigit(car)) {
            evt.consume();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jTFdniKeyTyped

    private void jTFtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFtelefonoKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isDigit(car)) {
            evt.consume();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jTFtelefonoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cleanjTF();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (!checkJtf()) {
            Contacto contacto = new Contacto();
            contacto.setDni(jTFdni.getText());
            contacto.setNombre(jTFnombre.getText());
            contacto.setApellido(jTFapellido.getText());
            contacto.setDireccion(jTFdireccion.getText());
            contacto.setCiudad(jTFciudad.getText());
            Long tel = Long.parseLong(jTFtelefono.getText());

            
            // Se agrega contacto
            MenuPrincipal.directorio.agregarContacto(tel, contacto);

           
            JOptionPane.showMessageDialog(this, "El Cliente  fue agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Complete los campos ", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTFdniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFdniMousePressed

    }//GEN-LAST:event_jTFdniMousePressed

    private void jTFdniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFdniFocusLost
        // jLdniMensaje.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jTFdniFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLdniMensaje;
    private javax.swing.JLabel jLtelefono;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFciudad;
    private javax.swing.JTextField jTFdireccion;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTextField jTFtelefono;
    // End of variables declaration//GEN-END:variables
}
