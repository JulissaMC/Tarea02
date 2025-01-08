package com.mycompany.tarea02patrones;

public class Reserva extends ComponentePaquete {
    private String detalles;
    private double precio;

    public Reserva(String detalles, double precio) {
        this.detalles = detalles;
        this.precio = precio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reserva: "+detalles+" - Precio: $"+precio);
    }
}
