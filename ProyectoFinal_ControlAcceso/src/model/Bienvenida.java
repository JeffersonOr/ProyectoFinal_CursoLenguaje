/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

/**Ventana bienvenida, ventana principal para el uso del
 *Administrador o la persona
 *
 */
public class Bienvenida extends javax.swing.JFrame {


    public Bienvenida() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pl_bienvenida = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_registro = new javax.swing.JButton();
        btn_administrador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("fm_bienvenida"); // NOI18N

        pl_bienvenida.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel3.setText("Bienvenidos ");

        btn_registro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn_registro.setText("Registro ");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        btn_administrador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn_administrador.setText("Administrador");
        btn_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administradorActionPerformed(evt);
            }
        });

        jLabel4.setText("<Avenida bolivar # 3-1");

        jLabel5.setText("<PBX: (60) 6 745 11 01");

        jLabel6.setText("<WhatsApp: 3188516428");

        jLabel7.setText("Armenia-Quindio ");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EAM");

        javax.swing.GroupLayout pl_bienvenidaLayout = new javax.swing.GroupLayout(pl_bienvenida);
        pl_bienvenida.setLayout(pl_bienvenidaLayout);
        pl_bienvenidaLayout.setHorizontalGroup(
            pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                .addGroup(pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_administrador)
                            .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel3))
                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btn_registro))
                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        pl_bienvenidaLayout.setVerticalGroup(
            pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(btn_registro)
                .addGap(18, 18, 18)
                .addComponent(btn_administrador)
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        ///////////////////El boton de registro redirije a la ventana de validarRegistro
        ValidarRegistro validarRegistro = new ValidarRegistro();
        validarRegistro.setVisible(true);
        ////////////////////////////////////
        
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administradorActionPerformed
        ///////////////////El boton de registro redirije a la ventana de administrar
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
        ////////////////////////////////////
    }//GEN-LAST:event_btn_administradorActionPerformed

  
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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_administrador;
    private javax.swing.JButton btn_registro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pl_bienvenida;
    // End of variables declaration//GEN-END:variables
}
