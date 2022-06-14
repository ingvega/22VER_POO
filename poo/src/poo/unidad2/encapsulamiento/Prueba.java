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
public class Prueba {

    public static void main(String[] args) {
        /*        
//Crear un objeto Date con la fecha actual
        Date fecha1=new Date();
        //Crear un objeto LocalDate con la fecha actual
        LocalDate fecha2=LocalDate.now();
        System.out.println(fecha1);
        System.out.println(fecha2);
        
        //cambiar la fecha 1 y 2 para el 30 de enero de 2022
        fecha1=new Date(2022-1900,0,30);
        fecha2=LocalDate.of(2022, Month.JANUARY, 30);
        fecha2=LocalDate.of(2022, 1, 30);
        
        //System.out.println(fecha1);
        //System.out.println(fecha2);
        
        System.out.println(fecha1.getDate() +" de " +
                fecha1.getMonth() +" de " +
                fecha1.getYear());
        
        System.out.println(fecha2.getDayOfMonth() +" de " +
                fecha2.getMonth()+" de " +
                fecha2.getYear());
        
         */

        Alumno alumno1 = new Alumno();
//        System.out.println(alumno1.getNoControl());
        alumno1.setNoControl("s21120001");
//        alumno1.setNoControl("s2");
//        alumno1.setNombre("");
//        alumno1.setNombre("                               ");
//        alumno1.setNombre(null);
        alumno1.setNombre("Maria Luz");
//        alumno1.setFechaIngreso(LocalDate.of(2022, 1, 1));
        alumno1.setFechaIngreso(null);
        System.out.println(alumno1.getFechaIngreso() + " sem: "
                + alumno1.getSemestre());
//        alumno1.setFechaIngreso(LocalDate.of(2021, 1, 1));
//        System.out.println(alumno1.getFechaIngreso() + " sem: "
//                + alumno1.getSemestre());
//        alumno1.setFechaIngreso(LocalDate.of(2021, 8, 1));
//        System.out.println(alumno1.getFechaIngreso() + " sem: "
//                + alumno1.getSemestre());
    }
}
