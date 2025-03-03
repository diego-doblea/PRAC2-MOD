package catalogo.iteradores;

import java.util.Iterator;
import java.util.List;
import materiales.Libro;

public class IteradorLibros implements Iterator<Libro> {
    private List<Libro> libros;
    private int posicion;

    public IteradorLibros(List<Libro> libros) {
        this.libros = libros;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < libros.size();
    }

    @Override
    public Libro next() {
        return libros.get(posicion++);
    }
}
