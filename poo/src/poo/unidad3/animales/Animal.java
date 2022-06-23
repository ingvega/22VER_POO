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
public abstract class Animal {
    private String nombre;
    private String descripcion;

//    public Animal(){
//    }
    public Animal(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public abstract void comer();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void vagar(){
        System.out.println("Vagando como cualquier animal");
    }    
    
    public void hacerSonido(){
        System.out.println("Sonido genérico de animal");
    }
    
    @Override
    public String toString(){
        return "llamado " + getNombre() + " ("+ getDescripcion() +")";
    }
    
//    @Override
//    public boolean equals(Object animal){
//        //Preguntar si es el mismo (memoria)
//        if(animal==this){
//            return true;
//        }
//        //Preguntar si es un animal
//        if(animal instanceof Animal){
//            //Extraer el animal que viene como object
//            Animal otroAnimal=(Animal)animal;
//            //Preguntar si tienen el mismo nombre
//            if(this.getNombre().equalsIgnoreCase(
//                    otroAnimal.getNombre())){
//                return true;
//            }else{
//                return false;
//            }
//        }else{
//            return false;
//        }
//    }
}
