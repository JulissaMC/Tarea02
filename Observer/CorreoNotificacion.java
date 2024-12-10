public class CorreoNotificacion implements ReservaListener{
    @Override
    public void actualizar(String tipoReserva, Object data){
        System.out.println("Correo enviado:"+tipoReserva+"con datos:"+data);
    }
}
