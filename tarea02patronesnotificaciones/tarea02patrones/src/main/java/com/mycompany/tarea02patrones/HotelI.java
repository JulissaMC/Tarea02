package com.mycompany.tarea02patrones;

public class HotelI extends ManejadorIncidente {
    @Override
    public void manejarIncidente(String tipo, String descripcion) {
        if (tipo.equalsIgnoreCase("hotel")) {
            System.out.println("Hotel: Resolviendo incidente - " + descripcion);
        } else if (siguiente != null) {
            siguiente.manejarIncidente(tipo, descripcion);
        } else {
            System.out.println("Incidente no pudo ser resuelto.");
        }
    }
}
