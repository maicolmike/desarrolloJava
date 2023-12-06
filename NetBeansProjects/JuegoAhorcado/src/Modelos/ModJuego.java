/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Clases.ClsFrase;
import Clases.ClsJDBC;
import Clases.ClsJuego;
import Clases.ClsJugador;
import Interfaces.InterfaceCrud;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author TITANQ
 */
public class ModJuego implements InterfaceCrud {

    ClsJDBC jdbc;

    public ModJuego() {
        this.jdbc = new ClsJDBC("jdbc:mysql://localhost", "root", "", 3306, "bd_ahorcado");
    }

    @Override
    public boolean agregar(Object element) {

        try {

            ClsJuego juego = (ClsJuego) element;

            String sql = "INSERT INTO tb_juegos (fecha, estado, id_frase ) VALUES (NOW(), 'iniciado', '" + juego.getIdFrase() + "')";
            this.jdbc.insertar(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar el juego: " + e.getMessage());
            return false;
        }

    }

    public int agregarJuego(Object element) {

        int idJuego = -1;
        try {

            ClsJuego juego = (ClsJuego) element;

            String sql = "INSERT INTO tb_juegos (fecha, estado, id_frase ) VALUES (NOW(), 'iniciado', '" + juego.getIdFrase() + "')";
            this.jdbc.insertar(sql);
            this.jdbc.consultar("SELECT id FROM tb_juegos ORDER BY fecha DESC LIMIT 1");
            while (this.jdbc.respuestaConsulta.next()) {
                idJuego = this.jdbc.respuestaConsulta.getInt("id");
            }

            return idJuego;

        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar el juego: " + e.getMessage());
            return idJuego;
        }

    }

    public boolean agregarJuegoPorJuegadores(Object element, LinkedList<ClsJugador> jugadores) {

        try {

            ClsJuego juego = (ClsJuego) element;

            for (ClsJugador j : jugadores) {
                String sql = "INSERT INTO tb_juego_x_jugador (id_juego, id_jugador ) VALUES (" + juego.getId()  + "," + j.getId() + ")";
                this.jdbc.insertar(sql);
            }

            return true;

        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar el juego: " + e.getMessage());
            return false;
        }

    }

    @Override
    public boolean actualizar(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultar(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean actualizarPerdedor(Object element) {

        try {

            ClsJuego juego = (ClsJuego) element;

            String sql = "UPDATE tb_juegos SET id_perdedor = " + juego.getIdPerdedor() + " WHERE id = " + juego.getId();

            this.jdbc.actualizar(sql);
            return true;

        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar el juego: " + e.getMessage());
            return false;
        }
    }

}
