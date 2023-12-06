package ejemplo2;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class clsConsecionario 
{
    private String nit;
    private String nombre;
    String ubicacion;
    int capacidadCarros;
    LinkedList<clsCarro> listaCarros = new LinkedList<clsCarro>();
    
    //metodo constructor
    public clsConsecionario(String nit, String nombre) 
    {
        this.nit = nit;
        this.nombre = nombre;
    }
    
    public String ListarCarros()
    {
    String listaDeCarros = "Los carros disponiles son: \n";
        for (int pos = 0; pos < this.listaCarros.size(); pos++) 
        {
            listaDeCarros += "carro "+ (pos+1) +": "+ this.listaCarros.get(pos).getId()+"\n";
        }
        return listaDeCarros;
    }
    
    public void venderCarro (String id)
    {
        int posicion =0;
        for (int i = 0; i < this.listaCarros.size(); i++) 
        {
            if (id.equals(this.listaCarros.get(i).getId()) )
            {
                posicion=i;
            }
        }
        
        this.listaCarros.remove(posicion); //eliminando el carro
        JOptionPane.showMessageDialog(null, "el carro "+"en la posicion"+posicion +" "+id+ " fue vendido exitosamente");
    }
    
    public boolean validarSiExisteElCarro(String idCarro)
    {
        boolean encontro=true;
        return encontro;
    }
    
   /* public int buscarPosicion (String id)
    {
        int posicion =0;
        for (int i = 0; i < this.listaCarros.size(); i++) 
        {
            if (id== this.listaCarros.get(i).getId())
            {
                posicion=i;
            }
        }
        return posicion;
    }  */
    
    
    //metodo get and set

    public String getNit() 
    {
        return nit;
    }

    public void setNit(String nit) 
    {
        this.nit = nit;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    
}


