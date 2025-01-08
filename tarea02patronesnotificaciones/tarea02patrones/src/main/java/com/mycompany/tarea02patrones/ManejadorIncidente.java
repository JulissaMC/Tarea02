package com.mycompany.tarea02patrones;

public abstract class ManejadorIncidente {
    protected ManejadorIncidente siguiente;

    public void setSiguiente(ManejadorIncidente siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarIncidente(String tipo, String descripcion);
}
