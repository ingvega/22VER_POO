/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.triangulo;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Triangulo t;
        t=new Triangulo();
        
        t.setAltura(-10);
        t.setBase(20.3);
        
        System.out.println("Base " + t.getBase());
        System.out.println("Altura " + t.getAltura());
        
        Triangulo t2;
        t2=new Triangulo(-5,4);
         System.out.println("--------------------------------------");
        System.out.println("Base " + t2.getBase());
        System.out.println("Altura " + t2.getAltura());
        
    }
}
