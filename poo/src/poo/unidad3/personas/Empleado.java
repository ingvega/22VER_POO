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
public class Empleado extends Persona {
    private int clave;
    
    public void setFechaIngreso(LocalDate fechaIngreso) {
        //que sea del agosto 96 en adelante y a lo mucho tan grande como hoy
        LocalDate minima = LocalDate.of(1996, 8, 1);
        LocalDate maxima = LocalDate.now();
        if (fechaIngreso.isAfter(minima)
                && fechaIngreso.isBefore(maxima)) {
                //this.fechaIngreso = fechaIngreso;
                super.setFechaIngreso(fechaIngreso);
        } else {
            System.err.println("Fecha de ingreso no válida (las fechas válidas "
                    + "deben ir de " +minima + " al " + maxima+")");
        }
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    
    
    
    
    protected double calcularSueldo(){
        return 0;
    }
    
    public int calcularAntiguedad(){
        return 0;
    }
    
    
}
