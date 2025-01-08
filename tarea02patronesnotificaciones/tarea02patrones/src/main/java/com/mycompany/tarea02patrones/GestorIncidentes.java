package com.mycompany.tarea02patrones;

public class GestorIncidentes {
    private ManejadorIncidente manejadorInicial;

    public GestorIncidentes() {
        SoporteI soporte = new SoporteI();
        HotelI hotel = new HotelI();
        OperadorI operador = new OperadorI();

        soporte.setSiguiente(hotel);
        hotel.setSiguiente(operador);

        this.manejadorInicial = soporte;
    }

    public void procesarIncidente(String tipo, String descripcion) {
        manejadorInicial.manejarIncidente(tipo, descripcion);
    }
}
