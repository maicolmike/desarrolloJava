package com.mycompany.reto1;
import javax.swing.JOptionPane;
public class ClasePrincipal 
{    
    public static void main(String[] args) 
    {
      while (true) 
      { 
         
        String opcion= JOptionPane.showInputDialog ("Reto 1\n 1-calculadora\n 2-concesionario de carros\n 3-salir \n Eliga el numero del proyecto que desea ingresar: ");
        int opcionConvertidaNumero = Integer.parseInt(opcion);
        switch (opcionConvertidaNumero)
        {
            case 1: while (true) 
            {            
                opcion= JOptionPane.showInputDialog ("calculadora sencilla \n "
                    + "1-suma\n 2-resta\n 3-multiplicacion\n 4-division\n 5-salir\n"
                    + "Digite el numero de la operacion que desee realizar: ");
            opcionConvertidaNumero = Integer.parseInt(opcion);

                switch(opcionConvertidaNumero)
                {
                case 1 -> {
                    JOptionPane.showMessageDialog (null , "Usted selecciono la opcion\n"+opcionConvertidaNumero+"-suma");
                    String opcionNumero1= JOptionPane.showInputDialog ("Digite el primer numero: ");
                    int opcionConvertidaNumero1= Integer.parseInt(opcionNumero1);
                    String opcionNumero2= JOptionPane.showInputDialog ("Digite el segundo numero: ");
                    int opcionConvertidaNumero2= Integer.parseInt(opcionNumero2);
                    int resultado=opcionConvertidaNumero1+opcionConvertidaNumero2;
                    JOptionPane.showMessageDialog(null,"EL resultado de la operacion "+opcionConvertidaNumero1+"+"+opcionConvertidaNumero2+" es: "+resultado);
                        }
                case 2 -> {
                    JOptionPane.showMessageDialog (null , "Usted selecciono la opcion\n"+opcionConvertidaNumero+"-resta");
                            String opcionNumero1 = JOptionPane.showInputDialog ("Digite el primer numero: ");
                            int opcionConvertidaNumero1 = Integer.parseInt(opcionNumero1);
                            String opcionNumero2 = JOptionPane.showInputDialog ("Digite el segundo numero: ");
                            int opcionConvertidaNumero2 = Integer.parseInt(opcionNumero2);
                            int resultado = opcionConvertidaNumero1-opcionConvertidaNumero2;
                            JOptionPane.showMessageDialog(null,"EL resultado de la operacion "+opcionConvertidaNumero1+"-"+opcionConvertidaNumero2+" es: "+resultado);
                        }
                case 3 -> {
                    JOptionPane.showMessageDialog (null , "Usted selecciono la opcion\n"+opcionConvertidaNumero+"-multiplicacion");
                            String opcionNumero1 = JOptionPane.showInputDialog ("Digite el primer numero: ");
                            int opcionConvertidaNumero1 = Integer.parseInt(opcionNumero1);
                            String opcionNumero2 = JOptionPane.showInputDialog ("Digite el segundo numero: ");
                            int opcionConvertidaNumero2 = Integer.parseInt(opcionNumero2);
                            int resultado = opcionConvertidaNumero1*opcionConvertidaNumero2;
                            JOptionPane.showMessageDialog(null,"EL resultado de la operacion "+opcionConvertidaNumero1+"*"+opcionConvertidaNumero2+" es: "+resultado);
                        }
                case 4 -> {
                    JOptionPane.showMessageDialog (null , "Usted selecciono la opcion\n"+opcionConvertidaNumero+"-division");
                            String opcionNumero1 = JOptionPane.showInputDialog ("Digite el primer numero: ");
                            int opcionConvertidaNumero1 = Integer.parseInt(opcionNumero1);
                            String opcionNumero2 = JOptionPane.showInputDialog ("Digite el segundo numero: ");
                            int opcionConvertidaNumero2 = Integer.parseInt(opcionNumero2);
                            int resultado = opcionConvertidaNumero1/opcionConvertidaNumero2;
                            JOptionPane.showMessageDialog(null,"EL resultado de la operacion "+opcionConvertidaNumero1+"/"+opcionConvertidaNumero2+" es: "+resultado);
                        }
                case 5 -> System.exit(0); //funcion para salir del programa
                default -> JOptionPane.showMessageDialog(null,"EL numero seleccionado es incorrecto");
                } 
            }
            case 2: JOptionPane.showMessageDialog(null,"Proyecto consecinario");
            opcionConvertidaNumero=1;
            int preguntaVenderNumero=1;
       
            String nitConsecionario= JOptionPane.showInputDialog ("Escribe el nit del consecionario:");
            String nombreConsecionario= JOptionPane.showInputDialog ("Escribe el nombre del consecionario:");
           clsConsecionario consecionario = new clsConsecionario(nitConsecionario,nombreConsecionario); //crear un objeto llamado consecionario
       
           do 
           {  
            String idCarro= JOptionPane.showInputDialog ("Escribe el id del carro:");
            String modeloCarro= JOptionPane.showInputDialog ("Escribe el modelo del carro:");
            String colorCarro= JOptionPane.showInputDialog ("Escribe el color del carro:");
            String precioCarro= JOptionPane.showInputDialog ("Escribe el precio del carro:");
            double precioCarroDouble = Double.parseDouble(precioCarro);
            String marcaCarro= JOptionPane.showInputDialog ("Escribe la marca del carro:");
             //crear el objeto carro
            clsCarro carro = new clsCarro (idCarro,modeloCarro,colorCarro,precioCarroDouble,marcaCarro); 
            
            //adicionar a la lista carros    
            consecionario.listaCarros.add(carro);  
                
            String listaDeCarros= consecionario.ListarCarros(); //funcion para recorrer la lista
            JOptionPane.showMessageDialog(null,listaDeCarros ); //imprimir la lista
            
            String opcionCarro= JOptionPane.showInputDialog ("Desea continuar agregando carros\n 1-si\n 2-no\n elige el numero de la opcion que deseas hacer:");
            opcionConvertidaNumero= Integer.parseInt(opcionCarro);
                
            } while (opcionConvertidaNumero==1);
           
           
             String preguntaVender= JOptionPane.showInputDialog ("Deseas vender algun carro:\n 1-si\n 2-no\n elige el numero de la opcion que deseas hacer:");
             preguntaVenderNumero= Integer.parseInt(preguntaVender);   
             while (preguntaVenderNumero==1) 
             {    
                 
             String idVender= JOptionPane.showInputDialog ("Escribe el id del carro a vender:");
             consecionario.venderCarro(idVender);
             String listaDeCarros= consecionario.ListarCarros(); //funcion para recorrer la lista
             
             if (consecionario.listaCarros.isEmpty()) 
                {
                 JOptionPane.showMessageDialog(null,"No hay autos para vender" ); //imprimir la lista
                 preguntaVenderNumero=2;
 
                 } 
             else 
                 {
                  JOptionPane.showMessageDialog(null,listaDeCarros ); //imprimir la lista     
                  preguntaVender= JOptionPane.showInputDialog ("Deseas vender algun carro:\n 1-si\n 2-no\n elige el numero de la opcion que deseas hacer:");
                  preguntaVenderNumero= Integer.parseInt(preguntaVender);  
                  }
             
              }
      
            case 3: System.exit(0); //funcion para salir del programa
            
            default: JOptionPane.showMessageDialog(null,"EL numero seleccionado es incorrecto");
        }    
      }
    }
    
}
