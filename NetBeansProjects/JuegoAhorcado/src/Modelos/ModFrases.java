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
public class ModFrases implements InterfaceCrud {

    ClsJDBC jdbc;

    public ModFrases() {
        this.jdbc = new ClsJDBC("jdbc:mysql://localhost", "root", "", 3306, "bd_ahorcado");

    }

    @Override
    public boolean agregar(Object elemento) {
        try {

            ClsFrase frase = (ClsFrase) elemento;

            String sql = "INSERT INTO tb_frases (texto, enunciado) VALUES ('"
                    + frase.getTexto() + "', '" + frase.getEnunciado() + "')";

            this.jdbc.insertar(sql);
            return true;

        } catch (Exception e) {
            System.out.println("Algó ocurrió al insertar frases: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizar(Object elemento) {
        try {
            ClsFrase frase = (ClsFrase) elemento;

          String sql = "UPDATE tb_frases SET texto = '" + frase.getTexto()+ "', enunciado = '" + frase.getEnunciado() + "' WHERE id = " + frase.getId() + "";
            this.jdbc.actualizar(sql);

            return true;
        } catch (Exception e) {
            return false;
        } 
        
        
    }

    @Override
    public boolean eliminar(Object elemento) {
        try {
            ClsFrase frase = (ClsFrase) elemento;

            String sql = "DELETE FROM tb_frases WHERE id = ' " + frase.getId() + " '";

            this.jdbc.eliminar(sql);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public LinkedList<ClsFrase> consultar(Object elemento) {

        LinkedList<ClsFrase> listaFrases = new LinkedList<>();

        try {
            this.jdbc.consultar("SELECT id, texto, enunciado FROM tb_frases");

            while (this.jdbc.respuestaConsulta.next()) {
                int id = this.jdbc.respuestaConsulta.getInt("id");
                String texto = this.jdbc.respuestaConsulta.getString("texto");
                String enunciado = this.jdbc.respuestaConsulta.getString("enunciado");
                ClsFrase frase = new ClsFrase(id, texto, enunciado);
                listaFrases.add(frase);
            }

        } catch (SQLException e) {
            System.out.println("Algó ocurrió al consultar frases: " + e.getMessage());
            return null;
        }

        return listaFrases;

    }
    
    public void cerrarConexion(){
    
        this.jdbc.cerrarConexion();
    }

}
