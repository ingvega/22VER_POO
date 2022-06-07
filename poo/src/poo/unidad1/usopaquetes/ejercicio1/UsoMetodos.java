/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.usopaquetes.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class UsoMetodos {
   
    public static void main(String x[]) {
        
        Scanner lector=new Scanner(System.in);
        //generarImpares(lector.nextInt());
        UsoMetodos objeto=new UsoMetodos();
        objeto.generarImpares(lector.nextInt());
    }

    //public es opcional
    public static void generarImpares(int limite) {
//        for (int i = 1; i <= limite; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i + " ");
//            }
//        }
        
        for (int i = 1; i <= limite; i=i+2) {
            
                System.out.print(i + " ");
            
        }

    }
}
