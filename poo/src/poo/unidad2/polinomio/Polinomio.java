/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.polinomio;

/**
 *
 * @author paveg
 */
public class Polinomio {
    private int coeficiente1;
    private int coeficiente2;
    private int coeficiente3;
    private int coeficiente4;

    public Polinomio() {
        coeficiente1=coeficiente2=coeficiente3=coeficiente4=1;
    }

    public Polinomio(int coeficiente1, int coeficiente2, int coeficiente3, int coeficiente4) {
        setCoeficiente1(coeficiente1);
        setCoeficiente2(coeficiente2);
        setCoeficiente3(coeficiente3);
        setCoeficiente4(coeficiente4);
    }

    public int getCoeficiente1() {
        return coeficiente1;
    }

    public void setCoeficiente1(int coeficiente1) {
        if(coeficiente1>=-1000 && coeficiente1<=1000){
            this.coeficiente1 = coeficiente1;
        }else{
            System.out.println("Coeficiente 1 no válido solo se aceptan "
                    + "valores entre -1000 y 1000");
        }
    }

    public int getCoeficiente2() {
        return coeficiente2;
    }

    public void setCoeficiente2(int coeficiente2) {
        if(coeficiente2>=-1000 && coeficiente2<=1000){
            this.coeficiente2 = coeficiente2;
        }else{
            System.out.println("Coeficiente 3 no válido solo se aceptan "
                    + "valores entre -1000 y 1000");
        }
    }

    public int getCoeficiente3() {
        return coeficiente3;
    }

    public void setCoeficiente3(int coeficiente3) {
        if(coeficiente3>=-1000 && coeficiente3<=1000){
            this.coeficiente3 = coeficiente3;
        }else{
            System.out.println("Coeficiente 3 no válido solo se aceptan "
                    + "valores entre -1000 y 1000");
        }
    }

    public int getCoeficiente4() {
        return coeficiente4;
    }

    public void setCoeficiente4(int coeficiente4) {
        if(coeficiente4>=-1000 && coeficiente4<=1000){
            this.coeficiente4 = coeficiente4;
        }else{
            System.out.println("Coeficiente 3 no válido solo se aceptan "
                    + "valores entre -1000 y 1000");
        }
    }
    
    public double calcularValor(int x){
        return coeficiente1*x*x*x + coeficiente2*x*x+coeficiente3*x+coeficiente4;
    }
}
