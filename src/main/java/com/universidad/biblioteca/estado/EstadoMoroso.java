package com.universidad.biblioteca.estado;

/**
 * Clase que representa el estado moroso de un usuario.
 */
public class EstadoMoroso implements Estado {
    @Override
    public boolean puedePedirPrestamo() {
        return false;
    }
    
    @Override
    public String toString() {
        return "Moroso";
    }
}

