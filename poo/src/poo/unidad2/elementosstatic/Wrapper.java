/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.elementosstatic;

import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class Wrapper {
    public static void main(String[] args) {
        Wrapper miObjeto=new Wrapper();
        Wrapper miObjeto2=new Wrapper();
        JOptionPane.showMessageDialog(null,miObjeto +"\n"+ miObjeto2);
        
        int valor=6;
        String cadena;
        
        cadena=JOptionPane.showInputDialog("Indica tu edad");
        if(cadena==null){
            JOptionPane.showMessageDialog(null,"No has ingresado la edad");
            return;
            //cadena="0";
        }
        valor=Integer.parseInt(cadena);
        
        Integer edad=Integer.parseInt(cadena);
        Double peso=new Double("59.76");
        
        JOptionPane.showMessageDialog(null,peso);
        if(edad<18){
            JOptionPane.showMessageDialog(null,"Debes acudir con tu tutor a realizar los trámites");
        }
    }
}
