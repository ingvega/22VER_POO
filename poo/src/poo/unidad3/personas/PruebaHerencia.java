/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad3.personas;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class PruebaHerencia {
    public static void main(String[] args) {
        Persona p=new Persona();
        p.setNombre("     Maria      Soledad     Karina     ");
        p.setApellidos("Dominguez");
        
        Alumno a=new Alumno();
        a.setNombre("Jose56789012345678901234567890123");
        a.setApellidos("Dominguez");
        a.setTelefono("1234567890");
        a.setSemestre(1);
        
        Docente d=new Docente();
        d.setNombre("Jose");
        d.setApellidos("Dominguez");
        d.setFechaIngreso(LocalDate.now().minusDays(5));
                
        
    }
}
