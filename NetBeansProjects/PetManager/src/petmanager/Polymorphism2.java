// ejemplo de polimorfismo sobreescritura de metodos
package petmanager;

import clases.*;

/**
 *
 * @author maicol
 */
public class Polymorphism2 
{
    public static void main(String[] args) 
    {
        //instancias de las clases hijas
       clsDog dog = new clsDog("criollo",false,"001", "firulais",2013,"negro", "sano");
       clsCat cat = new clsCat("angora","002", "minino", 2018, "rojo", "enfermo");
       
       dog.Sound();
       cat.Sound();
        
    }
    
}