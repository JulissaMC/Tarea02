package com.mycompany.tarea02patrones;

class CentroDeNotifica {
    private Notificacion notifica;

    public void setNotificacion(Notificacion estrategia) {
        this.notifica = estrategia;
    }

    public void notificarCambios(String destinatario, String cambio) {
        if (cambio != null) {
            if (notifica == null) {
                throw new IllegalStateException("No se ha configurado una estrategia de notificación.");
            }
            notifica.enviarNotificacion(destinatario, cambio);
        }
    }
}
