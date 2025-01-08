package com.mycompany.tarea02patrones;

public class ReservaPaseo extends Reserva {
    public ReservaPaseo(String detalles, double precio) {
        super(detalles, precio);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reserva de paseo: "+getDetalles()+" - Precio: $"+getPrecio());
    }
}

