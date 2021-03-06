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
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import modulos.TablaGestionUsuariosModel;
import modulos.Usuarios;

/**
 *
 * @author ff_ma
 */
public class GestionarUsuarios extends javax.swing.JFrame {

    private Usuarios usuarioSesion; //sesion del usuario que somos
    private Usuarios usuarioTabla; //usuario que estamos tratando en el formulario
    private ConectorBD conectBD;
    private TablaGestionUsuariosModel tablaModel;

    private JFileChooser elegirRuta;
    private int seleccion = 0;
    private File foto = null;

    /**
     * Creates new form BienvenidaUser
     */
    public GestionarUsuarios(Usuarios usuarioSesion) {

        initComponents();
        this.usuarioSesion = usuarioSesion;
        conectBD = new ConectorBD();
        usuarioTabla = new Usuarios();

        //creamos la tabla con DefaultTableModel
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelSuperior = new javax.swing.JPanel();
        jButtonFoto = new javax.swing.JButton();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelRangoEdad = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jLabelActivo = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonAniadir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelTituloPantalla = new javax.swing.JLabel();
        jCheckBoxActivo = new javax.swing.JCheckBox();
        jLabelFoto = new javax.swing.JLabel();
        jButtonExaminar = new javax.swing.JButton();
        jLabelFotoSeleccionada = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOpcion = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuGestionar = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemPelis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );

        jLabelCorreo.setText("Correo:");

        jLabelNombre.setText("Nombre:");

        jLabelApellido.setText("Apellido:");

        jLabelRangoEdad.setText("Rol:");

        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Usuario", "Administrador" }));

        jLabelActivo.setText("Activo:");

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAniadir.setText("Añadir");
        jButtonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelTituloPantalla.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTituloPantalla.setText("GESTIONAR USUARIOS");

        jLabelFoto.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelFoto.setText("Foto:");

        jButtonExaminar.setText("Examinar...");
        jButtonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExaminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTituloPantalla)
                .addGap(112, 112, 112))
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCorreo)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCorreo)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRangoEdad)
                            .addComponent(jLabelActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxRol, 0, 241, Short.MAX_VALUE)
                            .addComponent(jCheckBoxActivo)))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabelFoto)
                        .addGap(157, 157, 157)
                        .addComponent(jLabelFotoSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExaminar)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jButtonAniadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpiar)
                .addContainerGap())
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloPantalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCorreo)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellido)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRangoEdad)
                            .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelActivo)
                            .addComponent(jCheckBoxActivo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFotoSeleccionada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonExaminar)
                                .addComponent(jLabelFoto))))
                    .addComponent(jButtonFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonAniadir)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonLimpiar))
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
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirActionPerformed
        aniadir();
    }//GEN-LAST:event_jButtonAniadirActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        dispose();

        GestionarUsuarios gu = new GestionarUsuarios(usuarioSesion);
        gu.setLocationRelativeTo(null);
        gu.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPelisActionPerformed
        dispose();

        GestionarPeliculas pe = new GestionarPeliculas(usuarioSesion);
        pe.setLocationRelativeTo(null);
        pe.setVisible(true);
    }//GEN-LAST:event_jMenuItemPelisActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        dispose();

        BienvenidoAdmin ba = new BienvenidoAdmin(usuarioSesion);
        ba.setLocationRelativeTo(null);
        ba.setVisible(true);
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jButtonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExaminarActionPerformed
        examinarFoto();
    }//GEN-LAST:event_jButtonExaminarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int fila = jTable.getSelectedRow();
        if (fila != -1) {
            rellenarFormulario(fila);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void jMenuPerfilMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuPerfilMenuSelected
        dispose();

        PerfilAdmin p = new PerfilAdmin(usuarioSesion);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuPerfilMenuSelected
    private void cargarTabla() {
        declararModelo();

        //añadimos el contenido
        conectBD.openBD();
        this.tablaModel.setFila(conectBD.selectUsuarios());
        conectBD.closeBD();
    }

    private void declararModelo() {
        //instanciamos el modelo de tabla creado
        this.tablaModel = new TablaGestionUsuariosModel();
        //permitimos la seleccion de la fila de la tabla
        jTable.setRowSelectionAllowed(true);
        //añadimos una interfaz que nos 
        //perimte elegir el modo de selecion de la tabla
        //hemos elegido el que nos permite 
        //"seleccionar un índice de lista a la vez"
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //añadimos el modelo a la tabla
        this.jTable.setModel(tablaModel);
    }

    private void rellenarFormulario(int fila) {
        limpiar();

        usuarioTabla = new Usuarios();
        usuarioTabla.setId_usuario(Integer.parseInt(jTable.getValueAt(fila, 0).toString()));
        usuarioTabla.setFoto(jTable.getValueAt(fila, 1).toString());
        jButtonFoto.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + usuarioTabla.getFoto()).getImage().getScaledInstance(jButtonFoto.getWidth(), jButtonFoto.getHeight(), Image.SCALE_SMOOTH)));
        jTextFieldCorreo.setText(jTable.getValueAt(fila, 2).toString());
        jTextFieldNombre.setText(jTable.getValueAt(fila, 3).toString());
        jTextFieldApellido.setText(jTable.getValueAt(fila, 4).toString());
        rellenarActivo(jTable.getValueAt(fila, 5).toString());
        rellenarRol(jTable.getValueAt(fila, 6).toString());

        jTextFieldCorreo.setEditable(false);
    }

    private void comprobarRol() {
        switch ((String) jComboBoxRol.getSelectedItem()) {
            case "Ninguno": //Ninguno
                usuarioTabla.setIdRol(0);
                break;
            case "Usuario": //Usuario
                usuarioTabla.setIdRol(1);
                break;
            case "Administrador": //Admin
                usuarioTabla.setIdRol(2);
                break;
        }

    }

    private void comprobarActivo() {
        if (jCheckBoxActivo.isSelected()) {
            usuarioTabla.setActivo(1);
        } else {
            usuarioTabla.setActivo(0);
        }
    }

    private void examinarFoto() {
        //Seleccionamos la foto
        elegirRuta = new JFileChooser();
        elegirRuta.setDialogTitle("Selecciona la foto de perfil");
        elegirRuta.setFileFilter(new FileNameExtensionFilter("JPEG, JPG, PNG & GIF", "jpeg", "jpg", "png", "gif"));
        elegirRuta.setCurrentDirectory(new File(System.getProperty("user.dir") + "/Pictures"));
        seleccion = elegirRuta.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            foto = elegirRuta.getSelectedFile();
            if (foto != null) {
                ImageIcon icono = new ImageIcon(foto.getAbsolutePath());
                jLabelFotoSeleccionada.setText(foto.getName());
                jButtonFoto.setIcon(new ImageIcon(icono.getImage().getScaledInstance(jButtonFoto.getWidth(), jButtonFoto.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
    }

    private void rellenarRol(String rol) {
        if (rol.equals("1")) {//rol = 1 usuario             
            jComboBoxRol.setSelectedItem("Usuario");
        } else if (rol.equals("2")) {//rol = 2 admin 
            jComboBoxRol.setSelectedItem("Administrador");
        } else { //Ningún rol = 0            
            jComboBoxRol.setSelectedItem("Ninguno");
        }
    }

    private void rellenarActivo(String activo) {
        if (activo.equals("1")) {//activo = 1, el usuario está activo
            jCheckBoxActivo.setSelected(true);
        }
        if (activo.equals("0")) { //activo = 0, el usuario está desactivado    
            jCheckBoxActivo.setSelected(false);
        }
    }

    private void limpiar() {
        jTextFieldCorreo.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        foto = null;
        jLabelFotoSeleccionada.setText("");
        jButtonFoto.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "/img/imgIconos/user.jpeg").getImage().getScaledInstance(jButtonFoto.getWidth(), jButtonFoto.getHeight(), Image.SCALE_SMOOTH)));
        jComboBoxRol.setSelectedIndex(0);
        jCheckBoxActivo.setSelected(false);
        jTextFieldCorreo.setEditable(true);
    }

    private void modificar() {

        if (!jTextFieldNombre.getText().equals("") || !jTextFieldApellido.getText().equals("") || (Integer) jComboBoxRol.getSelectedIndex() != 0 || jCheckBoxActivo.isSelected() != false) {
            usuarioTabla.setCorreo(jTextFieldCorreo.getText());
            usuarioTabla.setNombre(jTextFieldNombre.getText());
            usuarioTabla.setApellido(jTextFieldApellido.getText());
            comprobarRol();
            comprobarActivo();

            conectBD.openBD();
            conectBD.updateUsuario(usuarioTabla);
            conectBD.closeBD();

        } else {
            JOptionPane.showMessageDialog(null, "Hay campos sin rellenar", "Al modificar usuario", JOptionPane.WARNING_MESSAGE);
        }
        if (foto != null) {
            File fichero = new File(System.getProperty("user.dir") + usuarioTabla.getFoto());
            if (fichero.delete()) {
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            } else {
                System.out.println("El fichero no puede ser borrado");
            }
            usuarioTabla.setFoto(usuarioTabla.ponerFoto(foto, usuarioTabla.getId_usuario() + ""));
            conectBD.openBD();
            conectBD.updateFotoUsuario(usuarioTabla.getCorreo(), usuarioTabla.getFoto());
            conectBD.closeBD();
        }

        //actualizamos los campos de la tabla
        cargarTabla();

        limpiar();
    }

    private void aniadir() {
        if (!jTextFieldCorreo.getText().equals("") || !jTextFieldNombre.getText().equals("") || !jTextFieldApellido.getText().equals("") || (Integer) jComboBoxRol.getSelectedIndex() != 0 || jCheckBoxActivo.isSelected() != false) {
            if (jTextFieldCorreo.getText().contains("@") && jTextFieldCorreo.getText().contains(".")) {
                usuarioTabla.setCorreo(jTextFieldCorreo.getText());
                usuarioTabla.setNombre(jTextFieldNombre.getText());
                usuarioTabla.setApellido(jTextFieldApellido.getText());
                usuarioTabla.setPwd("c4ca4238a0b923820dcc509a6f75849b");
                comprobarRol();
                comprobarActivo();

                if (foto != null) {
                    usuarioTabla.setFoto(usuarioTabla.ponerFoto(foto, usuarioTabla.getId_usuario() + ""));
                }

                conectBD.openBD();
                conectBD.insertUsuarios(usuarioTabla);
                conectBD.closeBD();

                //actualizamos los campos de la tabla
                cargarTabla();

                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo usuario, hay que introducir un correo", "Error al introducir el correo", JOptionPane.CLOSED_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hay campos sin rellenar", "Al añadir usuario", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void eliminar() {
        conectBD.openBD();
        conectBD.deleteUsuarios(usuarioTabla.getId_usuario());
        conectBD.closeBD();

        File fichero = new File(System.getProperty("user.dir") + usuarioTabla.getFoto());
        if (fichero.delete()) {
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El fichero no puede ser borrado");
        }
        //actualizamos los campos de la tabla
        cargarTabla();

        limpiar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAniadir;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExaminar;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JCheckBox jCheckBoxActivo;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabelActivo;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFotoSeleccionada;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRangoEdad;
    private javax.swing.JLabel jLabelTituloPantalla;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuGestionar;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemPelis;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuOpcion;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
