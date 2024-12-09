/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea02patrones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class CentroDeNotifica {
    private notificacion notifica;
    public void setnotificacion(notificacion estrategia) {
        this.notifica = estrategia;
    }
    // se asume que el cliente se puede identificar solo con su nombre
    // Enviar la notificación usando la estrategia configurada
    public void notificarCambios(Cliente cliente, Reserva reserva) {
        if(reserva.getCambio()!= null){
            if (notifica == null) {
                throw new IllegalStateException("No se ha configurado una estrategia de notificación.");
            }
            notifica.enviarNotificacion(cliente.getNombre(), reserva.getCambio());//asumimos que hay una funcion cambio que calcule cualquier cambio hecho
        //a una reserva
        }
    }
}


