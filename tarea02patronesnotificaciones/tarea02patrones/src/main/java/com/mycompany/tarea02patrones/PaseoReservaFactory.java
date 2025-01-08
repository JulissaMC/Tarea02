package com.mycompany.tarea02patrones;

public class PaseoReservaFactory extends ReservaFactory {
    @Override
    public Reserva crearReserva(String detalles, double precio) {
        return new ReservaPaseo(detalles, precio);
    }
}
