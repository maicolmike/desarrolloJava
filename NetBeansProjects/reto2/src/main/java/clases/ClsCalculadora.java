package clases;
package interfaz;

/**
 *
 * @author maicol
 */
public class ClsCalculadora 
{   
     double numero1;
     double numero2;
     double resultado;
     char operacion;
     
     
     public ClsCalculadora() 
    {
    }

    public ClsCalculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    public ClsCalculadora(double numero1, double numero2, char operacion) 
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }
      
    public void mostrarResultado(String num){
    System.out.println(this.numero1+" "+this.operacion+" "+this.numero2+" = "+this.resultado);  
        setResultado(resultado);
        
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
     
    
    
    
}
