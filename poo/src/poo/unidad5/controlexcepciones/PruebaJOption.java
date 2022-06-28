/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad5.controlexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class PruebaJOption {

    static int denominador;
    static float resultado;
    static int numerador;

    public static void main(String[] args) {
        String respuesta;
//        try {

            do {
                try {
                    numerador = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingresa el numerador"));
                    denominador = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingresa el denominador"));

                    resultado = numerador * 1.0f / denominador;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El numerador y denominador deben ser valores numéricos",
                            "Uso de divisiones", JOptionPane.ERROR_MESSAGE);

                }
                JOptionPane.showMessageDialog(null, "El resultado es " + resultado,
                        "Uso de divisiones", JOptionPane.INFORMATION_MESSAGE);

                respuesta = JOptionPane.showInputDialog(
                        "¿Deseas ingresar más datos? Ingresa S para continuar",
                        "S");

            } while ("S".equals(respuesta));
//        } catch (Exception e) {            
//        }
    }
}
