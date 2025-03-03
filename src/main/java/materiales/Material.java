package com.universidad.biblioteca.materiales;

/**
 * Clase abstracta que representa un material de la biblioteca.
 */
public abstract class Material {
    protected String titulo;
    protected String categoria;
    protected boolean disponible;

    /**
     * Constructor para inicializar un material.
     * @param titulo Título del material.
     * @param categoria Categoría del material.
     */
    public Material(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.disponible = true;
    }

    /**
     * Retorna el título del material.
     * @return Título del material.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna la categoría del material.
     * @return Categoría del material.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Indica si el material está disponible para préstamo.
     * @return true si está disponible, false en caso contrario.
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Marca el material como prestado.
     */
    public void prestar() {
        this.disponible = false;
    }

    /**
     * Marca el material como disponible.
     */
    public void devolver() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Material [titulo=" + titulo + ", categoria=" + categoria + ", disponible=" + disponible + "]";
    }
}

