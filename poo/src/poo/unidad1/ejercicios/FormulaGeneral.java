/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.ejercicios;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class FormulaGeneral {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int a,b,c;
        a=lector.nextInt();
        b=lector.nextInt();
        c=lector.nextInt();
        double x1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        double x2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        
        System.out.println((int)x1+" "+(int)x2);
        System.out.println("Suma es igual a " +( a+b+c));
        
        double total=7.6;
        double total2=7.3;
        System.out.printf("%.0f %.0f", total,total2);

//        double total=7.6;
//        double total2=7.3;
//        
//        int t= (int) total;
//        int t2= (int) total2;
        
        


    }
}
