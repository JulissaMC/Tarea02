package com.mycompany.tarea02patrones;
class MensajeNotificacion implements ReservaListener {
    @Override
    public void actualizar(String tipoReserva, Object data) {
        System.out.println("Mensaje enviado: " + tipoReserva + " con datos: " + data);
    }
}
