/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.triangulo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class CrearTriangulosVarios {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("¿Cuántos triángulos quieres?");
        int cantidad=lector.nextInt();
        
        Random r=new Random();
        
        Triangulo t;//=new Triangulo();
        int b,a;
        for (int i = 0; i < cantidad; i++) {
            t=new Triangulo();
            b=r.nextInt(10);
            a=r.nextInt(10);
            t.setBase(b);
            t.setAltura(a);
            System.out.println("("+b+","+a+")Triangulo Base= " + 
                    t.getBase() + " Altura = "+t.getAltura());
        }
                
    }
}
