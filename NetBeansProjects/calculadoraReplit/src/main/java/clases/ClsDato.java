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
public class ClsDato 
{
    private String texto;
    private String tipo;

    public ClsDato(String dato, String tipo) {
        this.texto = dato;
        this.tipo = tipo;
    }  

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
