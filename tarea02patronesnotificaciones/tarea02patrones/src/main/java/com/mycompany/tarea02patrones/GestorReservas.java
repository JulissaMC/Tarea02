package com.mycompany.tarea02patrones;
import java.util.ArrayList;
import java.util.List;
class GestorReservas {
    private List<ReservaListener> listeners = new ArrayList<>();

    public void subscribe(ReservaListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(ReservaListener listener) {
        listeners.remove(listener);
    }

    public void notify(String tipoReserva, Object data) {
        for (ReservaListener listener : listeners) {
            listener.actualizar(tipoReserva, data);
        }
    }
}
