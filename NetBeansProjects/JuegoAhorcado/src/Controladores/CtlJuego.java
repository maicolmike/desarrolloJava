/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.ClsJuego;
import Clases.ClsJugador;
import Modelos.ModJuego;
import java.util.LinkedList;

/**
 *
 * @author TITANQ
 */
public class CtlJuego {

    ModJuego modelo;

    public CtlJuego() {

        this.modelo = new ModJuego();
    }

    public int agregarFrase(ClsJuego juego) {

        int idJuego = this.modelo.agregarJuego(juego);
        return idJuego;
    }

    public boolean actualizarPerdedor(ClsJuego juego) {
        boolean respuesta = this.modelo.actualizarPerdedor(juego);
        return respuesta;
    }

    public boolean agregarJuegoPorJuegadores(ClsJuego juego, LinkedList<ClsJugador> jugadores) {

        boolean respuesta = this.modelo.agregarJuegoPorJuegadores(juego, jugadores);
        return respuesta;
    }

}
