/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.admin;

import datos.ConectorBD;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modulos.Usuarios;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author ff_ma
 */
public class PerfilAdmin extends javax.swing.JFrame {

    private Usuarios usuarios;
    private File foto = null;

    /**
     * Creates new form BienvenidaUser
     */
    public PerfilAdmin(Usuarios usuarios) {

        initComponents();
        this.usuarios = usuarios;

        rellenarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jButtonFoto = new javax.swing.JButton();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jPasswordFieldConfirContrasenia = new javax.swing.JPasswordField();
        jLabelContrasenia = new javax.swing.JLabel();
        jLabelConfirContrasenia = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonExaminar = new javax.swing.JButton();
        jLabelFotoSeleccionada = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOpcion = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuGestionar = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemPelis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCorreo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelCorreo.setText("Correo:");

        jTextFieldCorreo.setEditable(false);

        jLabelContrasenia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelContrasenia.setText("Contraseña:");

        jLabelConfirContrasenia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelConfirContrasenia.setText("Confirmar contraseña:");

        jLabelNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellidos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelApellidos.setText("Apellidos:");

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setText("PERFIL");

        jLabelFoto.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelFoto.setText("Foto:");

        jButtonExaminar.setText("Examinar...");
        jButtonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExaminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCorreo)
                            .addComponent(jLabelConfirContrasenia)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApellidos)
                            .addComponent(jLabelContrasenia)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldContrasenia)
                            .addComponent(jPasswordFieldConfirContrasenia)
                            .addComponent(jTextFieldCorreo)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldApellidos)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelFoto)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonExaminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFotoSeleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(14, 14, 14)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreo)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContrasenia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldConfirContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConfirContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonExaminar)
                                .addComponent(jLabelFoto))
                            .addComponent(jLabelFotoSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/opciones.png"))); // NOI18N

        jMenuItemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/inicio.png"))); // NOI18N
        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuOpcion.add(jMenuItemInicio);

        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/salida.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuOpcion.add(jMenuItemSalir);

        jMenuBar.add(jMenuOpcion);

        jMenuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/perfil.png"))); // NOI18N
        jMenuPerfil.setText("Pefil");
        jMenuPerfil.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuPerfilMenuSelected(evt);
            }
        });
        jMenuBar.add(jMenuPerfil);

        jMenuGestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/gestionar.png"))); // NOI18N
        jMenuGestionar.setText("Gestionar");

        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/usuario.png"))); // NOI18N
        jMenuItemUsuarios.setText("Usuarios");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuGestionar.add(jMenuItemUsuarios);

        jMenuItemPelis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/peliculas.png"))); // NOI18N
        jMenuItemPelis.setText("Peliculas");
        jMenuItemPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPelisActionPerformed(evt);
            }
        });
        jMenuGestionar.add(jMenuItemPelis);

        jMenuBar.add(jMenuGestionar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        dispose();

        GestionarUsuarios gu = new GestionarUsuarios(usuarios);
        gu.setLocationRelativeTo(null);
        gu.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPelisActionPerformed
        dispose();

        GestionarPeliculas pe = new GestionarPeliculas(usuarios);
        pe.setLocationRelativeTo(null);
        pe.setVisible(true);
    }//GEN-LAST:event_jMenuItemPelisActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        dispose();

        BienvenidoAdmin ba = new BienvenidoAdmin(usuarios);
        ba.setLocationRelativeTo(null);
        ba.setVisible(true);
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExaminarActionPerformed
        examinar();
    }//GEN-LAST:event_jButtonExaminarActionPerformed
    private void examinar() {
        //Seleccionamos la foto
        JFileChooser elegirRuta = new JFileChooser();
        elegirRuta.setDialogTitle("Selecciona la foto de perfil");
        elegirRuta.setFileFilter(new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif"));
        elegirRuta.setCurrentDirectory(new File(System.getProperty("user.dir") + "/Pictures"));
        if (elegirRuta.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            foto = elegirRuta.getSelectedFile();
            if (foto != null) {
                ImageIcon icono = new ImageIcon(foto.getAbsolutePath());
                jLabelFotoSeleccionada.setText(foto.getName());
                jButtonFoto.setIcon(new ImageIcon(icono.getImage().getScaledInstance(jButtonFoto.getWidth(), jButtonFoto.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
    }

    private void guardar() {
        ConectorBD conectBD = new ConectorBD();

        //Se comprueba que han habido cambios
        if (!jTextFieldNombre.getText().equals(usuarios.getNombre()) || !jTextFieldApellidos.getText().equals(usuarios.getApellido()) || !jTextFieldCorreo.getText().equals(usuarios.getCorreo())) {
            usuarios.setNombre(jTextFieldNombre.getText());
            usuarios.setApellido(jTextFieldApellidos.getText());
            conectBD.openBD();
            conectBD.updateUsuario(usuarios);
            conectBD.closeBD();
        }
        //Se comprueba que queremos cambiar la contraseña
        if (jPasswordFieldContrasenia != null && jPasswordFieldConfirContrasenia != null) {
            //contraseña codificada
            String pwdmd5Hex = DigestUtils.md5Hex(jPasswordFieldContrasenia.getText());
            //si las contraseñas coinciden no se deja cambiar la contraseña
            if (!pwdmd5Hex.equals(usuarios.getPwd())) {
                //se conprueba que la contraseña está bien escrita
                if (jPasswordFieldContrasenia.getText().equals(jPasswordFieldConfirContrasenia.getText())) {
                    conectBD.openBD();
                    conectBD.updatePwd(usuarios.getCorreo(), pwdmd5Hex);
                    conectBD.closeBD();
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas tienen que coincidir", "Error al modificar perfil", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error con la contraseña", "Error al modificar perfil", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Se comprueba que queremos cambiar la foto
        if (foto != null) {
            usuarios.setFoto(usuarios.ponerFoto(foto, usuarios.getId_usuario() + ""));

            conectBD.openBD();
            conectBD.updateFotoUsuario(usuarios.getCorreo(), usuarios.getFoto());
            conectBD.closeBD();
        }
    }
    private void jMenuPerfilMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuPerfilMenuSelected
        dispose();

        PerfilAdmin p = new PerfilAdmin(usuarios);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuPerfilMenuSelected

    private void rellenarFormulario() {
        jTextFieldNombre.setText(usuarios.getNombre());
        jTextFieldApellidos.setText(usuarios.getApellido());
        jTextFieldCorreo.setText(usuarios.getCorreo());

        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + usuarios.getFoto());
        jButtonFoto.setIcon(new ImageIcon(icono.getImage().getScaledInstance(jButtonFoto.getWidth(), jButtonFoto.getHeight(), Image.SCALE_SMOOTH)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExaminar;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelConfirContrasenia;
    private javax.swing.JLabel jLabelContrasenia;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFotoSeleccionada;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuGestionar;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemPelis;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuOpcion;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPasswordField jPasswordFieldConfirContrasenia;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
