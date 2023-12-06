package ejemplo2;


import javax.swing.JOptionPane;


public class clasePrincipal 
{
    
    public static void main(String[] args) 
    { 
       int opcionConvertidaNumero=1;
       int preguntaVenderNumero=1;
       
       String nitConsecionario= JOptionPane.showInputDialog ("Escribe el nit del consecionario:");
       String nombreConsecionario= JOptionPane.showInputDialog ("Escribe el nombre del consecionario:");
       clsConsecionario consecionario = new clsConsecionario(nitConsecionario,nombreConsecionario); //crear un objeto llamado consecionario
       
       do 
       {  
         String idCarro= JOptionPane.showInputDialog ("Escribe el id del carro:");
         String modeloCarro= JOptionPane.showInputDialog ("Escribe el modelo del carro:");
             //crear el objeto carro
         clsCarro carro = new clsCarro (idCarro,modeloCarro); 
            //adicionar a la lista carros    
         consecionario.listaCarros.add(carro);  
                
         String listaDeCarros= consecionario.ListarCarros(); //funcion para recorrer la lista
         JOptionPane.showMessageDialog(null,listaDeCarros ); //imprimir la lista
            
         String opcionCarro= JOptionPane.showInputDialog ("Desea continuar agregando carros\n 1-si\n 2-no\n elige el numero de la opcion que deseas hacer:");
         opcionConvertidaNumero= Integer.parseInt(opcionCarro);
                
        } while (opcionConvertidaNumero==1);
         String preguntaVender= JOptionPane.showInputDialog ("Deseas vender algun carro:\n 1-si\n 2-no\n elige el numero de la opcion que deseas hacer:");
         preguntaVenderNumero= Integer.parseInt(preguntaVender);   
        do 
        {  
          String idVender= JOptionPane.showInputDialog ("Escribe el id del carro a vender:");
          consecionario.venderCarro(idVender);
          String listaDeCarros= consecionario.ListarCarros(); //funcion para recorrer la lista
          JOptionPane.showMessageDialog(null,listaDeCarros ); //imprimir la lista  
          preguntaVender= JOptionPane.showInputDialog ("Deseas vender algun carro:\n 1-si\n 2-no\n elige el numero de la opcion que deseas hacer:");
          preguntaVenderNumero= Integer.parseInt(preguntaVender);
            
        } while (preguntaVenderNumero==1);
                             
    }
                   
}
           
    
