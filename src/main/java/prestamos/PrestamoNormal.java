package prestamos;

import estado.Usuario;
import materiales.Material;

/**
 * Clase que representa un préstamo normal.
 * Permite un plazo inicial de 15 días y renovaciones de 5 días (hasta 3 veces).
 */
public class PrestamoNormal extends Prestamo {

    public PrestamoNormal(Usuario usuario, Material material) {
        super(usuario, material);
    }

    @Override
    protected int calcularPlazo() {
        // Plazo inicial de 15 días para préstamo normal.
        return 15;
    }

    @Override
    protected void realizarRenovacion() {
        // Aquí se simula la opción de renovación.
        // En una implementación interactiva, se podría preguntar al usuario si desea
        // renovar.
        System.out.println(
                "El préstamo normal permite renovaciones. Cada renovación añade 5 días (máximo 3 renovaciones).");
        // Lógica para gestionar renovaciones podría añadirse aquí.
    }
}
