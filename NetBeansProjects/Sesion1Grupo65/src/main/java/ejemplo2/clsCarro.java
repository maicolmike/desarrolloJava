
package ejemplo2;
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
