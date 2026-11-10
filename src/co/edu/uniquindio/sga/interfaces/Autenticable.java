package co.edu.uniquindio.sga.interfaces;

import co.edu.uniquindio.sga.enums.Rol;

public interface Autenticable {

    boolean autenticar(String usuario, String contrasena);

    Rol getRol();
}