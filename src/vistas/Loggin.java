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

        jDialogOlvidarPwd = new javax.swing.JDialog();
        jPanelOlvidar = new javax.swing.JPanel();
        jLabelTituloOlvidarPwd = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFOlvidarCorreo = new javax.swing.JTextField();
        jButtonOlvidar = new javax.swing.JButton();
        jPanelInicioSesion = new javax.swing.JPanel();
        TextFUsuario = new javax.swing.JTextField();
        TextPassPwd = new javax.swing.JPasswordField();
        jLabelUser = new javax.swing.JLabel();
        jLabelPwd = new javax.swing.JLabel();
        jLabelOlvidarPwd = new javax.swing.JLabel();
        jButtonIncioSesion = new javax.swing.JButton();
        jLabelRegistrarse = new javax.swing.JLabel();
        jLabelFotoLogo = new javax.swing.JLabel();

        jDialogOlvidarPwd.setTitle("Olvidar contraseña");
        jDialogOlvidarPwd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPanelOlvidar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jLabelTituloOlvidarPwd.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTituloOlvidarPwd.setText("¿Te has olvidado la contraseña?");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(212, 210, 210));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Introduce tu correo electronico para poder enviarte\n un correo con la nueva contraseña. \n\nEs recomendame que luego la cambies por otra.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFOlvidarCorreo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jButtonOlvidar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonOlvidar.setText("Cambiar contraseña");
        jButtonOlvidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOlvidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOlvidarLayout = new javax.swing.GroupLayout(jPanelOlvidar);
        jPanelOlvidar.setLayout(jPanelOlvidarLayout);
        jPanelOlvidarLayout.setHorizontalGroup(
            jPanelOlvidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOlvidarLayout.createSequentialGroup()
                .addGroup(jPanelOlvidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOlvidarLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelTituloOlvidarPwd))
                    .addGroup(jPanelOlvidarLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jTextFOlvidarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOlvidarLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonOlvidar)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOlvidarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanelOlvidarLayout.setVerticalGroup(
            jPanelOlvidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOlvidarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTituloOlvidarPwd)
                .addGap(18, 18, 18)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jTextFOlvidarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonOlvidar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogOlvidarPwdLayout = new javax.swing.GroupLayout(jDialogOlvidarPwd.getContentPane());
        jDialogOlvidarPwd.getContentPane().setLayout(jDialogOlvidarPwdLayout);
        jDialogOlvidarPwdLayout.setHorizontalGroup(
            jDialogOlvidarPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogOlvidarPwdLayout.createSequentialGroup()
                .addComponent(jPanelOlvidar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialogOlvidarPwdLayout.setVerticalGroup(
            jDialogOlvidarPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOlvidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        jLabelOlvidarPwd.setText("Olvidar contraseña...");
        jLabelOlvidarPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOlvidarPwdMouseClicked(evt);
            }
        });

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
        jLabelFotoLogo.setText("jLabel1");

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
                        .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOlvidarPwd)
                            .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextPassPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(TextFUsuario)))
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
                .addGroup(jPanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOlvidarPwd)
                    .addComponent(jLabelRegistrarse))
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

    private void jLabelOlvidarPwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOlvidarPwdMouseClicked
        //volvemos invisible esta venta
        // dispose();

        //Redirigmos a 
        jDialogOlvidarPwd.setModal(true);
        jDialogOlvidarPwd.setLocationRelativeTo(null);
        jDialogOlvidarPwd.setSize(500, 300);
        jDialogOlvidarPwd.setVisible(true);
    }//GEN-LAST:event_jLabelOlvidarPwdMouseClicked

    private void jButtonOlvidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOlvidarActionPerformed
        String destinatario = this.jTextFOlvidarCorreo.getText();
        this.enviarCorreo(destinatario);
    }//GEN-LAST:event_jButtonOlvidarActionPerformed

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

    private void enviarCorreo(String destinatario) {
        Usuarios user = null;

//        user = conectBD.existeUsu(destinatario);
//        if (user != null) {
        // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
        final String remitente = "tiendapelis2021@gmail.com";  //Para la dirección nomcuenta@gmail.com
        final String password = "aplicacionPelis20";

        //Properties => parámetros de configuración para el servidor de correo para crear la sesión
        Properties props = System.getProperties(); //new Properties();
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", password);    //La clave de la cuenta
        props.put("mail.smtp.auth", "true");//Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true");//Para conectar de manera segura al servidor SMTP, TLS si está disponible
        props.put("mail.smtp.host", "smtp.gmail.com");//El servidor SMTP de Google
        props.put("mail.smtp.port", "587");//El puerto SMTP seguro de Google

        //Session => representa la conexión con el servidor gmail de correo
        Session session = Session.getDefaultInstance(props);
        session.setDebug(true); //para obtener más información por pantalla de lo que está sucediendo

        // MimeMessage => es el mensaje
        MimeMessage message = new MimeMessage(session);
        String asunto = "Cambiar contraseña de ";
        String nuevaPwd = generarContraseña();

        this.conectBD.openBD();
        //conectBD.updatePwd(destinatario, nuevaPwd);
        this.conectBD.closeBD();

        System.out.println("Nueva contraseña " + nuevaPwd);
        String cuerpo = "Buenas. \n"
                + "Ha pulsado en que se le ha olvidado la contraseña. \n"
                + "Aquí tiene la nueva contraseña " + nuevaPwd
                + "Saludos. "
                + "Para cualquier problema contactenos";

        try {
            message.setFrom(new InternetAddress(remitente)); //quien lo manda
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario)); //Quien lo recibe
            message.setSubject(asunto); //el asunto del mensaje
            message.setText(cuerpo); //el cuerpo del mensaje

            // Transport => Clase para el envío de mensajes, enlazamos el Transport con la Session
            Transport transport = session.getTransport("smtp"); //nombre del protocolo a usar.
            transport.connect("smtp.gmail.com", remitente, password); //establecemos la conexión, dando el nombre de usuario y password.
            transport.sendMessage(message, message.getAllRecipients()); //enviamos el mensaje
            transport.close(); //cerramos la conexión

        } catch (MessagingException me) {
            me.printStackTrace();   //Si se produce un error
        }
//        }else{
//            JOptionPane.showMessageDialog(null, "Error en el correo", "Error", JOptionPane.CLOSED_OPTION);
//        }
    }

    private String generarContraseña() {
        return RandomStringUtils.random(8, 0, 0, true, true, null, new SecureRandom());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFUsuario;
    private javax.swing.JPasswordField TextPassPwd;
    private javax.swing.JButton jButtonIncioSesion;
    private javax.swing.JButton jButtonOlvidar;
    private javax.swing.JDialog jDialogOlvidarPwd;
    private javax.swing.JLabel jLabelFotoLogo;
    private javax.swing.JLabel jLabelOlvidarPwd;
    private javax.swing.JLabel jLabelPwd;
    private javax.swing.JLabel jLabelRegistrarse;
    private javax.swing.JLabel jLabelTituloOlvidarPwd;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelInicioSesion;
    private javax.swing.JPanel jPanelOlvidar;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFOlvidarCorreo;
    // End of variables declaration//GEN-END:variables

}