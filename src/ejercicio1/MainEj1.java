package ejercicio1;

public class MainEj1 {
    public static void main(String[] args){
        Almacenamiento<String> elementosString = new Almacenamiento<>();
        elementosString.add("Hola");
        elementosString.add("String");
        elementosString.showAll();

        Almacenamiento<Integer> elementosInteger = new Almacenamiento<>();
        elementosInteger.add(1);
        elementosInteger.add(2);
        elementosInteger.showAll();

        Almacenamiento<Persona> elementosPersona = new Almacenamiento<>();
        Persona p1 = new Persona("Juan", 23);
        elementosPersona.add(p1);
        elementosPersona.showAll();
        

        
    }
}
