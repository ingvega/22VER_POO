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
public abstract class Canino  extends Animal{
    
    public Canino(String nombre, String descripcion){
        super(nombre,descripcion);
    }
    @Override
    public void vagar(){
        System.out.println("Vagando como canino");
    }
    
}
