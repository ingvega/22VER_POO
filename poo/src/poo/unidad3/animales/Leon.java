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
public class Leon extends Felino {
    public Leon(String nombre, String descripcion){
        super(nombre,descripcion);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Grrrr");
    }
    
    @Override
    public void comer() {
        System.out.println("Estoy comiendo atún");
    }
    
    public String toString(){
        return "Leon " + super.toString();
    }
}
