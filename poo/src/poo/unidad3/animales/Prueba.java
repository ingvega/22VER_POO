/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.animales;

import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        ArrayList<Animal> animales=new ArrayList<Animal>();
        animales.add(new Gato());
        animales.add(new Perro());
        
        Gato g=(Gato) animales.get(0);
        Perro p=(Perro) animales.get(1);
        g.setNombre("Garffield");
        p.setNombre("Firulais");
        
        for (int i = 0; i < animales.size(); i++) {
            //El animal es un gato?
            if(animales.get(i) instanceof Gato){
                System.out.print(animales.get(i).getNombre());
                animales.get(i).hacerSonido();
            }else{
                System.out.print(animales.get(i).getNombre());
                animales.get(i).hacerSonido();
            }
        }
    }
}
