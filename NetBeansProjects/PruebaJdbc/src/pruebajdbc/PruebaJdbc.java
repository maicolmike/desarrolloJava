
package pruebajdbc;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author maicol
 */
public class PruebaJdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password= "";
        String url= "jdbc:mysql://localhost:3306/administracionmascotasbd";
        Connection connection;
        
        try 
        {
            Class.forName(driver);
            connection = (Connection)DriverManager.getConnection(url, user, password);
            if (connection != null)
            {
                System.out.println("conexion exitosa");
            }
        } 
        catch (Exception e)
        {
            System.out.println("Error en la conexion: " + e.getMessage() );
        }
    }
    
}
