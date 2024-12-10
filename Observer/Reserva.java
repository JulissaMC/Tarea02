public class Reserva{
    private GestorReservas gestorReservas;

    public Reserva(){
        this.gestorReservas = new GestorReservas();
    }

    public void realizarReserva(String detallesReserva){
        System.out.println("Reserva realizada: "+detallesReserva);
        
        gestorReservas.notify("ReservaConfirmadav", detallesReserva);
    }

    public void cancelarReserva(String detallesReserva){
        System.out.println("Reserva cancelada: "+detallesReserva);
        
        gestorReservas.notify("ReservaCancelada", detallesReserva);
    }

    public GestorReservas getGestorReservas(){
        return gestorReservas;
    }
}
