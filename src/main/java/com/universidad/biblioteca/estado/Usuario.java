package com.universidad.biblioteca.estado;

/**
 * Clase que representa a un usuario de la biblioteca.
 */
public class Usuario {
    private String nombre;
    private Estado estado;
    
    /**
     * Crea un usuario en estado activo por defecto.
     * @param nombre Nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.estado = new EstadoActivo();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    /**
     * Verifica si el usuario puede solicitar un préstamo.
     * @return true si puede pedir préstamo, false de lo contrario.
     */
    public boolean puedePedirPrestamo() {
        return estado.puedePedirPrestamo();
    }
    
    /**
     * Simula la solicitud de un préstamo.
     */
    public void solicitarPrestamo() {
        if (puedePedirPrestamo()) {
            System.out.println(nombre + " puede solicitar un préstamo.");
        } else {
            System.out.println(nombre + " no puede solicitar un préstamo, su estado es: " + estado.toString());
        }
    }
    
    /**
     * Simula que el usuario incumple la devolución, cambiando su estado a moroso.
     */
    public void incumplirDevolucion() {
        System.out.println(nombre + " incumplió la devolución y su estado cambia a moroso.");
        this.estado = new EstadoMoroso();
    }
    
    /**
     * Simula la devolución de material, restableciendo el estado a activo.
     */
    public void devolverMaterial() {
        System.out.println(nombre + " ha devuelto el material y su estado se actualiza a activo.");
        this.estado = new EstadoActivo();
    }
}

