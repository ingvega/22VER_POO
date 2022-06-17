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
    private LocalDate fechaIngreso;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
    
    protected double calcularSueldo(){
        return 0;
    }
    
    public int calcularAntiguedad(){
        return 0;
    }
    
    
}
