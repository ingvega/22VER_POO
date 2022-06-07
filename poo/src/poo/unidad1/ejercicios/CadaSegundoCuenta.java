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
public class CadaSegundoCuenta {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        //10 : 0 : 0
        int h1,h2,m1,m2,s1,s2;
//        h1=lector.nextInt();
//        lector.next();
//        m1=lector.nextInt();
//        lector.next();
//        s1=lector.nextInt();

        String hora1=lector.nextLine();
        String partes[]=hora1.split(" : ");
        
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
        
        h1=Integer.parseInt(partes[0]);
        
                
    }
}
