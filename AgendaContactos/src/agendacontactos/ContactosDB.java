package agendacontactos;

/**
 *
 * @author Chaparro
 */
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ContactosDB {

    public void buscarATabla(String nom, String ape) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Contactos.sqlite");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from contactos where Nombre='" + nom + "' and Apellidos='" + ape + "");
            //objeto que utiliza un método de la clase ResultSet creado en el tutorial
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            
            
            stat.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de seleccion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de seleccion");
        }
    }

    /**
     * Metodo insercion util para añadir contactos a la base de datos
     *
     * @param dni
     * @param nom
     * @param ape
     * @param tel
     * @param dir
     */
    public void insercion(String dni, String nom, String ape, String tel, String dir) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:contactos.sqlite");
            Statement stat = conn.createStatement();
            stat.executeUpdate("INSERT INTO contactos(DNI,Nombre,Apellidos,Teléfono,Dirección) VALUES('" + dni + "','" + nom + "','" + ape + "','" + tel + "','" + dir + "')");
            stat.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de insercion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de insercion");
        }
    }

    public void actualizar(String dni, String tel) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:contactos.sqlite");
            Statement stat = conn.createStatement();
            stat.executeUpdate("UPDATE contactos SET Teléfono='" + tel + "' WHERE DNI='" + dni + "'");
            stat.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de insercion");
        }
    }

    public void eliminar(String dni) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:contactos.sqlite");
            Statement stat = conn.createStatement();
            stat.executeUpdate("DELETE FROM contactos WHERE DNI='" + dni + "'");
            stat.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de eliminacion");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de insercion");
        }

    }
}
