package com.mycompany.tarea02patrones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase Usuario
public class Usuario {
    private String idUsuario;
    private String nombre;

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public void realizarReserva(Reserva reserva) {
        reserva.realizarReserva("Detalles de la reserva para " + nombre);
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}