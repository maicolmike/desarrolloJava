/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author David Pérez Arias
 */
public class ClsJDBC {

    String url;
    String usuario;
    String contrasenia;
    int port;
    String bd;

    Connection conexion;
    public ResultSet respuestaConsulta;

    public ClsJDBC(String url, String usuario, String contrasenia, int port, String bd) {
        this.url = url;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.port = port;
        this.bd = bd;
        try {
            //Connection conexion = DriverManager.getConnection("http://localhost/", "root", "");     
            this.conexion = DriverManager.getConnection(
                    this.url + ":" + this.port + "/" + this.bd,
                    this.usuario,
                    this.contrasenia);

        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e);
        }
    }

    public void consultar(String sql) {

        try {
            Statement instruccion = this.conexion.createStatement();
            this.respuestaConsulta = instruccion.executeQuery(sql);

        } catch (Exception e) {
            System.out.println("Ocurrión un error al consultar: " + e.toString());
        }
    }

    public ClsRespuesta insertar(String sql) {

        ClsRespuesta respuesta = new ClsRespuesta();

        try {
            Statement instruccion = this.conexion.createStatement();
            instruccion.executeUpdate(sql);
            
            respuesta.setProcesoCompleto(true);
            respuesta.setMensajeUsuario("Se insertó correctamente");
            return respuesta;

        } catch (SQLException e) {
            
            String error = e.toString();
                      
            if (e.getErrorCode() == 1062) {
                respuesta.setProcesoCompleto(false);
                respuesta.setCodeError(e.getErrorCode());
                respuesta.setMensajeUsuario("El id ingresado ya existe");
                return respuesta;
            }

            System.out.println("Ocurrió un error al insertar: " + error);

            respuesta.setProcesoCompleto(false);
            respuesta.setCodeError(e.getErrorCode());
            respuesta.setException(error);
            respuesta.setMensajeUsuario("Ocurrió un error al insertar");
            return respuesta;
        }
    }

    public boolean actualizar(String sql) {

        try {
            Statement instruccion = this.conexion.createStatement();
            instruccion.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al actualizar: " + e.toString());
            return false;
        }
    }

    public boolean eliminar(String sql) {

        try {
            Statement instruccion = this.conexion.createStatement();
            instruccion.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al eliminar: " + e.toString());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            this.conexion.close();
        } catch (Exception e) {
        }
    }

}
