package ejercicio2;

public class MainEj2 {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();
        pila.apilar("Pos1");
        System.out.println(pila.tope());
        pila.mostrar();
        

    }
}
