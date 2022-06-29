/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad6.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class Prueba {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String operacion = "";
        do {
            System.out.println("¿Qué deseas realizar? \n1 Agregar\n2 Listar todos\n3 Editar\n4 Salir");
            operacion = lector.nextLine();
            if (operacion.equals("1")) {
                System.out.println("Ingresa los datos del nuevo alumno");
                Alumno objAlumno=leerAlumno();
                //Escribir en el archivo el objeto leido
                escribirLinea("alumnos.poo", objAlumno.toString());

            } else if (operacion.equals("2")) {
                //Leer del archivo
                ArrayList<String> lineasArchivo = leerArchivo("alumnos.poo");
                ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
                System.out.println("El archivo contiene las siguientes líneas");
                System.out.println("--------------------------------------------------------------------");
                for (String linea : lineasArchivo) {
                    //Paso 1 Crear un alumno a partir de la línea leída del archivo
                    //Paso 2 Añadirlo a la lista de alumnos o simplemente imprimirlo
                    //Recuerda que puedes mandar imprimir cada dato del alumno o 
                    // crear un método que se encargue de generar la versión en cadena
                    // a imprimible del alumno
                }
                System.out.println("--------------------------------------------------------------------");
            }else if (operacion.equals("3")){
                //Leer todo el archivo y almacenarlo como una lista de alumnos
                ArrayList<String> lineasArchivo = leerArchivo("alumnos.poo");
                ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
                
                for (String linea : lineasArchivo) {
                    Alumno a = new Alumno(linea);
                    listaAlumnos.add(a);
                }
                
                //Solicitar los nuevos datos
                System.out.println("Ingresa los nuevos datos del alumno (NOTA: no cambiar el número de control)");
                Alumno datosNuevos=leerAlumno();
                
                //Ubicar la posición del alumno buscado en la lista de alumnos
                int pos=listaAlumnos.indexOf(datosNuevos);
                
                if(pos!=-1){
                    //Si el alumno existe, reemplazarlo en la lista con la nueva versión de sus datos
                    listaAlumnos.set(pos,datosNuevos);    
                    
                    //Reescribir toda la lista de alumnos en el archivo
                    reescribirArchivo("alumnos.poo",listaAlumnos);
                }else{
                    System.out.println("Alumno no encontrado");
                }
            }
        } while (!operacion.equals("4"));

    }

    static Alumno leerAlumno() {
        Scanner lector = new Scanner(System.in);
        Alumno objAlumno = new Alumno();
        while (true) {
            System.out.println("Indica el número de control");
            try {
                objAlumno.setNoControl(lector.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.println("Indica el nombre");
            try {
                objAlumno.setNombre(lector.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.println("Indica los apellidos");
            try {
                objAlumno.setApellidos(lector.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.println("Indica el semestre");
            try {
                objAlumno.setSemestre(Integer.parseInt(lector.nextLine()));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return objAlumno;
    }

    static void escribirLinea(String archivo, String linea) {
        BufferedWriter bufferEscritura = null;
        try {
            bufferEscritura = new BufferedWriter(
                    new FileWriter(archivo, true));
            bufferEscritura.write(linea);
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error al intentar abrir el archivo");
        } finally {
            try {
                bufferEscritura.close();
            } catch (Exception ex) {

            }
        }
    }

    static void reescribirArchivo(String archivo, ArrayList objetos) {
        BufferedWriter bufferEscritura = null;
        try {
            //Abrimos el archivo evitando que pasar el parámetro boolean para 
            //que se borre el contenido del archivo antes de comenzar a escribir
            bufferEscritura = new BufferedWriter(
                    new FileWriter(archivo));
            for (Object objeto : objetos) {
                bufferEscritura.write(objeto.toString());
            }
            
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error al intentar abrir el archivo");
        } finally {
            try {
                bufferEscritura.close();
            } catch (Exception ex) {

            }
        }
    }

    static ArrayList<String> leerArchivo(String archivo) {
        ArrayList<String> lineas = new ArrayList<String>();
        BufferedReader bufferLectura = null;
        try {
            bufferLectura = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = bufferLectura.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                bufferLectura.close();
            } catch (Exception ex) {

            }
        }

        return lineas;
    }
}
