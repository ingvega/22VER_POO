/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.ejercicios;



/**
 *
 * @author paveg
 */
public class UsoEquals {
    public static void main(String[] args) {
        String nombre="Juan Perez",
                nombre2="JUAN PEREZ",
                nombre3="juan perez";
        System.out.println(nombre.equalsIgnoreCase(nombre2));
        System.out.println(nombre.equalsIgnoreCase(nombre3));
//        Scanner lector=new Scanner(System.in);
//        nombre=lector.nextLine();
//        System.out.println(nombre.toUpperCase());
//        System.out.println(nombre.toLowerCase());
        
        
    }
}
