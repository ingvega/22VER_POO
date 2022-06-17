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
public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private String direccion;
    private String telefono;
    private String email;
    private LocalDate fechaIngreso;

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        //que sea del agosto 97 en adelante y a lo mucho tan grande como hoy
        LocalDate minima = LocalDate.of(1997, 8, 1);
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
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            nombre = nombre.trim();
            //Verificar la longitud
            if (nombre.length() >= 2 && nombre.length() <= 30) {
                this.nombre = nombre;
            } else {
                System.err.println("El nombre no es válido (debe tener entre "
                        + "2 y 30 caracteres sin espacios a los extremos)");
            }
        } else {
            System.err.println("El nombre es obligatorio");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
