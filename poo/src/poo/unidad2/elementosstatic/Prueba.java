/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.elementosstatic;

/**
 *
 * @author paveg
 */
public class Prueba {
    int x;
    
    public static void main(String[] args) {
        Prueba objPrueba=new Prueba();
        objPrueba.x=5;
        CA.dato="Hola";
        
        CA obj1=new CA();
        obj1.dato2=5;
        
        CA obj2=new CA();
        obj2.dato2=10;
        obj2.dato="Hola mundo";
        
        System.out.println(obj1.dato);
    }
}
