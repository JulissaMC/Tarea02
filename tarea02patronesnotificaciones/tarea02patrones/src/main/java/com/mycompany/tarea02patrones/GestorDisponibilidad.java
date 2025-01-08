package com.mycompany.tarea02patrones;
import java.util.HashMap;
import java.util.Map;

class GestorDisponibilidad implements IGestorDisponibilidad {
    private Map<String, String> recursos;

    private GestorDisponibilidad() {
        recursos = new HashMap<>();
    }


    @Override
    public boolean verificarDisponibilidad(String recurso) {
        return "disponible".equals(recursos.getOrDefault(recurso, "no disponible"));
    }

    @Override
    public boolean bloquearRecurso(String recurso) {
        if (verificarDisponibilidad(recurso)) {
            recursos.put(recurso, "reservado");
            return true;
        }
        return false;
    }

    @Override
    public void liberarRecurso(String recurso) {
        recursos.put(recurso, "disponible");
    }
}
