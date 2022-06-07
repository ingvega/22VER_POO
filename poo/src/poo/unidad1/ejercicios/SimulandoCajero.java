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
public class SimulandoCajero {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String linea=lector.nextLine();
        /*R
        linea.equals("S") FALSE
                false!=true TRUE*/
        while(linea.equals("S")!=true){
            //Identificar qué operación es (C,R,D)
            if(linea.charAt(0)=='C'){
                //Imprimir
            }else{
                //R 1000
                //Obtener el número
                String numero="";
                for (int i = 2; i < linea.length(); i++) {
                    numero += linea.charAt(i);
                }
                int monto=Integer.parseInt(numero);
                System.out.println(monto);
                //Verificar si es D o R
            }
            //Leer la siguiente operación
            linea=lector.nextLine();
        }
        
        
    }
}
