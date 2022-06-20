/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.personas;

/**
 *
 * @author paveg
 */
public class Utilerias {

    /**
     * Elimina espacios duplicados, además de espacios a los extremos
     *
     * @param cadena Texto que se va a limpiar de espacios
     * @return Cuando la cadena no es null genera una nueva cadena sin espacios
     * a los extremos y con un espacio entre cada palabra que el texto contenga
     * Cuando la cadena es null, devuelve null
     */
    public static String limpiarEspacios(String cadena) {
        if (cadena == null) {
            return null;
        } else {
            String nuevaCadena = "";
            //"    Maria   Soledad Karina "
            //String palabras[] = cadena.split(" ");
            String palabras[] = cadena.split("\\s+");
            //["Maria","Soledad","Karina"]
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].length() > 0) {
                    nuevaCadena += palabras[i] + " ";
                }
            }
            return nuevaCadena.trim();
        }
    }

}
