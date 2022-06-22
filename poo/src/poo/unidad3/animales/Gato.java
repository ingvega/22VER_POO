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
public class Gato extends Felino{
    private int vidas;

    public Gato(String nombre, String descripcion, int vidas){
        super(nombre,descripcion);
        this.vidas=vidas;
    }
    
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    public void hacerSonido(){
        System.out.println("Miau!!");
    }
    
    public String toString(){
        return "Gato " + super.toString() + " con "
                + getVidas() + " vidas";
    }
    
}
