/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author tonyM
 */
public class Profesor extends Persona {
    
    private int _experiencia;
    private String _carnetP;

    public Profesor(int _experiencia, String _carnetP, String _cedula, String _nombre, String _apellido1, String _apellido2, String _fechaN, String _correo, int _tipoP) {
        super(_cedula, _nombre, _apellido1, _apellido2, _fechaN, _correo, _tipoP);
        this._experiencia = _experiencia;
        this._carnetP = _carnetP;
    }

    public Profesor() {
         this._experiencia = 0;
        this._carnetP = "";
    }

    public int getExperiencia() {
        return _experiencia;
    }

    public void setExperiencia(int _experiencia) {
        this._experiencia = _experiencia;
    }

    public String getCarnetP() {
        return _carnetP;
    }

    public void setCarnetP(String _carnetP) {
        this._carnetP = _carnetP;
    }
    
    public String _nExeriencia()
    {
        String nivel = "No mantenido...";
        if (this._experiencia<1) 
        {
            nivel="Entry Level...";
        }else if (this._experiencia>=1 & this._experiencia<=2) 
        {
            nivel = "Junior Level...";
        }else if(this._experiencia>2 & this._experiencia <=4)
        {
            nivel = "Mid Level...";
        }else if(this._experiencia>4)
        {
            nivel = "Senior Level...";
        }
        return nivel;
    }
    
    
    
}
