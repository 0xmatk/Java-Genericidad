package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos;

    public Pila(){
        this.elementos = new ArrayList<>();
    }

    public void apilar(T elemento){
        elementos.add(elemento);
    }
    
    public T desapilar(){
        if(estaVacia()) throw new RuntimeException("Pila vacia");
        return elementos.remove(elementos.size() - 1);
    }

    public T tope(){
        if(estaVacia()) throw new RuntimeException("Pila vacia");
        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVacia(){
        return elementos.isEmpty();
    }

    public void mostrar(){
        for(T e : elementos){
            System.out.println(e);
        }
    }
}
