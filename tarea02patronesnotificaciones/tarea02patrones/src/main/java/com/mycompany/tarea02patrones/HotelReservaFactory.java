package com.mycompany.tarea02patrones;

public class HotelReservaFactory extends ReservaFactory {
    @Override
    public Reserva crearReserva(String detalles, double precio) {
        return new ReservaHotel(detalles, precio);
    }
}
