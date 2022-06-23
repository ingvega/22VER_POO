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
        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(new Gato("Garffield", "naranja que le gusta la lasagna", 7));
        animales.add(new Perro("Firulais", "amarillo con negro"));
        animales.add(new Gato("Don gato", "amarillo y tiene su propia pandilla", 10));
        animales.add(new Hipopotamo("Motomoto", "Gigante y morado-cafe"));
        animales.add(new Leon("Mufasa", "El rey"));

//        Gato g=(Gato) animales.get(0);
//        Perro p=(Perro) animales.get(1);
//        g.setNombre("Garffield");
//        p.setNombre("Firulais");
        //Es exactamente un Felino
        if (animales.get(0).getClass() == Felino.class) {
            System.out.println("Si es un gato");
        }

        //Buscar al animal llamado Mufasa
        Animal a = new Leon("MUFASA","");
        //Animal a = animales.get(0);
        System.out.println("Resultado contains " + animales.contains(a));
        animales.remove(a);
        
        for (int i = 0; i < animales.size(); i++) {
            //Asumir que el toString no está implementado temporalmente
            //System.out.println(animales.get(i));

            //El animal tiene en su jerarquía de herencia a un felino?
            if (animales.get(i) instanceof Gato) {
                System.out.print("Gato " + animales.get(i).getNombre()
                        + " y tiene " + ((Gato) animales.get(i)).getVidas() + " vidas ");
            } else if (animales.get(i) instanceof Felino) {
                System.out.print("Felino amorfo " + animales.get(i).getNombre());
            } else {
                System.out.print(animales.get(i).getNombre() + " ");
            }
            animales.get(i).hacerSonido();
        }

        
        
//        for (int i = 0; i < animales.size(); i++) {
//            if (animales.get(i).equals(a)) {
//                System.out.println("Encontrado");
//                return;
//            }
//        }
//        System.out.println("No encontrado");
//            if(animales.get(i).getNombre().equalsIgnoreCase("mUFASA")){
//                System.out.println("Encontrado");
//                break;
//            }

    }
}
