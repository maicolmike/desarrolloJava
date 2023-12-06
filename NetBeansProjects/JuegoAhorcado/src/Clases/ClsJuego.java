/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author TITANQ
 */
public class ClsJuego {

    private int id;
    private String fecha;
    private String estado;
    private int idGanador;
    private int idPerdedor;
    private int idFrase;
    private int tiempo;

    public ClsJuego() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(int idGanador) {
        this.idGanador = idGanador;
    }

    public int getIdPerdedor() {
        return idPerdedor;
    }

    public void setIdPerdedor(int idPerdedor) {
        this.idPerdedor = idPerdedor;
    }

    public int getIdFrase() {
        return idFrase;
    }

    public void setIdFrase(int idFrase) {
        this.idFrase = idFrase;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}
