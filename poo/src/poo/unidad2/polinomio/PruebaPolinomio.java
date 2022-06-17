/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.polinomio;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class PruebaPolinomio {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        Polinomio p1=new Polinomio();
        System.out.println("Indica el valor en X para probar un polinomio "
                + "con los coeficientes en 1");
        System.out.println(p1.calcularValor(lector.nextInt()));
        
        
        
        
        
    }
}
