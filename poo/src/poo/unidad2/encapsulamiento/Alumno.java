/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.encapsulamiento;

import java.time.LocalDate;
import java.time.Month;
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
    private LocalDate fechaIngreso=LocalDate.now();
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        //que sea del agosto 97 en adelante y a lo mucho tan grande como hoy
        LocalDate minima = LocalDate.of(1, 8, 1997);
        LocalDate maxima = LocalDate.now();
        if (fechaIngreso.isAfter(minima)
                && fechaIngreso.isBefore(maxima)) {
            if (fechaIngreso.getMonthValue() == 1
                    || fechaIngreso.getMonthValue() == 8) {
                this.fechaIngreso = fechaIngreso;
            } else {
                System.err.println("El mes de ingreso no es válido, "
                        + "debe ser enero o agosto");
            }
        } else {
            System.err.println("Fecha de ingreso no válida (las fechas válidas "
                    + "deben ir de " +minima + " al " + maxima+")");
        }

        
    }

}
