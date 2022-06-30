/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad6.ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class AlmacenamientoIndividual {
    public static void main(String[] args) {
        ObjectOutputStream oos=null;
        ObjectInputStream ois=null;
        try {
            Alumno a=new Alumno("S21120001","Antonio","Perez Martinez",2);
            Alumno b=new Alumno("G19120020","Alberto","Sánchez Hernández",5);
            Alumno c=new Alumno("E18120034","Elia","Jimenez Moreno",9);
            Alumno d=new Alumno("D22120022","Joselin","Arroyo Lozano",1);
            
            oos = new ObjectOutputStream(new FileOutputStream("alumnos3.poo"));
            
            oos.writeObject(a);
            oos.writeObject(b);
            oos.writeObject(c);
            oos.writeObject(d);
            
            oos.close();
            
            ois=new ObjectInputStream(new FileInputStream("alumnos3.poo"));
            ArrayList<Alumno> alumnos= new ArrayList<Alumno>();
            alumnos.add((Alumno) ois.readObject());
            alumnos.add((Alumno) ois.readObject());
            alumnos.add((Alumno) ois.readObject());
            alumnos.add((Alumno) ois.readObject());
            
            for (Alumno alumno : alumnos) {
                System.out.println(alumno.convierteCadena());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlmacenamientoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlmacenamientoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlmacenamientoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                ois.close();
            } catch (Exception ex) {
                Logger.getLogger(AlmacenamientoIndividual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
