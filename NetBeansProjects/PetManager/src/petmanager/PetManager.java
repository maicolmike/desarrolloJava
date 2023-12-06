package petmanager;

import clases.*;
import java.util.Date;

/**
 *
 * @author maicol
 */
public class PetManager 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
      clsDog dog1 = new clsDog("criollo",false,"001", "firulais",2013,"negro", "sano");
      //clsPet pet1= new clsPet();
      
   /**pet1.setName("firulais");
      pet1.setBornYear(2015);
      pet1.setHealthStatus("sano");
      pet1.setCode("001"); 
      pet1.setColor("negro");  */
       
      clsCat cat1 = new clsCat("angora","002", "minino", 2018, "rojo", "enfermo");
      
      Date currentDate= new Date();  // currentDate es fecha actual
      int anioActual = currentDate.getYear();
      int agePet1= anioActual- dog1.getBornYear(); //agePet1 edad mascota
      int agePet2= anioActual- cat1.getBornYear(); //agePet2 edad mascota
      
        if (agePet1>agePet2) 
        {
            System.out.println("La mascota "+ dog1.getName()+" es mayor que la mascota "+ cat1.getName());
        }
        else
        {
            if (agePet2>agePet1) 
            {
                System.out.println("La mascota "+ cat1.getName()+" es mayor que la mascota "+ dog1.getName());
            } else 
            {
                System.out.println("La mascota "+ dog1.getName()+" tiene la misma edad que la mascota "+ cat1.getName());
            }
        }
        
      dog1.Eat();
      dog1.Move();
      dog1.Sound();
      
      cat1.Eat();
      cat1.Move();
      cat1.Sound();
      
      dog1.WalkAround();
      cat1.SelfCleaning();
    }
    
}