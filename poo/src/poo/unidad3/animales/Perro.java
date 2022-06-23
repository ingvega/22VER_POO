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

public class Perro extends Canino {
    public Perro(String nombre, String descripcion){
        super(nombre,descripcion);
    }
    public void hacerSonido(){
        System.out.println("Guau!! Guau!!");
    }
    
    @Override
    public void comer() {
        System.out.println("Estoy comiendo croquetas");
    }
    
    @Override
    public String toString(){
        return "Perro " + super.toString();
    }
}
