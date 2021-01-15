/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * Clase TablaPuntuacionModel
 * Hereda de DefaultTableModel
 * @see TablaPuntuacionModel
 * @author ff_ma
 */
public class TablaGestionUsuariosModel extends DefaultTableModel {

    /**
     * Constructor para poner los nombres las columnas de la tabla
     */
    public TablaGestionUsuariosModel() {       
        this.addColumn("Foto");
        this.addColumn("Nombre");
        this.addColumn("Apellidos");
        this.addColumn("Correo");
        this.addColumn("Rol");
        this.addColumn("Activo");
    }

    /**
     * Constructor para reemplazar los identificadores de columna en el modelo.
     * @param columnas 
     */
    public TablaGestionUsuariosModel(String[] columnas) {
        //Si nº identificadores > el nº actual de columnas, 
            //se agregan nuevas columnas al final de cada fila del modelo. 
        //Si nº identificadores nuevos < el nº actual de columnas, 
            //se descartan todas las columnas adicionales al final de una fila.
        this.setColumnIdentifiers(columnas);
    }

    /**
     * Método para añadir una fila
     * @param p1 
     */
    public void setFila(Usuarios u1) {
        Vector v = new Vector();
        v.add(u1.getFoto());
        v.add(u1.getNombre());
        v.add(u1.getApellido());
        v.add(u1.getCorreo());
        v.add(u1.getIdRol());
        v.add(u1.getActivo());
        this.addRow(v);
    }

    /**
     * Metodo para que saber si la celda es editable
     * @param row
     * @param column
     * @return 
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        // make read only fields except column 0,13,14
        //return column == 0 || column == 13 || column == 14;
        return false;
    }
}
