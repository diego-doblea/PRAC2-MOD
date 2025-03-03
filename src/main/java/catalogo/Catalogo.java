package catalogo;

import java.util.ArrayList;
import java.util.HashMap;
import materiales.Libro;
import materiales.Revista;
import materiales.Audiolibro;
import materiales.Material;

/**
 * Clase que representa el catálogo de materiales de la biblioteca.
 * Gestiona libros (en una lista), revistas (en un arreglo) y audiolibros (en
 * una tabla hash).
 */
public class Catalogo {
    private ArrayList<Libro> libros;
    private Revista[] revistas;
    private int contadorRevistas;
    private HashMap<String, Audiolibro> audiolibros;

    // Tamaño máximo para el arreglo de revistas
    private static final int MAX_REVISTAS = 100;

    /**
     * Constructor que inicializa las estructuras de datos para cada tipo de
     * material.
     */
    public Catalogo() {
        libros = new ArrayList<>();
        revistas = new Revista[MAX_REVISTAS];
        contadorRevistas = 0;
        audiolibros = new HashMap<>();
    }

    /**
     * Agrega un libro al catálogo.
     * 
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Agrega una revista al catálogo.
     * Si se supera el tamaño máximo del arreglo, se notifica que no se pueden
     * agregar más revistas.
     * 
     * @param revista La revista a agregar.
     */
    public void agregarRevista(Revista revista) {
        if (contadorRevistas < MAX_REVISTAS) {
            revistas[contadorRevistas++] = revista;
        } else {
            System.out.println("No se pueden agregar más revistas.");
        }
    }

    /**
     * Agrega un audiolibro al catálogo.
     * Se utiliza el título como clave en la tabla hash.
     * 
     * @param audiolibro El audiolibro a agregar.
     */
    public void agregarAudiolibro(Audiolibro audiolibro) {
        audiolibros.put(audiolibro.getTitulo(), audiolibro);
    }

    /**
     * Busca un material en el catálogo por su título.
     * Se realiza la búsqueda en libros, revistas y audiolibros.
     * 
     * @param titulo El título del material a buscar.
     * @return El material encontrado o null si no se halla.
     */
    public Material buscarPorTitulo(String titulo) {
        // Buscar en libros
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        // Buscar en revistas
        for (int i = 0; i < contadorRevistas; i++) {
            if (revistas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return revistas[i];
            }
        }
        // Buscar en audiolibros
        if (audiolibros.containsKey(titulo)) {
            return audiolibros.get(titulo);
        }
        return null;
    }

    // Métodos get para acceder a las colecciones desde los iteradores
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public Revista[] getRevistas() {
        return revistas;
    }

    public int getContadorRevistas() {
        return contadorRevistas;
    }

    public HashMap<String, Audiolibro> getAudiolibros() {
        return audiolibros;
    }
}
