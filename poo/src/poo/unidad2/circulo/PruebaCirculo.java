/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.circulo;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class PruebaCirculo {
    public static void main(String[] args) {
        //Verificar que se puede construir un circulo en el origen de 
        //tamaño 5
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingresa el radio");
        int r=lector.nextInt();
        Circulo c=new Circulo(r);
        System.out.println(c.datosCirculo());
        System.out.println("Área " + c.calculaArea());
        System.out.println("Ingres la nueva posición de X");
        c.mueveX(lector.nextInt());
        c.mueveY(-2);
        c.desplazarX(-8);
        c.desplazarY(3);
        c.aumentarRadio(-3);
        System.out.println(c.datosCirculo());
        Punto posicion=new Punto(3,3);
        Circulo c2=new Circulo(10,posicion);
        c2=new Circulo(10,new Punto(5,5));
        
    }
}
