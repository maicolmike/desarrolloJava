/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author maicol
 */
public class ClsSuma extends ClsCalculadora       
{
    double suma;
       
    public ClsSuma(double numero1, double numero2) {
             
        super(numero1, numero2, '+');
        this.suma = numero1 + numero2;
        this.setResultado(this.suma);
    }
    
    
}
