/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.pruebaprotected;

import poo.unidad3.personas.Empleado;

/**
 *
 * @author paveg
 */
public class Administrativo extends Empleado {
    private String departamento;
    private int horaInicio;
    private double sueldoBase;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public void prueba(){
        //Todos los miembros marcados como protected pueden
        //accederse fuera del paquete mientras se usen mediante
        //herencia. Por ejemplo la clase Administrativo (subclase) 
        //puede usar calcularSueldo que está en Empleado (superclase
        //en otro paquete) 
        double sueldo=calcularSueldo();
    }
    
}
