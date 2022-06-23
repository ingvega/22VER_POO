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
public class Hipopotamo extends Animal {
    
    public Hipopotamo(){
        //super("","");
        this("","");
    }
    
    public Hipopotamo(String nombre, String descripcion){
        super(nombre,descripcion);
    }
    public void hacerSonido(){
        System.out.println("Sonido del hipopótamo");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo sandías");
    }
}
