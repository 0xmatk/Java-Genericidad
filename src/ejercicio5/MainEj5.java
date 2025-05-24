package ejercicio5;

public class MainEj5 {
    public static void main(String[] args) {
        ListaOrdenada<Integer> numeros = new ListaOrdenada<>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);

        System.out.println("Original:");
        numeros.showAll();

        System.out.println("\nOrden ascendente:");
        numeros.ordenarAscendente();
        numeros.showAll();

        System.out.println("\nOrden descendente:");
        numeros.ordenarDescendente();
        numeros.showAll();

        System.out.println("\nElemento en la posición 2: " + numeros.devolverElementoPorIndice(0));
    }
}
