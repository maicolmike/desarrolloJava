
package Model;

import clases.*;
import java.sql.*;


/**
 *
 * @author maicol
 */
public class modelDog 
{
   DbData dbData; // crear
   ClsJDBC jdbc;

    public modelDog() 
    {
      //this.dbData = new DbData(); // accedemos a los datos de conexion
      this.jdbc = new ClsJDBC("jdbc:mysql://localhost", "root", "", 3306, "administracionmascotasbd");
       
    }
    
     //metodos
    public boolean CreatePet (clsDog dog)
    {
        try {   
          
            Connection conn = jdbc.getConexion();

            // clase padre pet
            String query ="INSERT INTO tb_pet (code, name, bornYear, color, healthStatus) values (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            statementPet.setString(1, dog.getCode());
            statementPet.setString(2, dog.getName());
            statementPet.setInt(3, dog.getBornYear());
            statementPet.setString(4, dog.getColor());
            statementPet.setString(5, dog.getHealthStatus());
            int rowsInserted = statementPet.executeUpdate();  //cuantas filas fueron insertadas executeUpdate que se ejecute todo lo de arriba
            if (rowsInserted > 0)
            {
               ResultSet generatedKeys = statementPet.getGeneratedKeys();  // devuelve el id de la insercion en la table pet
               if (generatedKeys.next()) // si tiene algo alli
               {
                  int idPet = generatedKeys.getInt(1); // obtenerlo en una variable 
                  // llenar la tabla de cat
                  query ="INSERT INTO tb_dog (breed,pedigree, id_pet) VALUES (?,?,?)";
                  PreparedStatement statementDog = conn.prepareStatement(query);
                  statementDog.setString(1, dog.getBreed());
                  statementDog.setBoolean(2, dog.isPedigre());
                  statementDog.setInt(3, idPet);
                  rowsInserted = statementDog.executeUpdate();
                  if (rowsInserted >0)
                  {
                      return true;
                  }   
               }
            }
            
            return false;

        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar: " + e.getMessage());
            return false;
        }
 
    }
    
    public boolean EditPet (clsDog dog)
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
    
    public boolean DeletePet (clsPet pet)
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
        clsDog dog = null;
        try 
        {
            return dog;
        } 
        catch (Exception e) 
        {
            return dog;
        }
        
    }
}
