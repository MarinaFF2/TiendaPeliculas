/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.JOptionPane;

/**
 *
 * @author ff_ma
 */
public class Peliculas {

    /**
     * VARIABLES DE LA CALSE PELICULAs
     */
    private int id_peli;
    private String titulo;
    private String director;
    private int anio;
    private String caratula;
    private String generos;
    private String sinopsis;
    private String rango_edad;
    private double precio;

    /**
     * CONSTRUCTORES DE LA CLASE PELIULAs
     */
        
    /**
     * CONSTRUCTOR PARA INSTANCIAR UN OBJETO DE LA CLASE PELICULA DESDE LA BBDD
     *
     * @param id_peli
     * @param titulo
     * @param director
     * @param anio
     * @param caratula
     * @param sinopsis
     * @param generos
     * @param rango_edad
     * @param precio
     */
    public Peliculas(int id_peli, String titulo, String director, int anio, String caratula, String sinopsis, String generos, String rango_edad, double precio) {
        this.id_peli = id_peli;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.caratula = caratula;
        this.generos = generos;
        this.sinopsis = sinopsis;
        this.rango_edad = rango_edad;
        this.precio = precio;
    }

    /**
     * CONSTRUCTOR PARA CONSEGUIR LOS METODOS DE ESTA CLASE SIN NECESIDAD DE
     * INSTANCIAR
     */
    public Peliculas() {
    }

    /**
     * GETTERS && SETTERS
     */
    
    public void setId_peli(int id_peli) {
        this.id_peli = id_peli;
    }

    public int getId_peli() {
        return id_peli;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getRango_edad() {
        return rango_edad;
    }

    public void setRango_edad(String rango_edad) {
        this.rango_edad = rango_edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * METODOS DE LA CLASE PELICULAS
     */
    public String ponerFoto(File foto, String title) {
        String rutaFoto = null;
//        String extension = getExtension(foto.getName());
        String extension = "PNG";
        try {
            //creamos la nueva ruta del fichero
            rutaFoto = "/img/imgPelis/" + title + "." + extension;

            //creamos el fichero se destino
            File destino = new File(System.getProperty("user.dir") + rutaFoto);

            //copiamos la foto al nuevo destino
            Files.copy(foto.toPath(), destino.toPath(), REPLACE_EXISTING);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se puede copiar el fichero de imagen seleccionado", "Error al copiar imagen", JOptionPane.ERROR_MESSAGE);
        }
        return rutaFoto;
    }

    public static String getExtension(String filename) {
        int index = filename.lastIndexOf('.');
        if (index == -1) {
            return "";
        } else {
            return filename.substring(index + 1);
        }
    }

    /**
     * METODO QUE DEVUELVE EL TITULO Y EL AÑO
     *
     * @return String
     */
    @Override
    public String toString() {
        return this.titulo + ", " + this.anio;
    }

}
