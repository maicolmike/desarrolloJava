
package Model;
import java.sql.*;

/**
 *
 * @author maicol
 */
public class DbData 
{
        private String driver = "com.mysql.jdbc.Driver";
        private String user = "root";
        private String password= "";
        private String url= "jdbc:mysql://localhost:3306/administracionmascotasbd";

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    
}