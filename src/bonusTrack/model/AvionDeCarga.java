package bonusTrack.model;

import java.util.ArrayList;
import java.util.List;

public class AvionDeCarga extends Avion{
   
    private int cantidadKilos;
    private List<String> productosATransportar; 

     public AvionDeCarga(String modelo, String marca, int capacidadDeCombustible, int cantidadDeAsientos, int  cantidadKilos) {
        super(modelo, marca, capacidadDeCombustible, cantidadDeAsientos);
        this.cantidadKilos = cantidadKilos;
        this.productosATransportar = new ArrayList<>();
        
    }


    public int getCantidadKilos() {
        return this.cantidadKilos;
    }

    public void setCantidadKilos(int cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

    public List<String> getProductosATransportar() {
        return this.productosATransportar;
    }

    public void setProductosATransportar(List<String> productosATransportar) {
        this.productosATransportar = productosATransportar;
    }

     @Override
    public String despegar() {
        return "El Avion de Carga " + getModelo() + " está despegando";
    }

    @Override
    public String aterrizar() {
        return "El Avion de Carga " + getModelo() + " está aterrizando";
    }

    @Override
    public String volar() {
        return "El Avion de Carga " + getModelo() + " está volando";
    }

    public void descargar(){
         System.out.println("El avion de Carga " + getModelo() + " esta descargando");
    }

    public String ingresar(){
        return "El avion de Carga " + getModelo() + " esta ingresando";
    }

    @Override
    public String toString() {
        return "AvionDeCarga{" +
                "cantidadKilos=" + cantidadKilos +
                ", productosATransportar=" + productosATransportar +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                ", capacidadDeCombustible=" + capacidadDeCombustible +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
