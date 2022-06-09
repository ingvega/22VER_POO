package poo.unidad1.rentavehiculos;

import java.time.LocalDate;

public class Renta {
    private LocalDate fecha;
    private float costoTotal;
    
    public DetalleRenta[] detallesRentas;
    public Sucursal sucursal;
    public Agente agente;
    public Cliente cliente;
}