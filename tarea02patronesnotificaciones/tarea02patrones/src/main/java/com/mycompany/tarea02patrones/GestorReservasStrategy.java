package com.mycompany.tarea02patrones;

public class GestorReservasStrategy {
    
private EstrategiaPrecio estrategiaPrecio;
private EstrategiaPolitica estrategiaPolitica;

    public void setEstrategiaPrecio(EstrategiaPrecio estrategia) {
        this.estrategiaPrecio = estrategia;
    }

    public void setEstrategiaPolitica(EstrategiaPolitica estrategia) {
        this.estrategiaPolitica = estrategia;
    }

    public double calcularPrecioFinal(double precioBase, double descuento) {
        if (estrategiaPrecio == null) {
            throw new IllegalStateException("Estrategia de precio no configurada.");
        }
        return estrategiaPrecio.calcularPrecio(precioBase, descuento);
    }

    public String aplicarPoliticaReserva(String detalles) {
        if (estrategiaPolitica == null) {
            throw new IllegalStateException("Estrategia de política no configurada.");
        }
        return estrategiaPolitica.aplicarPolitica(detalles);
    }
}