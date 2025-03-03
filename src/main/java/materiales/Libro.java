package com.universidad.biblioteca.materiales;

/**
 * Clase que representa un libro.
 */
public class Libro extends Material {

    /**
     * Constructor para un libro.
     * @param titulo Título del libro.
     * @param categoria Categoría del libro.
     */
    public Libro(String titulo, String categoria) {
        super(titulo, categoria);
    }
    
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", categoria=" + categoria + ", disponible=" + disponible + "]";
    }
}

