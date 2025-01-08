package com.mycompany.tarea02patrones;

public class EstrategiaPoliticaI implements EstrategiaPolitica {
    @Override
    public String aplicarPolitica(String detalles) {
        return "Política actualizada: " + detalles;
    }
}