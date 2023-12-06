/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadorareplit;

import clases.ClsCalculadora;

/**
 *
 * @author maicol
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClsCalculadora cal = new ClsCalculadora ();
        cal.ingresarNuevoDato("256","+");
       cal.getListaDatos();
        cal.eliminarUltimoDato();
    }
    
}
