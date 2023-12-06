/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Clases.*;
import Interfaces.InterfaceCrud;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author David Pérez Arias
 */
public class ModJugador implements InterfaceCrud {

    ClsJDBC jdbc;

    public ModJugador() {
        this.jdbc = new ClsJDBC("jdbc:mysql://localhost", "root", "", 3306, "bd_ahorcado");

    }

    @Override
    public boolean agregar(Object elemento) {
        return false;
    }

    public ClsRespuesta agregarJugadorNuevo(Object elemento) {
        try {

            ClsJugador jugador = (ClsJugador) elemento;
            
   String sql = "INSERT INTO tb_jugadores (id, fecha_ingreso, nombre, ciudad,edad) VALUES ("+ jugador.getId() + ", NOW(), '" + jugador.getNombre() + "', '" + jugador.getCiudad()+ "', '" + jugador.getEdad()+ "')";
         return this.jdbc.insertar(sql);                       
            
        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar frases: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean actualizar(Object elemento) {
        try {
            ClsJugador jugador = (ClsJugador) elemento;

       String sql = "UPDATE tb_jugadores SET nombre = '" + jugador.getNombre()+ "', ciudad = '" + jugador.getCiudad()+ "', edad = '" + jugador.getEdad()+ "' WHERE id = " + jugador.getId() + "";
       this.jdbc.actualizar(sql);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminar(Object elemento) {
        try {
            ClsJugador jugador = (ClsJugador) elemento;

            String sql = "DELETE FROM tb_jugadores WHERE id = ' " + jugador.getId() + " '";

            this.jdbc.eliminar(sql);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public LinkedList<ClsJugador> consultar(Object elemento) {

        LinkedList<ClsJugador> listaJugadores = new LinkedList<>();

        try {
            this.jdbc.consultar("SELECT id, nombre, ciudad, edad FROM tb_jugadores");

            while (this.jdbc.respuestaConsulta.next()) {
                String id = this.jdbc.respuestaConsulta.getString("id");
                String nombre = this.jdbc.respuestaConsulta.getString("nombre");
                String ciudad = this.jdbc.respuestaConsulta.getString("ciudad");
                String edad = this.jdbc.respuestaConsulta.getString("edad");
                ClsJugador jugador = new ClsJugador(id, nombre, ciudad, edad);
                listaJugadores.add(jugador);
            }

        } catch (SQLException e) {
            System.out.println("Algó ocurrió al consultar frases: " + e.getMessage());
            return null;
        }

        return listaJugadores;

    }

}
