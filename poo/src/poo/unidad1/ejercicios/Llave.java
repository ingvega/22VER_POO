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
public class Llave {
    public static void main(String[] args) {
        String a,b;
        Scanner lector=new Scanner(System.in);
        a=lector.nextLine();
        b=lector.nextLine();
        
        b=b.replace(".","x").replace("#",".").replace("x","#");
//        b=b.replace(".","x");
//        b=b.replace("#",".");
//        b=b.replace("x","#");
        if(a.equals(b)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
