/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import singleton.Singleton;

/**Ventana del administrador para que vea
 *El tiempo real de la persona
 *
 */
public class Administrar extends javax.swing.JFrame {

    /////////////////////////////////////
    DefaultTableModel modelTableUsers;
    ArrayList<RegistroPersona> listRegistroPersonas;

    public Administrar() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        //////////////////////////////////////////////////////////
        modelTableUsers = new DefaultTableModel();///Table
        /////////////////////////////////////////////////////////
        listRegistroPersonas = Singleton.getInstance().getListRegistroPersona();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_adminRegistro = new javax.swing.JTable();
        btn_actualizarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("fm_administrar"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Administrador ");

        tb_adminRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "documento", "fecha ingreso", "fecha salida", "total tiempo"
            }
        ));
        tb_adminRegistro.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tb_adminRegistro);
        tb_adminRegistro.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btn_actualizarTabla.setText("Actualizar");
        btn_actualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btn_actualizarTabla))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_actualizarTabla)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarTablaActionPerformed
        modelTableUsers = (DefaultTableModel) tb_adminRegistro.getModel();/////////Asigmos el modelo de la tabla
        
        
        Object[] ob = new Object[6];///Object para crear los espacios para las variables
        cleanTable();/////Metodo para limpiar los datos de la tabla cuando se actualice con el boton
        for (int i = 0; i < listRegistroPersonas.size(); i++) {/////////Rellemos los espacios con la lista de registroPersonas

            ob[0] = listRegistroPersonas.get(i).getNombres();
            ob[1] = listRegistroPersonas.get(i).getDocumento();
            ob[2] = listRegistroPersonas.get(i).getFechaIngreso();
            ob[3] = listRegistroPersonas.get(i).getFechaSalida();
            ob[4] = listRegistroPersonas.get(i).getDuracionEstadia();
            modelTableUsers.addRow(ob);
        }
        tb_adminRegistro.setModel(modelTableUsers);
    }//GEN-LAST:event_btn_actualizarTablaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrar().setVisible(true);
            }
        });
    }
        public void cleanTable() {///////////////////////CleanRows_Jtable
        for (int i = 0; i < modelTableUsers.getRowCount(); i++) {
            modelTableUsers.removeRow(i);
            i = i - 1;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_adminRegistro;
    // End of variables declaration//GEN-END:variables
}
