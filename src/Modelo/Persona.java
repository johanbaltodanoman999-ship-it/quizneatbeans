/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author tonyM
 */
public class Persona {
    
    protected String _cedula;
    protected String _nombre;
    protected String _apellido1;
    protected String _apellido2;
    protected String _fechaN;
    protected String _correo;
    protected int _tipoP;

    public Persona(String _cedula, String _nombre, String _apellido1, String _apellido2, String _fechaN, String _correo, int _tipoP) {
        this._cedula = _cedula;
        this._nombre = _nombre;
        this._apellido1 = _apellido1;
        this._apellido2 = _apellido2;
        this._fechaN = _fechaN;
        this._correo = _correo;
        this._tipoP = _tipoP;
    }

    public Persona() {
        this._cedula = "";
        this._nombre = "";
        this._apellido1 = "";
        this._apellido2 = "";
        this._fechaN = "";
        this._correo = "";
        this._tipoP = 0;
    }

    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido1() {
        return _apellido1;
    }

    public void setApellido1(String _apellido1) {
        this._apellido1 = _apellido1;
    }

    public String getApellido2() {
        return _apellido2;
    }

    public void setApellido2(String _apellido2) {
        this._apellido2 = _apellido2;
    }

    public String getFechaN() {
        return _fechaN;
    }

    public void setFechaN(String _fechaN) {
        this._fechaN = _fechaN;
    }

    public String getCorreo() {
        return _correo;
    }

    public void setCorreo(String _correo) {
        this._correo = _correo;
    }

    public int getTipoP() {
        return _tipoP;
    }

    public void setTipoP(int _tipoP) {
        this._tipoP = _tipoP;
    }
    
    
    public int _calcEdad() // dd/mm/aaaa
    {
        String vec[] = _fechaN.split("/");
        return 2026-Integer.parseInt(vec[2]);
    }
     
}
