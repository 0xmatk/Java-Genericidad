package ejercicio3;

public class OperacionMatematica<T extends Number> {
    private T numero1;
    private T numero2;
    
   public void setNumeros(T a, T b){
        numero1 = a;
        numero2 = b;
   }

   public double sumar(){
        return numero1.doubleValue() + numero2.doubleValue();
   }

   public double restar(){
        return numero1.doubleValue() - numero2.doubleValue();
   }

   public double multiplicar(){
        return numero1.doubleValue() * numero2.doubleValue();
   }

   public double dividir(){
        if(numero2.doubleValue() == 0) throw new ArithmeticException("No se puede dividir por 0");
        
        return numero1.doubleValue() / numero2.doubleValue();
   }

    

    
}
