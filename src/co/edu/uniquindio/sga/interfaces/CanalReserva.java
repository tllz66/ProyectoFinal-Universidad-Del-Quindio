package co.edu.uniquindio.sga.interfaces;

import co.edu.uniquindio.sga.enums.TipoCanal;

public interface CanalReserva {

    boolean exigeAnticipo();

    long calcularComision(long valorEstancia);

    TipoCanal getTipo();
}