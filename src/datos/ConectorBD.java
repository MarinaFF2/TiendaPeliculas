/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
            JOptionPane.showMessageDialog(null, "Insertado con exito", "Insertado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error ", "Error añadir", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void updateCARATULA(Peliculas pelicula) {
        String sql = String.format("UPDATE peliculas SET CARATULA = '%s' WHERE ID_PELI = '%d';", pelicula.getCaratula(), pelicula.getId_peli());

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Actualizado con exito", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error ", "Error modificar caratula", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updatePelis(Peliculas pelicula) {
        String sql = "UPDATE peliculas SET TITULO = '" + pelicula.getTitulo() + "', ANIO = " + pelicula.getAnio() + ", GENEROS = '" + pelicula.getGeneros() + "', SINOPSIS = '" + pelicula.getSinopsis() + "', RANGO_EDAD = '" + pelicula.getRango_edad() + "', PRECIO = '" + pelicula.getPrecio() + "' WHERE ID_PELI = " + pelicula.getId_peli() + ";";

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Actualizado con exito", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error ", "Error modiciar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deletePelis(int id_peli) {
        String sql = "DELETE FROM peliculas WHERE ID_PELI = " + id_peli;

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminado con exito", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error ", "Error eliminar", JOptionPane.ERROR_MESSAGE);
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

            while (resul.next()) {
                pelis = new Peliculas(resul.getInt(1), resul.getString(2), resul.getString(3), resul.getInt(4), resul.getString(5), resul.getString(6), resul.getString(7), resul.getString(8), resul.getDouble(9));
                listaPelis.add(pelis);
            }

            resul.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error No hay pelicula", "Error buscar", JOptionPane.ERROR_MESSAGE);
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
        //comprobamos que no exista ya este nuevo usuario
        if (existeUsu(usuario.getCorreo()) == null) {
            String sql = String.format("INSERT INTO usuarios VALUES (0,'%s','%s','%s','%s','%s','%d','%d')",
                    usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getPwd(), usuario.getFoto(), usuario.getIdRol(), usuario.getActivo());
            try {
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                st.close();
                //mensaje para el usuario de que le tienen que activar la cuenta
                if (usuario.getActivo() == 0) {
                    JOptionPane.showMessageDialog(null, "El administrador te tiene que validar la cuenta para poder acceder", "Exito al crear usuario", JOptionPane.INFORMATION_MESSAGE);
                }
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
        String sql = "UPDATE usuarios SET FOTO = '" + foto + "' WHERE CORREO = '" + correo + "';";

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

    public void deleteUsuarios(int id_usuario) {
        String sql = "DELETE FROM usuarios WHERE ID_USUARIO = " + id_usuario;

        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminado con exito", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Usuarios> selectUsuarios() {
        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
        //como se reutiliza la variable la ponemos a null
        usuarios = null;
        usuarios = new Usuarios();
        //consulta que vamos a hacer
        String sql = "SELECT * FROM usuarios;";

        try {
            Statement st = con.createStatement();
            //execute the sentence, obtaining a relset
            ResultSet resul = st.executeQuery(sql);
            //process the resulset with the methos resul.next()
            if (resul.next() == false) {
                JOptionPane.showMessageDialog(null, "No hay usuarios", "No se encuentra", JOptionPane.INFORMATION_MESSAGE);
            } else {
                while (resul.next()) {
                    usuarios = new Usuarios(resul.getInt(1), resul.getString(2), resul.getString(3), resul.getString(4), resul.getString(5), resul.getString(6), resul.getInt(7), resul.getInt(8));
                    listaUsuarios.add(usuarios);
                }
            }

            resul.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error No hay usuarios", "Error buscar", JOptionPane.ERROR_MESSAGE);
        }
        return listaUsuarios;
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
