/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CapaDatos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonyM
 */
public interface IPersona<T> {
    
    boolean Agregar(T obj);
    boolean Actualizar(T obj);
    boolean Eliminar(String codigo);
    DefaultTableModel Lista();
    DefaultTableModel Person(String codigo);
}
