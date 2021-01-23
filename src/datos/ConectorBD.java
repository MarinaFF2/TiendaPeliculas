/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modulos.Peliculas;
import modulos.Usuarios;

/**
 *
 * @author ff_ma
 */
public class ConectorBD {

    //tratamiento del objeto Connection
    private Connection con;
    //tratamiento del objeto Peliculas
    private Peliculas pelis;
    //tratamiento del objeto Usuarios
    private Usuarios usuarios;

    public void openBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tiendaPeli", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeBD() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertPelis(Peliculas pelicula) {

        String sql = "INSERT INTO peliculas VALUES(0,'" + pelicula.getTitulo() + "','" + pelicula.getDirector() + "'," + pelicula.getAnio() + ",'" + pelicula.getCaratula() + "','" + pelicula.getGeneros() + "','" + pelicula.getSinopsis() + "','" + pelicula.getRango_edad() + "','" + pelicula.getPrecio() + "');";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println("Insertado con exito ID_PELI ");
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar ID_PELI ");
            
        }

    }

    public void updateCARATULA(Peliculas pelicula) {
        String sql = String.format("UPDATE peliculas SET CARATULA = '%s' WHERE ID_PELI = '%d';", pelicula.getCaratula(),pelicula.getId_peli());

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println("Actualizado CARATULA con exito ID_PELI " + pelicula.getId_peli());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar ID_PELI " + pelicula.getId_peli());
        }
    }

    public void updatePelis(Peliculas pelicula) {
        String sql = "UPDATE peliculas SET TITULO = '"+pelicula.getTitulo()+"', ANIO = "+pelicula.getAnio()+", GENEROS = '"+pelicula.getGeneros()+"', SINOPSIS = '"+pelicula.getSinopsis()+"', RANGO_EDAD = '"+pelicula.getRango_edad()+"', PRECIO = '"+pelicula.getPrecio()+"' WHERE ID_PELI = "+pelicula.getId_peli()+";";
        
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println("Actualizado  con exito ID_PELI " + pelicula.getId_peli());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar ID_PELI " + pelicula.getId_peli());
        }
    }

    public void deletePelis(int id_peli) {
        String sql = "DELETE FROM peliculas WHERE ID_PELI = " + id_peli;

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            System.out.println("Eliminado con exito");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Peliculas> selectPelis() {
        ArrayList<Peliculas> listaPelis = new ArrayList<Peliculas>();
        //como se reutiliza la variable la ponemos a null
        pelis = null;
        pelis = new Peliculas();
        //consulta que vamos a hacer
        String sql = "SELECT * FROM peliculas;";

        try {
            Statement st = con.createStatement();
            //execute the sentence, obtaining a relset
            ResultSet resul = st.executeQuery(sql);
            //process the resulset with the methos resul.next()
//            if (resul.next() == false) {
//                JOptionPane.showMessageDialog(null, "No hay películas", "No se encuentra", JOptionPane.INFORMATION_MESSAGE);
//            } else {
                while (resul.next()) {
                    pelis = new Peliculas(resul.getInt(1), resul.getString(2), resul.getString(3), resul.getInt(4), resul.getString(5), resul.getString(6), resul.getString(7), resul.getString(8), resul.getDouble(9));
                    listaPelis.add(pelis);
                }
//            }

            resul.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error No hay peli con esa característica", "Error buscar", JOptionPane.ERROR_MESSAGE);
        }
        return listaPelis;
    }

   
    /**
     * Metodo que se utiliza para comprobar si existe el usuario
     *
     * @param correo
     * @return
     */
    public Usuarios existeUsu(String correo) {
        //como se reutiliza la variable la ponemos a null
        usuarios = null;
        //consulta para saber si existe ese usuario con dicho corre y contraseña
        String sql = "SELECT * FROM USUARIOS WHERE CORREO = '" + correo + "'";

        try {
            Statement st = con.createStatement();
            //execute the sentence, obtaining a relset
            ResultSet resul = st.executeQuery(sql);
            //process the resulset with the methos resul.next()

            while (resul.next()) {
                usuarios = new Usuarios(resul.getInt(1), resul.getString(2), resul.getString(3), resul.getString(4), resul.getString(5), resul.getString(6), resul.getInt(7), resul.getInt(8));
            }

            resul.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al comprobar usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return usuarios;
    }

    /**
     * Metodo que se utiliza para iniciar sesion
     *
     * @param correo
     * @param pwd
     * @return
     */
    public Usuarios existeUsuario(String correo, String pwd) {
        //como se reutiliza la variable la ponemos a null
        usuarios = null;
        //consulta para saber si existe ese usuario con dicho corre y contraseña
        String sql = "SELECT * FROM USUARIOS WHERE CORREO = '" + correo + "' AND PWD = '" + pwd + "'";

        try {
            Statement st = con.createStatement();
            //execute the sentence, obtaining a relset
            ResultSet resul = st.executeQuery(sql);
            //process the resulset with the methos resul.next()

            while (resul.next()) {
                usuarios = new Usuarios(resul.getInt(1), resul.getString(2), resul.getString(3), resul.getString(4), resul.getString(5), resul.getString(6), resul.getInt(7), resul.getInt(8));
            }

            resul.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al comprobar usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return usuarios;
    }

    public void insertUsuarios(Usuarios usuario) {
        Usuarios user = null;
        user = existeUsu(usuario.getCorreo());
        if (user == null) {
            String sql = String.format("INSERT INTO usuarios VALUES (0,'%s','%s','%s','%s','%s','%d','%d')",
                    usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getPwd(), usuario.getFoto(), usuario.getIdRol(), usuario.getActivo());
            try {
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void updateUsuario(Usuarios usuario) {
        String sql = String.format("UPDATE usuarios SET "
                + "NOMBRE = '%s', APELLIDO = '%s', CORREO = '%s', IDROL = '%d', ACTIVO = '%d' "
                + "WHERE ID_USUARIO = '%d';",
                usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getIdRol(), usuario.getActivo(), usuario.getId_usuario());

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Actualizado con exito", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateFotoUsuario(String correo, String foto) {
        String sql = String.format("UPDATE usuarios SET PWD = '%s' WHERE CORREO = '%s';", foto, correo);

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Foto modificada con exito", "Exito al modificar perfil", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar foto", "Error al modificar perfil", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updatePwd(String correo, String pwd) {
        String sql = String.format("UPDATE usuarios SET PWD = '%s' WHERE CORREO = '%s';", pwd, correo);

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Actualizado con exito", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
    para hacer el historico
    
    public void insertFromFile(String filename) {
        System.out.println("Hacemos un insert desde el fichero " + filename);
        String linea;
        String[] datos;

        try {
            Scanner sc = new Scanner(new FileReader(filename));
            while (sc.hasNext()) {
                linea = sc.nextLine();
                datos = linea.split(";");
                
            }
            sc.close();
            System.out.println("Realizado con exitio");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("------------------------------------");
    }
     */

}
