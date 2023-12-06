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
public class ClsRespuesta {
    
    
    private int codeError;
    private String exception;
    private String mensajeUsuario;
    private boolean procesoCompleto;

    public ClsRespuesta() {
    }

    public int getCodeError() {
        return codeError;
    }

    public void setCodeError(int codeError) {
        this.codeError = codeError;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    public void setMensajeUsuario(String mensajeUsuario) {
        this.mensajeUsuario = mensajeUsuario;
    }

    public boolean isProcesoCompleto() {
        return procesoCompleto;
    }

    public void setProcesoCompleto(boolean procesoCompleto) {
        this.procesoCompleto = procesoCompleto;
    }


    
    
    
    
}
