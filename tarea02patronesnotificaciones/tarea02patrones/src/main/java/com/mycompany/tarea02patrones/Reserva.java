package com.mycompany.tarea02patrones;

public class Reserva {
    private String idReserva;
    private Usuario usuario;
    private String detalles;
    private String estado;

    public Reserva(String idReserva, Usuario usuario, String detalles) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.detalles = detalles;
        this.estado = "pendiente";
    }

    public void confirmarReserva() {
        GestorDisponibilidad gestor = GestorDisponibilidad.getInstancia();
        if (gestor.bloquearRecurso(detalles)) {
            estado = "confirmada";
            Notificador.enviarNotificacion(usuario, "Reserva confirmada: " + detalles);
        }
    }

    public void cancelarReserva() {
        GestorDisponibilidad gestor = GestorDisponibilidad.getInstancia();
        gestor.liberarRecurso(detalles);
        estado = "cancelada";
        Notificador.enviarNotificacion(usuario, "Reserva cancelada: " + detalles);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}