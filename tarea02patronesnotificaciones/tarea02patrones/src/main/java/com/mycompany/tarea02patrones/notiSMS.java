package com.mycompany.tarea02patrones;
class NotiSMS implements Notificacion {
    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
