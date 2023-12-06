package clases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author David Pérez Arias
 */
public class ClsJDBC {

    private String url;
    private String usuario;
    private String contrasenia;
    private int port;
    private String bd;

    private Connection conexion;
    //public ResultSet respuestaConsulta;

    public ClsJDBC(String url, String usuario, String contrasenia, int port, String bd) {
        this.url = url;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.port = port;
        this.bd = bd;
        try {   
        this.conexion = DriverManager.getConnection(this.url + ":" + this.port + "/" + this.bd,this.usuario,this.contrasenia);

        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e);
        }
    }
    public ClsRespuesta insertar(String sql) {

        ClsRespuesta respuesta = new ClsRespuesta();

        try {
            Statement instruccion = this.getConexion().createStatement();
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
            Statement instruccion = this.getConexion().createStatement();
            instruccion.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al actualizar: " + e.toString());
            return false;
        }
    }

    public boolean eliminar(String sql) {

        try {
            Statement instruccion = this.getConexion().createStatement();
            instruccion.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al eliminar: " + e.toString());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            this.getConexion().close();
        } catch (Exception e) {
        }
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @return the bd
     */
    public String getBd() {
        return bd;
    }

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }
    
    

}
