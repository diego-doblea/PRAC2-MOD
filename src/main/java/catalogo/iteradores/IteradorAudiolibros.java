package catalogo.iteradores;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import materiales.Audiolibro;

public class IteradorAudiolibros implements Iterator<Audiolibro> {
    private Iterator<Audiolibro> iterator;

    public IteradorAudiolibros(HashMap<String, Audiolibro> audiolibros) {
        Collection<Audiolibro> valores = audiolibros.values();
        this.iterator = valores.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Audiolibro next() {
        return iterator.next();
    }
}
