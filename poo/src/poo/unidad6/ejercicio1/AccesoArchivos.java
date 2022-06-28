/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad6.ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class AccesoArchivos {

    public static void main(String[] args) /*throws FileNotFoundException*/ {
        Scanner lector = null;
        File archivo = new File("C:\\archivospoo\\alumnos.txt");
        try {
            //Leer el contenido de un archivo
            lector = new Scanner(archivo);
            String linea;
            while (true) {
                linea = lector.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe " + ex.getMessage());
        } catch (NoSuchElementException ex) {

        } finally {
            if (lector != null) {
                lector.close();
            }
        }

        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(
                    new FileWriter(archivo));
            escritor.write("Andres");

        } catch (IOException ex) {
            Logger.getLogger(AccesoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(AccesoArchivos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
