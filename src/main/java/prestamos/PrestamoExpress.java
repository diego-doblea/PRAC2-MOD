package prestamos;

import estado.Usuario;
import materiales.Material;

/**
 * Clase que representa un préstamo express.
 * Se otorga un plazo fijo de 7 días y no permite renovaciones.
 */
public class PrestamoExpress extends Prestamo {

    public PrestamoExpress(Usuario usuario, Material material) {
        super(usuario, material);
    }

    @Override
    protected int calcularPlazo() {
        // Plazo fijo de 7 días para préstamo express.
        return 7;
    }

    @Override
    protected void realizarRenovacion() {
        // No se permite renovación en préstamo express.
        System.out.println("El préstamo express no permite renovaciones.");
    }
}
