
package petmanager;

import clases.*;

/**
 *
 * @author maicol
 */
public class AbstractClass 
{
    public static void main(String[] args) 
    {
        //instancias de las clases veterinaria y doctor
        clsDoctor doctor = new clsDoctor("Maria Fernandez", "12345");
        clsVeterinary veterinary = new clsVeterinary(" clinican", "3112900465", "pablo vi", doctor);
        
        //pasar datos veterinary
        veterinary.setData(veterinary.getName()+ " -" + veterinary.getAddres());
        
        // ver los metodos abstractos
        String data= veterinary.getHospitalInformation();
        String type= veterinary.getPatientType();
        String surgery= veterinary.Surgery();
        
        //imprimir
        System.err.println("Data:" + data);
        System.err.println("Tipo:" + type);
        System.err.println("surgery:" + surgery);
    }
    
}
