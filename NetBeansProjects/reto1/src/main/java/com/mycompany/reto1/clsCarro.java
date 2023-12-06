
package com.mycompany.reto1;
public class clsCarro 
{
  private String id;
  String modelo;
  String placa;
  String color;
  double precio;
  String marca;
  boolean esUsado;
// metodo constructor

    public clsCarro(String id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public clsCarro(String id, String modelo, String color, double precio, String marca) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
    }
    
    
    public boolean indicarSiEsUsado()
    {
        return false;
    }

    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
}
