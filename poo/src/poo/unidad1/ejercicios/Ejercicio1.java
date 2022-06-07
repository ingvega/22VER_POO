/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.ejercicios;
//Cargar todas las clases dentro de util
//import java.util.*;
//Cargar solo la clase que necesitamos
import java.util.Scanner;
import poo.unidad1.usopaquetes.ejercicio1.UsoMetodos;

/**
 *
 * @author paveg
 */
public class Ejercicio1 {
//Apache netbeans (main y psvm)
//netbeans (psvm)
    /** 
     * 
     * @param args 
     */
    public static void main(String[] args) {
        //Comentarios de línea
        /*
        comentarios de bloque
        */
        
        //Cómo leer
        Scanner lector=new Scanner(System.in);
        int limite;
        //Escribir en consola
        System.out.println("Indica el límite hasta "
                + "donde quieres generar los impares");
        //limite=0;
        limite=lector.nextInt();
        System.out.println("El valor ingresado es: "+limite);
        System.out.println();
        System.out.println("El \nvalor \ningresado \nes: \n"+limite);
        
//        UsoMetodos obj=new UsoMetodos();
//        obj.generarImpares(limite);
        UsoMetodos.generarImpares(limite);
    }
    
}
