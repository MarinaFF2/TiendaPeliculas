/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * Clase TablaGestionPeliculasModel Hereda de DefaultTableModel
 *
 * @see TablaGestionPeliculasModel
 * @author ff_ma
 */
public class TablaGestionPeliculasModel extends DefaultTableModel {

    /**
     * Constructor para poner los nombres las columnas de la tabla
     */
    public TablaGestionPeliculasModel() {
        this.addColumn("Id");
        this.addColumn("Caratula");
        this.addColumn("Titulo");
        this.addColumn("Director");
        this.addColumn("Año");
        this.addColumn("Sinopsis");
        this.addColumn("Generos");
        this.addColumn("Rango Edad");
        this.addColumn("Precio");
    }

    /**
     * Constructor para reemplazar los identificadores de columna en el modelo.
     *
     * @param columnas
     */
    public TablaGestionPeliculasModel(String[] columnas) {
        //Si nº identificadores > el nº actual de columnas, 
        //se agregan nuevas columnas al final de cada fila del modelo. 
        //Si nº identificadores nuevos < el nº actual de columnas, 
        //se descartan todas las columnas adicionales al final de una fila.
        this.setColumnIdentifiers(columnas);
    }

    /**
     * Método para añadir una fila
     *
     * @param p1
     */
    public void setFila(ArrayList<Peliculas> listaPelis) {
        for (Peliculas p1 : listaPelis) {
            Vector v = new Vector();
            v.add(p1.getId_peli());
            v.add(p1.getCaratula());
            v.add(p1.getTitulo());
            v.add(p1.getDirector());
            v.add(p1.getAnio());
            v.add(p1.getGeneros());
            v.add(p1.getSinopsis());
            v.add(p1.getRango_edad());
            v.add(p1.getPrecio());
            this.addRow(v);
        }

    }

    /**
     * Metodo para que saber si la celda es editable
     *
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
