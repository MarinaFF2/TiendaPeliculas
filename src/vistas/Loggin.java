/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import vistas.admin.BienvenidoAdmin;
import vistas.user.BienvenidoUser;
import datos.ConectorBD;
import java.awt.Color;
import java.security.SecureRandom;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import modulos.Usuarios;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ff_ma
 */
public class Loggin extends javax.swing.JFrame {

    private Usuarios usuarios;
    private ConectorBD conectBD;

    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        setLocationRelativeTo(null);
        conectBD = new ConectorBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicioSesion = new javax.swing.JPanel();
        TextFUsuario = new javax.swing.JTextField();
        TextPassPwd = new javax.swing.JPasswordField();
        jLabelUser = new javax.swing.JLabel();
        jLabelPwd = new javax.swing.JLabel();
        jButtonIncioSesion = new javax.swing.JButton();
        jLabelRegistrarse = new javax.swing.JLabel();
        jLabelFotoLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jPanelInicioSesion.setToolTipText("");

        TextFUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFUsuarioFocusLost(evt);
            }
        });

        TextPassPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPassPwdFocusLost(evt);
            }
        });

        jLabelUser.setText("Usuario:");

        jLabelPwd.setText("Contraseña:");

        jButtonIncioSesion.setText("Iniciar Sesión");
        jButtonIncioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncioSesionActionPerformed(evt);
            }
        });

        jLabelRegistrarse.setText("Registrarse...");
        jLabelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarseMouseClicked(evt);
            }
        });

        jLabelFotoLogo.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanelInicioSesionLayout = new javax.swing.GroupLayout(jPanelInicioSesion);
        jPanelInicioSesion.setLayout(jPanelInicioSesionLayout);
        jPanelInicioSesionLayout.setHorizontalGroup(
            jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButtonIncioSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioSesionLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                        .addComponent(jLabelFotoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioSesionLayout.createSequentialGroup()
                        .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUser)
                            .addComponent(jLabelPwd)
                            .addComponent(jLabelRegistrarse))
                        .addGap(66, 66, 66)
                        .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextPassPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(TextFUsuario))
                        .addGap(81, 81, 81))))
        );
        jPanelInicioSesionLayout.setVerticalGroup(
            jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFotoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPassPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPwd))
                .addGap(19, 19, 19)
                .addComponent(jLabelRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIncioSesion)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncioSesionActionPerformed
        //comprobamos que ningýmn campo este vacío
        if (TextPassPwd.getText().length() != 0 && TextFUsuario.getText().length() != 0) {
            if (TextFUsuario.getText().contains("@") && TextFUsuario.getText().contains(".")) {
                this.confirmar();
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo usuario, hay que introducir un correo", "Error al introducir el correo", JOptionPane.CLOSED_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error algún campo está vacío", "Error de campo vacío", JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_jButtonIncioSesionActionPerformed

    private void jLabelRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarseMouseClicked
        JDialogRegistrarse regis = new JDialogRegistrarse(this, true);

        regis.setLocationRelativeTo(null);
        regis.setSize(400, 400);
        regis.setVisible(true);
    }//GEN-LAST:event_jLabelRegistrarseMouseClicked

    private void TextPassPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPassPwdFocusLost
        if (TextPassPwd.getText().length() == 0) {
            TextPassPwd.setBackground(Color.red);
            TextPassPwd.setForeground(Color.white);
        } else {
            TextPassPwd.setForeground(Color.black);
            TextPassPwd.setBackground(Color.white);
        }
    }//GEN-LAST:event_TextPassPwdFocusLost

    private void TextFUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFUsuarioFocusLost
       if (TextFUsuario.getText().length() == 0 && !TextFUsuario.getText().contains("@") && !TextFUsuario.getText().contains(".")) {
            TextFUsuario.setBackground(Color.red);
            TextFUsuario.setForeground(Color.white);
        }
        if (TextFUsuario.getText().length() != 0 && TextFUsuario.getText().contains("@") && TextFUsuario.getText().contains(".")) {
            TextFUsuario.setForeground(Color.black);
            TextFUsuario.setBackground(Color.white);
        }
    }//GEN-LAST:event_TextFUsuarioFocusLost

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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    private void confirmar() {
        usuarios = null;

        String usuario = this.TextFUsuario.getText();
        //contraseña codificada
        String pwdmd5Hex = DigestUtils.md5Hex(TextPassPwd.getText());

//        String pwdmd5Hex = DigestUtils.md5Hex(pwd);
        this.conectBD.openBD();
        this.usuarios = this.conectBD.existeUsuario(usuario, pwdmd5Hex);
        this.conectBD.closeBD();

//        this.usuarios = this.conectBD.existeUsuario(usuario, pwdmd5Hex);
        if (this.usuarios != null) {
            if (this.usuarios.getIdRol() == 1 && this.usuarios.getActivo( )== 1) { //es usuario normal
                //volvemos invisible esta venta
                dispose();

                //Redirigmos a 
                BienvenidoUser t = new BienvenidoUser(this.usuarios);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            } else if (this.usuarios.getIdRol() == 2 && this.usuarios.getActivo() == 1) { //es un admin
                //volvemos invisible esta venta
                dispose();

                //Redirigmos a 
                BienvenidoAdmin t = new BienvenidoAdmin(this.usuarios);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            } else { // no tiene rol asigando o no está activado
                JOptionPane.showMessageDialog(null, "Error al crear el usuario", "Error de creación", JOptionPane.CLOSED_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en el correo o la contraseña", "Error de autentificacion", JOptionPane.CLOSED_OPTION);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFUsuario;
    private javax.swing.JPasswordField TextPassPwd;
    private javax.swing.JButton jButtonIncioSesion;
    private javax.swing.JLabel jLabelFotoLogo;
    private javax.swing.JLabel jLabelPwd;
    private javax.swing.JLabel jLabelRegistrarse;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelInicioSesion;
    // End of variables declaration//GEN-END:variables

}
