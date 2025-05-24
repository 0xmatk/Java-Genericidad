package ejercicio3;

public class MainEj3 {
    public static void main(String[] args){
        OperacionMatematica<Integer> opEnteros = new OperacionMatematica<>();
        
        opEnteros.setNumeros(2, 2);
        System.out.println(opEnteros.sumar());
        System.out.println(opEnteros.restar());
        System.out.println(opEnteros.multiplicar());
        System.out.println(opEnteros.dividir());

        OperacionMatematica<Double> opDecimal = new OperacionMatematica<>();
        opDecimal.setNumeros(2.1, 0.1);
        System.out.println(opDecimal.sumar());
        System.out.println(opDecimal.restar());
        System.out.println(opDecimal.multiplicar());
        System.out.println(opDecimal.dividir());




        


    }
    
}
