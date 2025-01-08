package com.mycompany.tarea02patrones;

public class OperadorI extends ManejadorIncidente {
    @Override
    public void manejarIncidente(String tipo, String descripcion) {
        if (tipo.equalsIgnoreCase("operador")) {
            System.out.println("Operador turístico: Resolviendo incidente - " + descripcion);
        } else if (siguiente != null) {
            siguiente.manejarIncidente(tipo, descripcion);
        } else {
            System.out.println("Incidente no pudo ser resuelto.");
        }
    }
}
