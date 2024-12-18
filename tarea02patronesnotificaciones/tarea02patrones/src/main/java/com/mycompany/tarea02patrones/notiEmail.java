package com.mycompany.tarea02patrones;
class NotiEmail implements Notificacion {
   @Override
   public void enviarNotificacion(String destinatario, String mensaje) {
       System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
   }
}
