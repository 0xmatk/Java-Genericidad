package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada<T extends Comparable<T>> {
    private List<T> listaOrdenada;  

    public ListaOrdenada(){
        listaOrdenada = new ArrayList<>();
    }

    public void add(T elemento){
        listaOrdenada.add(elemento);
    }

    public void remove(T elemento){
        listaOrdenada.remove(elemento);
    }

    public T devolverElementoPorIndice(int index){
        return listaOrdenada.get(index);
    }

    public void ordenarAscendente(){
        Collections.sort(listaOrdenada);
    }

    public void ordenarDescendente(){
        Collections.sort(listaOrdenada, Collections.reverseOrder());
    }

    public void showAll(){
        for(T e : listaOrdenada){
            System.out.println(e);
        }
    }


    
    
}
