package catalogo.iteradores;

import java.util.Iterator;
import materiales.Revista;

public class IteradorRevistas implements Iterator<Revista> {
    private Revista[] revistas;
    private int contador; // número total de revistas agregadas
    private int posicion;

    public IteradorRevistas(Revista[] revistas, int contador) {
        this.revistas = revistas;
        this.contador = contador;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < contador;
    }

    @Override
    public Revista next() {
        return revistas[posicion++];
    }
}
