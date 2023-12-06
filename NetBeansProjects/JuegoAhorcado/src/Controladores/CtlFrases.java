/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.ClsFrase;
import Modelos.ModFrases;
import java.util.LinkedList;

/**
 *
 * @author David Pérez Arias
 */
public class CtlFrases {

    private int limiteLetras = 200;
    ModFrases modelo;

    public CtlFrases() {
       
    }

    public int getLimiteLetras() {
        return limiteLetras;
    }

    public void setLimiteLetras(int limiteLetras) {
        this.limiteLetras = limiteLetras;
    }

    public boolean agregarFrase(ClsFrase frase) {
                       
        boolean respuesta = this.modelo.agregar(frase);
        return respuesta;
    }
    
    public boolean eliminarFrase(ClsFrase frase) {                       
        boolean respuesta = this.modelo.eliminar(frase);
        return respuesta;
    }
    // metodo paraactualizar la frase
    public boolean actualizarFrase(ClsFrase frase) {
        boolean respuesta = this.modelo.actualizar(frase);
        return respuesta;
    }

    public LinkedList<ClsFrase> consultarFrases() {
         this.modelo = new ModFrases();
         LinkedList<ClsFrase> listaFrases = this.modelo.consultar(null);            
        // this.modelo.cerrarConexion();
        return listaFrases;
    }

}
