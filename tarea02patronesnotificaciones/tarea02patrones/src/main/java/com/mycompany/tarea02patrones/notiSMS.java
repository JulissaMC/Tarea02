/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea02patrones;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class notiSMS implements notificacion {
   private Cliente cliente;
   private Reserva reserva;

    public notiSMS(Cliente cliente, Reserva reserva) {
        this.cliente = cliente;
        this.reserva = reserva;
    }
   
   public void enviarNotificacioncambio(Cliente cliente, Reserva reserva){
        System.out.println("Enviando correo a " + cliente.getNombre() + ": " + reserva.getCambio());
   }
}
