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
public class Usuarios {

    /**
     * VARIABLES DE LA CALSE USUARIOS
     */
    private int id_usuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String pwd;
    private String foto;
    private int idRol;
    private int activo;

    /**
     * CONSTRUCTORES DE LA CLASE USUARIOS
     */
    /**
     * CONSTRUCTOR PARA INSTANCIAR UN OBJETO DE LA CLASE PELICULA DESDE LA BBDD
     *
     * @param id_usuario
     * @param nombre
     * @param apellido
     * @param correo
     * @param pwd
     * @param foto
     * @param idRol
     */
    public Usuarios(int id_usuario, String nombre, String apellido, String correo, String pwd, String foto, int idRol, int activo) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pwd = pwd;
        this.foto = foto;
        this.idRol = idRol;
        this.activo = activo;
    }

    /**
     * CONSTRUCTOR PARA TRATAR EL OBJETO
     *
     * @param nombre
     * @param apellido
     * @param correo
     * @param pwd
     * @param foto
     * @param idRol
     */
    public Usuarios(String nombre, String apellido, String correo, String pwd, String foto, int idRol, int activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pwd = pwd;
        this.foto = foto;
        this.idRol = idRol;
        this.activo = activo;
    }

    /**
     * CONSTRUCTOR PARA CONSEGUIR LOS METODOS DE ESTA CLASE SIN NECESIDAD DE
     * INSTANCIAR
     */
    public Usuarios() {

    }

    /**
     * GETTERS && SETTERS
     */
    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    /**
     * METODOS DE LA CLASE USUARIOS
     */
    public String ponerFoto(File foto, String emailUser) {
        String rutaFoto = null;
//        String extension = getExtension(foto.getName());
        String extension = "PNG";
        try {
            //creamos la nueva ruta del fichero
            rutaFoto = "/img/imgUser/" + emailUser + "." + extension;
//            String fichero = System.getProperty("user.dir")+getClass().getResource("/imgUser/")+foto.getName();

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
}
