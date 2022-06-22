/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.animales;

/**
 *
 * @author paveg
 */
public class Felino extends Animal{
    public Felino(String nombre, String descripcion){
        super(nombre,descripcion);
    }

    //Llamar la clase base con argumentos predeterminados
//    public Felino(){
//        super(null,null);
//    }
    
    @Override
    public void vagar(){
        System.out.println("Vagando como felino");
    }
}
