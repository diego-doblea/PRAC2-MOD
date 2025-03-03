package estado;

/**
 * Clase que representa el estado activo de un usuario.
 */
public class EstadoActivo implements Estado {
    @Override
    public boolean puedePedirPrestamo() {
        return true;
    }

    @Override
    public String toString() {
        return "Activo";
    }
}
