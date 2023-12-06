
package Model;
import clases.*;
import java.sql.*;

/**
 *
 * @author maicol
 */
public class modelCat
{
    DbData dbData; // crear
    //ClsJDBC jdbc;


    public modelCat() 
    {
      this.dbData = new DbData(); // accedemos a los datos de conexion
       // this.jdbc = new ClsJDBC("jdbc:mysql://localhost", "root", "", 3306, "administracionmascotasbd");
    }
    
    
    //metodos
    public boolean CreatePet (clsCat cat)
    {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword()))
        {  
            // clase padre pet
            
            String query ="INSERT INTO tb_pet (code, name, bornYear, color, healthStatus) values (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            statementPet.setString(1, cat.getCode());
            statementPet.setString(2, cat.getName());
            statementPet.setInt(3, cat.getBornYear());
            statementPet.setString(4, cat.getColor());
            statementPet.setString(5, cat.getHealthStatus());
            int rowsInserted = statementPet.executeUpdate();  //cuantas filas fueron insertadas executeUpdate que se ejecute todo lo de arriba
            if (rowsInserted > 0)
            {
               ResultSet generatedKeys = statementPet.getGeneratedKeys();  // devuelve el id de la insercion en la table pet
               if (generatedKeys.next()) // si tiene algo alli
               {
                  int idPet = generatedKeys.getInt(1); // obtenerlo en una variable 
                  // llenar la tabla de cat
                  query ="INSERT INTO tb_cat (breed, id_pet) VALUES (?,?)";
                  PreparedStatement statementCat = conn.prepareStatement(query);
                  statementCat.setString(1, cat.getBreed());
                  statementCat.setInt(2, idPet);
                  rowsInserted = statementCat.executeUpdate();
                  if (rowsInserted >0)
                  {
                      return true;
                  }   
               }
            }
            
            return false;
        } 
        catch (SQLException e) 
        {
            return false;
        }  
    }
    
    public boolean EditPet (clsCat cat)
    {
        try 
        {
            
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
        
    }
    
    public boolean DeletePet (clsCat cat)
    {
        try 
        {
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
        
    }
    
    public clsPet SearchPet (String code)
    {
        clsCat cat = null;
        try 
        {
            return cat;
        } 
        catch (Exception e) 
        {
            return cat;
        }
        
    }
    
    
}
