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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class AlmacenamientoLista {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String operacion = "";
        do {
            System.out.println("¿Qué deseas realizar? \n1 Agregar\n2 Listar todos\n3 Editar\n4 Salir");
            operacion = lector.nextLine();
            if (operacion.equals("1")) {
                System.out.println("Ingresa los datos del nuevo alumno");
                Alumno objAlumno = pedirDatosAlumno();
                //Escribir en el archivo el objeto leido
                ArrayList<Alumno> lista = leerArchivo("alumnos2.poo");
                lista.add(objAlumno);
                escribirArchivo("alumnos2.poo", lista);

            } else if (operacion.equals("2")) {
                //Leer del archivo
                ArrayList<Alumno> objetos = leerArchivo("alumnos2.poo");
                System.out.println("El archivo contiene las siguientes líneas");
                System.out.println("--------------------------------------------------------------------");
                for (Alumno objeto : objetos) {
                    System.out.println(objeto.convierteCadena());
                }
                System.out.println("--------------------------------------------------------------------");
            } else if (operacion.equals("3")) {
                //Leer todo el archivo y almacenarlo como una lista de alumnos
                ArrayList<Alumno> listaAlumnos = leerArchivo("alumnos2.poo");

                //Solicitar los nuevos datos
                System.out.println("Ingresa los nuevos datos del alumno (NOTA: no cambiar el número de control)");
                Alumno objAlumnoActualizado = pedirDatosAlumno();

                //Ubicar la posición del alumno buscado en la lista de alumnos
                int pos = listaAlumnos.indexOf(objAlumnoActualizado);

                if (pos != -1) {
                    //Si el alumno existe, reemplazarlo en la lista con la nueva versión de sus datos
                    listaAlumnos.set(pos, objAlumnoActualizado);
                    escribirArchivo("alumnos2.poo", listaAlumnos);
                    System.out.println("Alumno modificado exitosamente");
                } else {
                    System.out.println("Alumno no encontrado");
                }
            }
        } while (!operacion.equals("4"));

    }

    static Alumno pedirDatosAlumno() {
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

    static void escribirArchivo(String archivo, ArrayList lista) {
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(
                    new FileOutputStream(archivo));

            escritor.writeObject(lista);

        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error al intentar abrir el archivo");
        } finally {
            try {
                escritor.close();
            } catch (Exception ex) {

            }
        }
    }

    static ArrayList leerArchivo(String archivo) {
        ArrayList objetos = new ArrayList();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(archivo));
            objetos = (ArrayList) lector.readObject();
            if (objetos == null) {
                return new ArrayList();
            } else {
                return objetos;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error con el formato del archivo");
        } finally {
            try {
                lector.close();
            } catch (Exception ex) {

            }
        }
        return objetos;
    }

}
