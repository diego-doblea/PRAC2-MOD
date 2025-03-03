package estado;

/**
 * Interfaz que define el comportamiento de un estado de usuario.
 */
public interface Estado {
    /**
     * Indica si el usuario puede solicitar un préstamo.
     * 
     * @return true si puede pedir préstamo, false en caso contrario.
     */
    boolean puedePedirPrestamo();
}
