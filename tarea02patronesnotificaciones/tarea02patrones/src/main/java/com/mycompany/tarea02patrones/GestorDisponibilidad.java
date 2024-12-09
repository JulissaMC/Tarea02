package com.mycompany.tarea02patrones;
import java.util.HashMap;
import java.util.Map;

public class GestorDisponibilidad implements IGestorDisponibilidad {
    private static GestorDisponibilidad instancia;
    private Map<String, String> habitaciones;
    private Map<String, String> paseos;

    private GestorDisponibilidad() {
        habitaciones = new HashMap<>();
        paseos = new HashMap<>();
    }

    public static synchronized GestorDisponibilidad getInstancia() {
        if (instancia == null) {
            instancia = new GestorDisponibilidad();
        }
        return instancia;
    }

    @Override
    public boolean verificarDisponibilidad(String recurso) {
        return "disponible".equals(habitaciones.getOrDefault(recurso, "no disponible"));
    }

    @Override
    public boolean bloquearRecurso(String recurso) {
        if (verificarDisponibilidad(recurso)) {
            habitaciones.put(recurso, "reservado");
            return true;
        }
        return false;
    }

    @Override
    public void liberarRecurso(String recurso) {
        habitaciones.put(recurso, "disponible");
    }
}