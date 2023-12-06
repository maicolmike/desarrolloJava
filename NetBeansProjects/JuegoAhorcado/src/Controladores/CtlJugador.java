/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.ClsFrase;
import Clases.ClsJugador;
import Clases.ClsRespuesta;
import Modelos.ModJugador;
import java.util.LinkedList;

/**
 *
 * @author TITANQ
 */
public class CtlJugador {

    ModJugador modelo;

    public CtlJugador() {

    }

    public boolean eliminarJugadores(ClsJugador jugador) {

        boolean respuesta = this.modelo.eliminar(jugador);
        return respuesta;
    }
    public boolean actualizarJugadores(ClsJugador jugador) {

        boolean respuesta = this.modelo.actualizar(jugador);
        return respuesta;
    }

    public LinkedList<ClsJugador> consultarJugadores() {
        this.modelo = new ModJugador();
        LinkedList<ClsJugador> lista = this.modelo.consultar(null);
        return lista;
    }

    public ClsRespuesta agregarJugador(ClsJugador jugador) {
        return this.modelo.agregarJugadorNuevo(jugador);
    }
}
