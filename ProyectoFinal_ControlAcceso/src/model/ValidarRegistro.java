/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import controller.ControllerRegistroPersona;

/**Ventana validar registro
 *Esta ventana se encargará de leer el estado de la persona y,
 * Si encuentra ingresado lo redirigira a la venta de registrosalida, caso contrario a la ventana de registro
 */
public class ValidarRegistro extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenida
     */
    public ValidarRegistro() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pl_bienvenida = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_validarDocumento = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("fm_validarDocumento"); // NOI18N

        pl_bienvenida.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Validar ingreso");

        btn_validarDocumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn_validarDocumento.setText("Aceptar");
        btn_validarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarDocumentoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EAM");

        txt_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Ingrese su N° de identificacion");

        javax.swing.GroupLayout pl_bienvenidaLayout = new javax.swing.GroupLayout(pl_bienvenida);
        pl_bienvenida.setLayout(pl_bienvenidaLayout);
        pl_bienvenidaLayout.setHorizontalGroup(
            pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl_bienvenidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_validarDocumento)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl_bienvenidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pl_bienvenidaLayout.setVerticalGroup(
            pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_bienvenidaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pl_bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(82, 82, 82)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btn_validarDocumento)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl_bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pl_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_validarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarDocumentoActionPerformed
        Registro registro = new Registro();
        RegistroSalida registroSalida = new RegistroSalida();
        
        
        int documento = Integer.parseInt(txt_documento.getText());////Valor de documento de entrada
        ControllerRegistroPersona controllerRegistroPersona = new ControllerRegistroPersona();///Instacia del controlador
        boolean respuesta = controllerRegistroPersona.validarIngreso(documento);///Variable de tipo boolean que almacena lo que retorna el metodo validarIngreso
        
        //////////Condicional para redirigir a la persona independientemente de su estado
        if (respuesta) {
            
            registroSalida.setVisible(true);/////redirige a la ventana de registroSalida
        } else {
            registro.setVisible(true);///////////redirige a la ventana de registro
        }
        
        ////////////Pasamos el numero de documento a la ventana de registroSalida
        registroSalida.setDocumento(documento);
        
        
    }//GEN-LAST:event_btn_validarDocumentoActionPerformed

    private void txt_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_documentoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ValidarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_validarDocumento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pl_bienvenida;
    private javax.swing.JTextField txt_documento;
    // End of variables declaration//GEN-END:variables
}
