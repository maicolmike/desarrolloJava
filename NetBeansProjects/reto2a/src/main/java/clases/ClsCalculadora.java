package clases;
/**
 *
 * @author maicol
 */
public class ClsCalculadora 
{
    private String numero1;
    private String numero2;
    private Double resultado=0.0;
    private String respuesta;
    private String signo;
    
    public static void main(String[] args)
    {
    }
// metodo constructor
    public ClsCalculadora(String numero1, String numero2, String signo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.signo = signo;
    }

    public ClsCalculadora(String numero1, String signo) {
        this.numero1 = numero1;
        this.signo = signo;
    }
    
    
    //metodo operacion
    public String operacion ()
 {
     if (signo.equals("+"))
     {
      resultado=Double.parseDouble(numero1)+ Double.parseDouble(numero2);
     }
     if (signo.equals("-"))
     {
      resultado=Double.parseDouble(numero1)- Double.parseDouble(numero2);
     }
     if (signo.equals("*"))
     {
      resultado=Double.parseDouble(numero1)* Double.parseDouble(numero2);
     }
     if (signo.equals("/"))
     {
         if (!numero2.equals("0")) 
         {
           resultado=Double.parseDouble(numero1)/ Double.parseDouble(numero2);
         }
         else 
         {
           respuesta="No se puede dividir entre cero";
           //respuesta=resultado.toString();
         }
     }
     if (signo.equals("p"))
     {
      resultado=Double.parseDouble(numero1)* Double.parseDouble(numero1);
     }
     if (signo.equals("r"))
     {
      resultado=Double.parseDouble(numero1);
      resultado = Math.sqrt(resultado);
     }
     // imprimir el resultado
     System.out.println(""+resultado);
     respuesta=resultado.toString();   // volver string el resultado
     return respuesta;
 }
    //getters y setters

    /**
     * @return the numero1
     */
    public String getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public String getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return the resultado
     */
    public Double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the signo
     */
    public String getSigno() {
        return signo;
    }

    /**
     * @param signo the signo to set
     */
    public void setSigno(String signo) {
        this.signo = signo;
    }
    
            
}

