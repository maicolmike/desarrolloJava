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
public class ClsJugador {

    private String nombre;
    private String id;
    private String ciudad;
    private String edad;
    private int vidas;
    private int vidasExtras;
    private String image;
    private int score;
    private boolean finalizoJuego;
    
    public ClsJugador(String id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    public ClsJugador(String id, String nombre, String ciudad, String edad) {
        this.nombre = nombre;
        this.id = id;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public ClsJugador(String id, String nombre, int vidas, int vidasExtras) {
        this.nombre = nombre;
        this.id = id;
        this.vidas = vidas;
        this.vidasExtras = vidasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int turnos) {
        this.vidas = turnos;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getVidasExtras() {
        return vidasExtras;
    }

    public void setVidasExtras(int turnos) {
        this.vidasExtras = turnos;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isFinalizoJuego() {
        return finalizoJuego;
    }

    public void setFinalizoJuego(boolean finalizoJuego) {
        this.finalizoJuego = finalizoJuego;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    

}
