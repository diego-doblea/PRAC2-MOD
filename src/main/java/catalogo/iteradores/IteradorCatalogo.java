package catalogo.iteradores;

import java.util.Iterator;
import java.util.ArrayList;
import materiales.Material;
import materiales.Libro;
import materiales.Revista;
import materiales.Audiolibro;
import catalogo.Catalogo;

public class IteradorCatalogo implements Iterator<Material> {
    private ArrayList<Material> materiales;
    private int posicion;

    public IteradorCatalogo(Catalogo catalogo) {
        materiales = new ArrayList<>();

        // Agregar todos los libros
        for (Libro libro : catalogo.getLibros()) {
            materiales.add(libro);
        }

        // Agregar todas las revistas usando el contador
        Revista[] revistas = catalogo.getRevistas();
        int contador = catalogo.getContadorRevistas();
        for (int i = 0; i < contador; i++) {
            materiales.add(revistas[i]);
        }

        // Agregar todos los audiolibros
        for (Audiolibro audiolibro : catalogo.getAudiolibros().values()) {
            materiales.add(audiolibro);
        }
        posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < materiales.size();
    }

    @Override
    public Material next() {
        return materiales.get(posicion++);
    }
}
