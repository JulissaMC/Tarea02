package com.mycompany.tarea02patrones;

public class EstrategiaPrecioI implements EstrategiaPrecio {
    @Override
    public double calcularPrecio(double precioBase, double descuento) {
        return precioBase - (precioBase * descuento / 100);
    }
}