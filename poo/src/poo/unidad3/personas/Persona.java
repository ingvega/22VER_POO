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
                    + "deben ir de " + minima + " al " + maxima + ")");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            nombre = Utilerias.limpiarEspacios(nombre);
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
        if (apellidos != null) {
            apellidos = Utilerias.limpiarEspacios(apellidos);
            //Verificar la longitud
            if (apellidos.length() >= 2 && apellidos.length() <= 40) {
                this.apellidos = apellidos;
            } else {
                System.err.println("Los apellidos no son válidos "
                        + "(deben tener entre "
                        + "2 y 40 caracteres sin espacios a los extremos)");
            }
        } else {
            System.err.println("Los apellidos son obligatorios");
        }
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
        if (direccion != null) {
            direccion = Utilerias.limpiarEspacios(direccion);
            //Verificar la longitud
            if (direccion.length() >= 10 && direccion.length() <= 100) {
                this.direccion = direccion;
            } else {
                System.err.println("La direccion no es válida "
                        + "(deben tener entre "
                        + "10 y 100 caracteres sin espacios a los extremos)");
            }
        } else {
            System.err.println("La direccion es obligatoria");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono!=null && telefono.matches("^[\\d]{10}$")){
            this.telefono = telefono;
        }else{
            System.out.println("El número de telefono es obligatorio y tener 10 dígitos");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email!=null && email.matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            this.email = email.trim();
        }else{
            System.out.println("El correo electrónico es obligatorio y debe tener un formato válido");
        }
    }

}
