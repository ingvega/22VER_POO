/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oup;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class MaidCafe {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String texto=lector.nextLine();
        int posiciones=Integer.parseInt(lector.nextLine());
        int pos;
        String alfabeto="abcdefghijklmnopqrstuvwxyz 0123456789";
        for (int i = 0; i < texto.length(); i++) {
            char c=texto.charAt(i);
            //La posición donde se ubica el caracter recorrido lo que marca posiciones
            pos=alfabeto.indexOf(c)-posiciones;
            //System.out.println(pos);
            if(pos>=0){
                System.out.print(alfabeto.charAt(pos));
            }else{
                System.out.print(alfabeto.charAt(alfabeto.length()+pos));
            }
        }
        
    }
}
