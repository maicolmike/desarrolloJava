package AplicacionPrincipal;

import clases.ClsSuma;

/**
 *
 * @author maicol
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1 = 10;
        double numero2 = 5;
        
        //suma
        ClsSuma sum = new ClsSuma(numero1,numero2);
        //sum.mostrarResultado();
                
    }
    
}
