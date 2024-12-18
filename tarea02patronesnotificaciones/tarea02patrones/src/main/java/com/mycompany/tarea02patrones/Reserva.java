package com.mycompany.tarea02patrones;

class Reserva {
    private GestorReservas gestorReservas;
    private String cambio;

    public Reserva() {
        this.gestorReservas = new GestorReservas();
    }

    public void realizarReserva(String detallesReserva) {
        System.out.println("Reserva realizada: " + detallesReserva);
        this.cambio = detallesReserva;
        gestorReservas.notify("ReservaConfirmada", detallesReserva);
    }

    public void cancelarReserva(String detallesReserva) {
        System.out.println("Reserva cancelada: " + detallesReserva);
        this.cambio = detallesReserva;
        gestorReservas.notify("ReservaCancelada", detallesReserva);
    }

    public GestorReservas getGestorReservas() {
        return gestorReservas;
    }

    public String getCambio() {
        return cambio;
    }
}
