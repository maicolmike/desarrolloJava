/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author TITANQ
 */
public interface InterfaceCrud {

    public boolean agregar(Object element);

    public boolean  actualizar(Object element);

    public boolean eliminar(Object element);

    public Object consultar(Object element);

}
