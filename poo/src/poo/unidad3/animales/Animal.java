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
public class Animal {
    private String nombre;
    private String descripcion;

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
}
