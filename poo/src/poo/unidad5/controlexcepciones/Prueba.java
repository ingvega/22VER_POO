/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad5.controlexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Prueba {
//Pedir datos
//    variable=JOptionPane.showInputDialog("Mensaje");
//Mandar un mensaje
//    JOptionPane.showMessageDialog(null,"Mensaje");
    
    
    static int denominador;
    static float resultado;
    static Integer numerador;

    public static void main(String[] args) {
        try {
            //Scanner lector = new Scanner(System.in);
            System.out.println("Ingresa el numerador");
            numerador = leerNumero();
            
            System.out.println("Ingresa el denominador");
            denominador = leerNumero();

            //resultado = (float)(numerador*1.0 / denominador);
            resultado = numerador*1.0f / denominador;
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Denominador no debe ser cero");
            
            //System.err.println(e.getMessage());

//        } catch (NullPointerException e) {
//            System.out.println("Error: El numerador debe tener un valor numérico");
//            //System.err.println(e.getMessage());            
//        } catch (InputMismatchException e) {
//            System.out.println("El numerador y denominador deben ser valores numéricos");
//            //System.err.println(e.getMessage());            
        }catch (Exception e){
            System.out.println(e.getMessage());
        
        }
        System.out.println("El resultado es " + resultado);
        /*
        try{
            //Instrucciones que son propensas a error
        }catch(TipoExcepcion1 variable){
            //Cómo reacciono al tipo de excepción 1 cuando ya ocurrió 
        }catch(TipoExcepcion2 variable){
            //Cómo reacciono al tipo de excepción 1 cuando ya ocurrió
        }finally{
            //Código que quiero ejecutar independientemente de
            //si hubo o no errores
        }*/

    }
    
    /**
     * Lee un entero y lo devuelve en el caso de ser correcto
     * @return 
     */
    static int leerNumero() throws Exception{
        
        //while(true){
            try{
                Scanner lector = new Scanner(System.in);
                return lector.nextInt();
            }
            catch(InputMismatchException ex){
                System.out.println("Valor no válido, ingresa el valor");
                //return 0;
                //throw ex;
                    throw new Exception("Valor no válido, ingresa el valor");
            }
            finally{
                System.out.println("Se intentó leer el dato");
            }
        //}
    }
}

//Verificar si hay excepciones y hacer algo independientemente del 
//resultado (no atrapo errores), pero sí puedo mandar mensajes
//o hacer algo en el finally
/*try{

}finally{

}

try{

}catch(){

}catch(){

}
*/






























