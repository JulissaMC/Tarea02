package com.mycompany.tarea02patrones;

public class Notificador {
    public static void enviarNotificacion(Usuario destinatario, String mensaje) {
        destinatario.recibirNotificacion(mensaje);
    }
}