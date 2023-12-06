/* ejemplo de polimorfismo sobrecarga de metodos */
package petmanager;

import clases.*;

/**
 *
 * @author maicol
 */
public class Polymorphism3 
{
    public static void main(String[] args) 
    {
        clsDog dog = new clsDog("criollo",false,"001", "firulais",2013,"negro", "sano");
        
        dog.WalkAround();
        dog.WalkAround(10);
        dog.WalkAround(true);
        
        
    }
    
}