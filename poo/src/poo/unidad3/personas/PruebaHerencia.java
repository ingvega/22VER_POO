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
        p.setNombre("J");
        p.setApellidos("Dominguez");
        
        Alumno a=new Alumno();
        a.setNombre("Jose56789012345678901234567890123");
        a.setApellidos("Dominguez");
        a.setSemestre(1);
        
        Docente d=new Docente();
        d.setNombre("Jose");
        d.setApellidos("Dominguez");
        d.setFechaIngreso(LocalDate.now().minusDays(5));
                
        
    }
}
