package clases;

import java.util.List;

public class Carrera {
    private Integer distancia;
    private double premioEnDolares;
    private String nombre;
    private Integer cantidadVehiculosPermitidos;
    private List<Vehiculo> vehiculos;

    public Carrera(Integer distancia, double premioEnDolares, String nombre, Integer cantidadVehiculosPermitidos, List<Vehiculo> vehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        this.vehiculos = vehiculos;
    }
}
