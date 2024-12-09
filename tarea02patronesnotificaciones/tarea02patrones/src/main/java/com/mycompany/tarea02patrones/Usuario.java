package com.mycompany.tarea02patrones;

public class Usuario {
    private String idUsuario;
    private String nombre;

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public void realizarReserva(Reserva reserva) {
        reserva.confirmarReserva();
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }
}