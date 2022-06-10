/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.encapsulamiento;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author paveg
 */
public class Alumno {

    private String noControl;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private Date fechaIngreso;
    private int semestre;

    public Carrera carrera;

    //public tipoDatoAtributo getNombreAtributo()
    public String getNoControl() {
        //return this.noControl;
        return noControl;
    }

    //public void setNombreAtributo(tipoDatoAtributo nombreAtributo)
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    //Verificar que los nombres tienen al menos 2 letras
    //sin espacios a los extremos " Maria      Luz    "
    //"Maria      Luz" y máximo 30 caracteres
    public void setNombre(String value) {
        //Quitar espacios a los extremos usando trim
        if (value != null) {
            value = value.trim();
            //Verificar la longitud
            if (value.length() >= 2 && value.length() <= 30) {
                this.nombre = value;
            } else {
                System.err.println("El nombre no es válido (debe tener entre "
                        + "2 y 30 caracteres sin espacios a los extremos)");
            }
        } else {
            System.err.println("El nombre es obligatorio");
        }
    }
}
