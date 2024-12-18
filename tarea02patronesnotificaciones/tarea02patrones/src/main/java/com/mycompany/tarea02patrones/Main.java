package com.mycompany.tarea02patrones;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        CorreoNotificacion correo = new CorreoNotificacion();
        MensajeNotificacion mensaje = new MensajeNotificacion();

        reserva.getGestorReservas().subscribe(correo);
        reserva.getGestorReservas().subscribe(mensaje);

        reserva.realizarReserva("Habitación doble, 2 noches");
        reserva.cancelarReserva("Habitación doble, 2 noches");
    }
}
