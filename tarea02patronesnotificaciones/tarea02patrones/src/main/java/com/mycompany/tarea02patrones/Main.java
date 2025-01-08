package com.mycompany.tarea02patrones;


public class Main {
    public static void main(String[] args) {

        // Crear fábricas
        ReservaFactory hotelFactory = new HotelReservaFactory();
        ReservaFactory paseoFactory = new PaseoReservaFactory();

        Reserva hotelReserva = hotelFactory.crearReserva("Habitación doble, 2 noches", 200);
        Reserva paseoReserva = paseoFactory.crearReserva("Excursión a la montaña", 100);

        hotelReserva.mostrarDetalles();
        paseoReserva.mostrarDetalles();

        // Crear el gestor de reservas
        GestorReservas gestorR = new GestorReservas();

        // Suscribirse a las notificaciones
        gestorR.subscribe(new CorreoNotificacion());
        gestorR.subscribe(new MensajeNotificacion());

        // Crear una reserva
        Reserva nuevaReserva = hotelFactory.crearReserva("Habitación suite, 3 noches", 300);

        // Notificar a los observadores
        gestorR.notify("NuevaReserva", nuevaReserva.getDetalles());

        
        GestorReservasStrategy gestor = new GestorReservasStrategy();
 
        gestor.setEstrategiaPrecio(new EstrategiaPrecioI());
        double precioFinal = gestor.calcularPrecioFinal(200, 10); // 10% de descuento
        System.out.println("Precio final con descuento: " + precioFinal);

        precioFinal = gestor.calcularPrecioFinal(200, 0); // Sin descuento
        System.out.println("Precio final sin descuento: " + precioFinal);

        // Configurar política genérica
        gestor.setEstrategiaPolitica(new EstrategiaPoliticaI());
        String resultadoPolitica = gestor.aplicarPoliticaReserva("Cancelación permitida hasta 24 horas antes");
        System.out.println(resultadoPolitica);

        resultadoPolitica = gestor.aplicarPoliticaReserva("No se permite cancelación");
        System.out.println(resultadoPolitica);



               // Crear reservas individuales
               ReservaHotel hotel1 = new ReservaHotel("Habitación doble, 2 noches", 200);
               ReservaPaseo paseo1 = new ReservaPaseo("Excursión a la montaña", 50);
               ReservaPaseo paseo2 = new ReservaPaseo("Tour cultural", 30);
       
               // Crear paquete compuesto
               PaqueteComposite paquete1 = new PaqueteComposite("Paquete Aventura");
               paquete1.agregarComponente(hotel1);
               paquete1.agregarComponente(paseo1);
               paquete1.agregarComponente(paseo2);
       
               // Mostrar detalles y precio del paquete
               paquete1.mostrarDetalles();
               System.out.println("Precio total del paquete: $" + paquete1.calcularPrecio());
       
               // Crear super paquete con paquetes dentro
               PaqueteComposite superPaquete = new PaqueteComposite("Super Paquete Vacacional");
               superPaquete.agregarComponente(paquete1);
               superPaquete.agregarComponente(new ReservaHotel("Habitación suite, 3 noches", 500));
       
               // Mostrar detalles y precio del super paquete
               superPaquete.mostrarDetalles();
               System.out.println("Precio total del super paquete: $" + superPaquete.calcularPrecio());


        // Crear el gestor de incidentes
        GestorIncidentes gestorIncidentes = new GestorIncidentes();

        // Procesar diferentes tipos de incidentes
        gestorIncidentes.procesarIncidente("soporte", "Problema con el inicio de sesión.");
        gestorIncidentes.procesarIncidente("hotel", "Habitación no está limpia.");
        gestorIncidentes.procesarIncidente("operador", "El guía turístico no llegó a tiempo.");
        gestorIncidentes.procesarIncidente("desconocido", "Problema no identificado.");
    }

}

