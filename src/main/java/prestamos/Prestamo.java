package prestamos;

import estado.Usuario;
import materiales.Material;

/**
 * Clase abstracta que define el proceso de un préstamo mediante el patrón
 * Template.
 */
public abstract class Prestamo {
    protected Usuario usuario;
    protected Material material;
    protected int diasPrestamo;

    public Prestamo(Usuario usuario, Material material) {
        this.usuario = usuario;
        this.material = material;
    }

    /**
     * Método plantilla para procesar el préstamo.
     * Valida al usuario y la disponibilidad del material, calcula el plazo,
     * marca el material como prestado y ofrece la opción de renovación.
     */
    public final void procesarPrestamo() {
        // Validar que el usuario pueda pedir préstamo
        if (!usuario.puedePedirPrestamo()) {
            System.out.println("El usuario " + usuario.getNombre() + " no puede solicitar préstamos. Estado: "
                    + usuario.getEstado());
            return;
        }
        // Validar disponibilidad del material
        if (!material.isDisponible()) {
            System.out.println("El material " + material.getTitulo() + " no está disponible para préstamo.");
            return;
        }
        // Calcular el plazo del préstamo según la modalidad
        diasPrestamo = calcularPlazo();
        // Marcar el material como prestado
        material.prestar();
        System.out.println("Préstamo procesado: " + usuario.getNombre() + " ha tomado " + material.getTitulo() + " por "
                + diasPrestamo + " días.");
        // Ofrecer la opción de renovación si aplica
        realizarRenovacion();
    }

    /**
     * Método abstracto que calcula el plazo del préstamo.
     * 
     * @return Número de días para el préstamo.
     */
    protected abstract int calcularPlazo();

    /**
     * Método hook para la renovación del préstamo.
     * Por defecto, no se realiza ninguna renovación.
     * Puede ser sobrescrito por las subclases.
     */
    protected void realizarRenovacion() {
        // Por defecto, no se realiza renovación.
    }
}
