/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.admin;

import datos.ConectorBD;
import modulos.Usuarios;

/**
 *
 * @author ff_ma
 */
public class BienvenidoAdmin extends javax.swing.JFrame {

    private Usuarios usuarios;
    private ConectorBD conectBD;
    /**
     * Creates new form BienvenidaUser
     */
    public BienvenidoAdmin(Usuarios usuarios){
        
        initComponents();
        this.usuarios = usuarios;
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

        jPanel = new javax.swing.JPanel();
        jLabelBienvenida = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOpcion = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuGestionar = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemPelis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBienvenida.setText("Bienvenido");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabelBienvenida)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelBienvenida)
                .addContainerGap(237, Short.MAX_VALUE))
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
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jMenuPerfilMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuPerfilMenuSelected
        dispose();

        PerfilAdmin p = new PerfilAdmin(usuarios);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuPerfilMenuSelected


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuGestionar;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemPelis;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuOpcion;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
