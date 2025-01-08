package com.mycompany.tarea02patrones;

import java.util.ArrayList;
import java.util.List;

public class PaqueteComposite extends ComponentePaquete {
    private List<ComponentePaquete> componentes = new ArrayList<>();
    private String nombre;

    public PaqueteComposite(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(ComponentePaquete componente) {
        componentes.add(componente);
    }

    public void eliminarComponente(ComponentePaquete componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Paquete: " + nombre);
        for (ComponentePaquete componente : componentes) {
            componente.mostrarDetalles();
        }
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (ComponentePaquete componente : componentes) {
            total += componente.calcularPrecio();
        }
        return total;
    }
}
