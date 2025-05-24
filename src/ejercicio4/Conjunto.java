package ejercicio4;


import java.util.HashSet;
import java.util.Set;

public class Conjunto<T> {
    private Set<T> conjuntos;

    public Conjunto(){
        this.conjuntos = new HashSet<>();
    }

    public void add(T elemento){
        conjuntos.add(elemento);
    }

    public void remove(T elemento){
        conjuntos.remove(elemento);
    }

    public boolean existe(T elemento){
        return conjuntos.contains(elemento);
       
    }

    public void showAll(){
        for(T e : conjuntos){
            System.out.println(e);
        }
    }
}
