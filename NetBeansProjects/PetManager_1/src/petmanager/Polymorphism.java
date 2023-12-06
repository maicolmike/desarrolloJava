// ejemplo de polimorfismo puro
package petmanager;

import clases.*;

/**
 *
 * @author maicol
 */
public class Polymorphism
{
    //psvm se debe presionar tecla tabulador para convertirlo en clase main
    
    public static void main(String[] args) 
    {
        //instancias de las clases hijas
       clsDog dog = new clsDog("criollo",false,"001", "firulais",2013,"negro", "sano");
       clsCat cat = new clsCat("angora","002", "minino", 2018, "rojo", "enfermo");
       //instancias de las clases veterinaria y doctor
       clsDoctor doctor = new clsDoctor("Maria Fernandez", "12345");
       clsVeterinary veterinary = new clsVeterinary("clinican", "3112900465", "pablo vi", doctor);
       
       String careDog = veterinary.PetCare(dog);
       System.out.println("EL estado de salud de "+dog.getName()+" es "+ careDog);
        
       String careCat = veterinary.PetCare(cat);
       System.out.println("EL estado de salud de "+cat.getName()+" es "+ careCat);
    }
   
}