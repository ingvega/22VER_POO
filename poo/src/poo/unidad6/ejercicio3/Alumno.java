/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad6.ejercicio3;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author paveg
 */
public class Alumno implements Serializable {

    private String noControl;
    private String nombre;
    private String apellidos;
    private int semestre;

    public Alumno() {}
    public Alumno(String noControl, String nombre, String apellidos, int semestre) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.semestre = semestre;
    }

    
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        noControl = noControl.trim();
        if (noControl.trim().length() == 9
                && noControl.matches("^[acdegmstACDEGMST][0-9]{2}12[0-9]{4}$")) {
            this.noControl = noControl;
        } else {
            throw new IllegalArgumentException("El número de control no es válido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre=nombre.trim();
        if (nombre.length() >= 2 && nombre.length() <= 30) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre no válido (entre 2 y 30 caracteres)");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        apellidos=apellidos.trim();
        if (apellidos.length() >= 3 && apellidos.length() <= 40) {
            this.apellidos = apellidos;
        } else {
            throw new IllegalArgumentException("Apellidos no válidos (entre 3 y 40 caracteres)");
        }
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre >= 1 && semestre <= 13) {
            this.semestre = semestre;
        } else {
            throw new IllegalArgumentException("El semestre debe estar entre 1 y 13");
        }
    }
//
//    @Override
//    public String toString() {
//        return noControl + "-,-" + nombre + "-,-" + apellidos + "-,-" + semestre +'\n';
//    }
    

    public String convierteCadena(){
        return "Alumno\n\tNoControl: " + noControl + "\n\tNombre: " + nombre + "\n\tApellidos: " + apellidos + "\n\tSemestre: " + semestre + '\n';
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Alumno other = (Alumno) obj;
//        
//        //if (!this.noControl.equals(other.noControl)) {
//        if (!Objects.equals(this.noControl.toLowerCase(), other.noControl.toLowerCase())) {
//            return false;
//        }
//        
//        return true;
//    }

    
    
}
