//ejemplo de interfaces
package petmanager;

import clases.*;

/**
 *
 * @author maicol
 */
public class Interface 
{
    public static void main(String[] args) 
    {
       clsDog dog = new clsDog("criollo",false,"001", "firulais",2013,"negro", "sano");
       clsCat cat = new clsCat("angora","002", "minino", 2018, "rojo", "enfermo"); 
       
        System.out.println(dog.getAnimalType());
        System.out.println(dog.getNumberOfBones());
        System.out.println(""+cat.getAnimalType());
        System.err.println(""+cat.getNumberOfBones());
       
    }
    
}
