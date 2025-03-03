package com.universidad.biblioteca.materiales;

/**
 * Clase que representa una revista.
 */
public class Revista extends Material {

    /**
     * Constructor para una revista.
     * @param titulo Título de la revista.
     * @param categoria Categoría de la revista.
     */
    public Revista(String titulo, String categoria) {
        super(titulo, categoria);
    }
    
    @Override
    public String toString() {
        return "Revista [titulo=" + titulo + ", categoria=" + categoria + ", disponible=" + disponible + "]";
    }
}

