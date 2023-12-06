/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author David Pérez Arias
 */
public class ClsFrase {

    private int id;
    private String texto;
    private String enunciado;

    public ClsFrase(int id, String texto, String enunciado) {
        this.id = id;
        this.texto = texto;
        this.enunciado = enunciado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String frase) {
        this.texto = frase;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
        
        System.out.println("");
    }

    
}
