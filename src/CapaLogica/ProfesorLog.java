/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;
import CapaDatos.*;
import Modelo.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonyM
 */
public class ProfesorLog {
    
    ProfesorDA PLD = new ProfesorDA();
    
    public void Agregar(int _experiencia, String _carnetP, String _cedula, String _nombre, String _apellido1, String _apellido2, String _fechaN, String _correo, int _tipoP)
    {
        if (PLD.Agregar(new Profesor(_experiencia,  _carnetP,  _cedula,  _nombre,  _apellido1,  _apellido2,  _fechaN,  _correo,  _tipoP))) {
            System.out.println("Dato Agregado");
        }
    }
    
    public void Actualizar(int _experiencia, String _carnetP, String _cedula, String _nombre, String _apellido1, String _apellido2, String _fechaN, String _correo, int _tipoP)
    {
        if (PLD.Actualizar(new Profesor(_experiencia,  _carnetP,  _cedula,  _nombre,  _apellido1,  _apellido2,  _fechaN,  _correo,  _tipoP))) {
            System.out.println("Dato Agregado");
        }
    }
    public void Eliminar(String cedula)
    {
        if (PLD.Eliminar(cedula)) {
            System.out.println("Dato Eliminado");
        }
    }
    public DefaultTableModel Persona(String cedula)
    {
        return PLD.Person(cedula);
    }
     public DefaultTableModel Lista()
    {
        return PLD.Lista();
    }
}
