package com.mycompany.tarea02patrones;

interface IGestorDisponibilidad {
    boolean verificarDisponibilidad(String recurso);
    boolean bloquearRecurso(String recurso);
    void liberarRecurso(String recurso);
}