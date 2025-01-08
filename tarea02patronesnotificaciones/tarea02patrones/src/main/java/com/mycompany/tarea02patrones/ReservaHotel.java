package com.mycompany.tarea02patrones;

public class ReservaHotel extends Reserva {
    public ReservaHotel(String detalles, double precio) {
        super(detalles, precio);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reserva de hotel: "+getDetalles()+" - Precio: $"+getPrecio());
    }

}
