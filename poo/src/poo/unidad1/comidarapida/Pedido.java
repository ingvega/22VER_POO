/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.comidarapida;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class Pedido {
    private LocalDate fechaRegistro;
    private double totalAPagar;
    
    private Empleado empleado;
    private Cliente cliente;
    private DetallePedido[] listaDetalles;
}
