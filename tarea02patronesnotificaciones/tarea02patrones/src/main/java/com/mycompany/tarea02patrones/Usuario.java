package com.mycompany.tarea02patrones;


public class Usuario {
    private String idUsuario;
    private String nombre;

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
}