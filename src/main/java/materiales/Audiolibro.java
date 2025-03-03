package materiales;

/**
 * Clase que representa un audiolibro.
 */
public class Audiolibro extends Material {

    /**
     * Constructor para un audiolibro.
     * 
     * @param titulo    Título del audiolibro.
     * @param categoria Categoría del audiolibro.
     */
    public Audiolibro(String titulo, String categoria) {
        super(titulo, categoria);
    }

    @Override
    public String toString() {
        return "Audiolibro [titulo=" + titulo + ", categoria=" + categoria + ", disponible=" + disponible + "]";
    }
}
