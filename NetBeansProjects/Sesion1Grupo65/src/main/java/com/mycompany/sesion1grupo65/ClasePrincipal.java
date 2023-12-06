package com.mycompany.sesion1grupo65;

/**
 *
 * @author maicol
 */
public class ClasePrincipal 
{

    public static void main(String[] args) 
    {
        
        for(int i=0; i<10; i++)
        {
            System.out.println("el numero de for es: "+i);
        }
        
        int j=0;
        while (j<=10)
        {            
            System.out.println("el numero de while es: "+j);
            j++;
        }
        //tabla del 5
        int numero1;
        numero1=5;
        int numero2;
        numero2=1;
        int resultado=0;
        while (numero2<=10)
        {            
            resultado=numero1*numero2;
            System.out.println("el numero de while es: "+numero1+"*"+numero2+"="+resultado);
            numero2++;
            //numero1++;
        }
        ClsMesero mesero= new ClsMesero("david","1234");
        System.out.println("el nombre del usuario es: "+mesero.nombre);
        
    }
    
}
