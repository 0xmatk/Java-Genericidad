package ejercicio1; 

import java.util.ArrayList;
import java.util.List;

public class Almacenamiento<T>{
    private List<T> elementos;
    
    public Almacenamiento(){
        this.elementos = new ArrayList<T>();
    
    }

    public void add(T elemento){
        this.elementos.add(elemento);
    }

    public void remove(T elemento){
        this.elementos.remove(elemento);
    }

    public boolean search(T elemento){
        return elementos.contains(elemento);
    }

    public void showAll(){
        for (T e : elementos){
            System.out.println(e);
        }
    }
}