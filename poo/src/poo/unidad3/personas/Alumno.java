/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.personas;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class Alumno extends Persona{
    private String noControl;
    private double promedio;
    private int semestre;
    private String carrera;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void setFechaIngreso(LocalDate fechaIngreso) {
        //que sea del agosto 97 en adelante y a lo mucho tan grande como hoy
        LocalDate minima = LocalDate.of(1997, 8, 1);
        LocalDate maxima = LocalDate.now();
        if (fechaIngreso.isAfter(minima)
                && fechaIngreso.isBefore(maxima)) {
            if (fechaIngreso.getMonthValue() == 1
                    || fechaIngreso.getMonthValue() == 8) {
                super.setFechaIngreso(fechaIngreso);
            } else {
                System.err.println("El mes de ingreso no es válido, "
                        + "debe ser enero o agosto");
            }
        } else {
            System.err.println("Fecha de ingreso no válida (las fechas válidas "
                    + "deben ir de " + minima + " al " + maxima + ")");
        }
    }
    
    @Override
    public String toString(){
        return "No Control: " + getNoControl() +
            "\nNombre: " + getNombre() + " " + getApellidos() +
            "\nIngreso: " + getFechaIngreso()+
            "\nCarrera: " + getCarrera();
    }
    
}
