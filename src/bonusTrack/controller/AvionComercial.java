package bonusTrack.controller;

import java.util.ArrayList;
import java.util.List;

public class AvionComercial extends Avion{
  
    private int cantidadAzafatas;
    private List<String> listaDeServicios; 

    public AvionComercial(String modelo, String marca, int capacidadDeCombustible, int cantidadDeAsientos, int cantidadAzafatas) {
        super(modelo, marca, capacidadDeCombustible, cantidadDeAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.listaDeServicios = new ArrayList<>();
        
    }


    public int getCantidadAzafatas() {
        return this.cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public List<String> getListaDeServicios() {
        return this.listaDeServicios;
    }

    public void setListaDeServicios(List<String> listaDeServicios) {
        this.listaDeServicios = listaDeServicios;
    }

    @Override
    public String despegar() {
        return "El Avion Comercial " + getModelo() + " está despegando";
    }

    @Override
    public String aterrizar() {
        return "El Avion Comercial " + getModelo() + " está aterrizando";
    }

    @Override
    public String volar() {
        return "El Avion Comercial " + getModelo() + " está volando";
    }

    
    
}
