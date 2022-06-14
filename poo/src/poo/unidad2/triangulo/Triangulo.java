/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.triangulo;

/**
 *
 * @author paveg
 */
public class Triangulo {
    
    
    public Triangulo(){
        base=10;
        altura=1;
    }
    
    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        if(base>0){
            this.base=base;
        }else{
            System.err.println("La base debe ser mayor a cero");
        }
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        if(altura>0){
            this.altura=altura;
        }else{
            System.err.println("La altura debe ser mayor a cero");
        }
    }
    
    private double base=1;
    private double altura=1;    
}







