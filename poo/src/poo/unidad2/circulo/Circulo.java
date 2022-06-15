/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.circulo;

/**
 *
 * @author paveg
 */
public class Circulo {
    private int radio;
    public Punto centro=new Punto(0,0);
    //Inicializar solo se permite en la misma línea
    //centro=new Punto(0,0);
    
    public Circulo(int radio) {
        if(radio>0)
            this.radio = radio;
        else{
            this.radio=1;
            System.out.println("El valor " + radio + " no se puede asignar como "
                    + "radio, se creó un círculo de radio 1");
        }
        //No necesaria por la inicialización hecha en el atributo centro
        //centro=new Punto(0,0);
    }

    public Circulo(int radio, Punto centro) {
        //Manda llamar el constructor que recibe el radio
        //Debe ser la primera línea del constructor
        this(radio);
        this.centro = centro;
    }
    
    public double calculaArea(){
        return Math.PI*radio*radio;
    }
    
    public void aumentarRadio(){
        radio++;
    }
    
    public void aumentarRadio(int incremento){
        if(/*incremento>0 || */radio+incremento>0){
            radio+=incremento;
        }
    }
    
    public String datosCirculo(){
        String datos="Círculo con posición: "
                + "("+ centro.getX() +", "+centro.getY() +"). "
                + "Radio: " + radio;
        return datos;
    }
    
    
    public void mueveX(int x){
        centro.setX(x);
    }
    
    public void mueveY(int y){
        centro.setY(y);
    }
    
    public void desplazarX(int cantidad){
        int nuevaX=centro.getX()+cantidad;
        centro.setX(nuevaX);
    }
    
    public void desplazarY(int cantidad){
        centro.setY(centro.getY()+cantidad);
    }
    
}
