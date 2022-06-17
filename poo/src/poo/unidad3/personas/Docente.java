/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.personas;

/**
 *
 * @author paveg
 */
public class Docente extends Empleado {
    private int horas;
    private double sueldoXHora;
    private String carrera;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldoXHora() {
        return sueldoXHora;
    }

    public void setSueldoXHora(double sueldoXHora) {
        this.sueldoXHora = sueldoXHora;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
