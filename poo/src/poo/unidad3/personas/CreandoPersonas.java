/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.personas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class CreandoPersonas {

    public static void main(String[] args) {
        //Crear una lista para los alumnos
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        Scanner lector = new Scanner(System.in);
        String respuesta;
        //Leerá continuamente alumnos hasta que ya no se quiera ingresar más
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingresa el nombre");
            alumno.setNombre(lector.nextLine());
            System.out.println("Ingresa los apellidos");
            alumno.setApellidos(lector.nextLine());
            System.out.println("Ingresa la carrera");
            alumno.setCarrera(lector.nextLine());
            System.out.println("Ingresa el número de control");
            alumno.setNoControl(lector.nextLine());
            System.out.println("Ingresa la fecha de ingreso (aaaa-mm-dd)");
            alumno.setFechaIngreso(LocalDate.parse(lector.nextLine()));
            
            //Añadir el alumno a la lista
            listaAlumnos.add(alumno);
            System.out.println("¿Quieres ingresar otro alumno? (S/N)");
            respuesta = lector.next();
        } while (respuesta.toUpperCase().equals("S"));
        
        //Imprimir los datos
        System.out.println("se ingresaron " + listaAlumnos.size());
        for (int i = 0; i < listaAlumnos.size(); i++) {
            //Obtenemos el alumno en la posicion i
            Alumno alumno=listaAlumnos.get(i);
            //Imprimir los datos de cada alumno
            System.out.println("Alumno " + i);
            System.out.println(alumno);
            System.out.println("--------------------------------------------------------------------");
        }
        
    }
}
