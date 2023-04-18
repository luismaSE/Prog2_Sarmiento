package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica <T extends Comparable <T> > {

    private List <T> lista;

    public ListaGenerica() {
        lista = new ArrayList<>();
    }

    // Metodos
    //1
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    //2
    public List<T> devolverLista() {
        return lista;
    }

    //3
    public int cantidadElementos() {
        return lista.size();
    }

    //4
    public void agregarPrincipio(T elemento) {
        lista.add(0, elemento);
    }

    //5
    public void ordenar() {
        Collections.sort(lista);
    }

    //6
    public void desordenar() {
        Collections.shuffle(lista);
    }

    //7
    public void agregarConIndice(int indice, T elemento) {
        if ( indice > lista.size())
            {throw new IndexOutOfBoundsException("El Indice ingresado esta fuera de la lista, no se puede agregar el elemento");}
        else
            {lista.add(indice, elemento);}
    }

    //8
    public T obtenerConIndice(int indice) {
        if ( indice >= lista.size())
            {throw new IndexOutOfBoundsException("El Indice ingresado esta fuera de la lista, el elemento no existe");}
        return lista.get(indice);
    }

    //9
    public T primerElemento() {
        if (lista.size() == 0 )
            { throw new IllegalStateException("La lista esta vacía");}
        return lista.get(0);
    }

    //10
    public T ultimoElemento() {
        if (lista.size() == 0 )
            { throw new IllegalStateException("La lista esta vacía");}
        return lista.get(lista.size() - 1);
    }

    //11
    public void removerConIndice(int indice) {
        if (indice >= lista.size())
            {throw new IndexOutOfBoundsException("El indice ingresado esta fuera de la lista, el elemento no existe");}
        lista.remove(indice);
    }
}
