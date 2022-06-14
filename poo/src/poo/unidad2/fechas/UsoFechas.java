/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.fechas;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author paveg
 */
public class UsoFechas {
    public static void main(String[] args) {
        LocalDate fechaNac=LocalDate.of(2000, Month.MARCH, 21);
        LocalDate fechaNac2=LocalDate.of(2000, Month.MARCH, 21);
        if(fechaNac.equals(fechaNac2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
        
    }
}
