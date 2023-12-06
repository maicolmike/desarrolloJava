/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author maicol
 */
public class ClsCalculadora 
{
    public final String TIPO_NUMERO = "numero";
    public final String TIPO_OPERACION = "operacion";

    private LinkedList<ClsDato> listaDatos = new LinkedList<>();
    private double resultado;
    private ClsDato ultimoDato;

    public ClsCalculadora() {
    }

    /**
     * Este método se encarga de ingresar un nuevo dato ingresado por el usuario
     * al historico
     * OJO: NO hay que solicitar información al usuario
     * se debe asumir que dicha información entra por  parametro
     * @param texto
     * @param tipo 
     */
    public void ingresarNuevoDato(String texto, String tipo) {

        ClsDato dato = new ClsDato(texto, tipo);

        switch (tipo) {

            case TIPO_NUMERO:
            try {
                // Esta línea solo verifica que el dato sea númerico
                int validNumber = Integer.parseInt(texto);

                if (this.ultimoDato == null) {
                    // En caso de que sea el primer dato ingresado
                    this.ultimoDato = dato;

                } else if (this.ultimoDato.getTipo().equals(this.TIPO_NUMERO)) {
                    // En caso de que el ultimo dato ingresado haya sido un número
                    // simplemente concatenamos el número digitado al número anterior
                    this.ultimoDato.setTexto(this.ultimoDato.getTexto() + texto);

                } else if (this.ultimoDato.getTipo().equals(this.TIPO_OPERACION)) {
                    this.listaDatos.add(this.ultimoDato);
                    this.ultimoDato = dato;

                }
            } catch (NumberFormatException e) {
                return;
            }
            break;

            case TIPO_OPERACION:
                if (this.ultimoDato.getTipo().equals(this.TIPO_OPERACION)) {
                    JOptionPane.showMessageDialog(null, "No puedes ingresar dos operaciones de forma consecutiva");
                } else if (this.ultimoDato == null) {
                    JOptionPane.showMessageDialog(null, "El primer dato debe ser númerico");
                } else {
                    this.listaDatos.add(this.ultimoDato);
                    this.ultimoDato = dato;
                }

                break;
        }

    }

    
    /**
     * Este método se encarga de recorrer el historico y calcular
     * el resultado final
     * @return 
     */
    public Double calcularResultado() {

        if (!this.ultimoDato.getTexto().equals("r") && this.ultimoDato.getTipo().equals(this.TIPO_OPERACION)) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un número para realizar la operación");
            return null;
        } else {
            this.listaDatos.add(ultimoDato);
        }

        double resultado = 0;
        int pos = 0;
        String operacionTexto = "#";
        ClsOperacion operacion = new ClsOperacion();

        for (ClsDato dato : listaDatos) {
            if (dato.getTipo().equals(this.TIPO_OPERACION)) {

                if (dato.getTexto().equals("r")) {
                    resultado = operacion.realizarOperacion(resultado, dato.getTexto());
                }
                operacionTexto = dato.getTexto();
            } else if (dato.getTipo().equals(this.TIPO_NUMERO)) {
                if (pos == 0) {
                    resultado = Double.parseDouble(dato.getTexto());
                } else {
                    double num2 = Double.parseDouble(dato.getTexto());
                    resultado = operacion.realizarOperacion(resultado, num2, operacionTexto);
                }
            }
            pos++;
        }

        this.resultado = (double)Math.round(resultado * 100d) / 100d;
        this.listaDatos.removeAll(this.listaDatos);
        ClsDato dato = new ClsDato("" + this.resultado, TIPO_NUMERO);
        this.ultimoDato = dato;
        
        return resultado;

    }

    /**
     * Este método se encarga de obtener el historico de datos
     * ingresados por el usuario
     * @return 
     */
    public String getHistorico() {
        String historico = "";
        for (ClsDato dato : listaDatos) {
            historico += dato.getTexto() + " ";
        }
        if (this.ultimoDato != null) {
            historico += this.ultimoDato.getTexto();
        }
        return historico;
    }

    
    /**
     * Este método se encarga de eliminar el último dato
     */
    public void eliminarUltimoDato() {
        // Colocar código acá
        int longitud = this.listaDatos.size();
        System.out.println("prueba"+longitud);
        if (longitud > 0) {
            // Deben asignar el ultimo dato de la lista a la variable último dato y después deben actualizar la lista de datos            
        } else {
            this.ultimoDato = null;
        }
    }

    
    /**
     * Este método se encarga de reiniciar la calculadora
     */
    public void reiniciar() {
        // Colocar código acá        
    }

    public double getResultado() {
        return resultado;
    }

   public ClsDato getUltimoDato() {
        return this.ultimoDato;
    }

    public LinkedList<ClsDato> getListaDatos() {
        return listaDatos;
    }
}
