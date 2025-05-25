package bonusTrack.model;


import java.io.Serializable;

public class AvionPrivado extends Avion implements IServicio{
   
    private boolean tieneJacuzzi; 
    private String claveWifi; 

     public AvionPrivado(String modelo, String marca, int capacidadDeCombustible, int cantidadDeAsientos, boolean tieneJacuzzi, String claveWifi) {
        super(modelo, marca, capacidadDeCombustible, cantidadDeAsientos);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
        
    }


    public boolean isTieneJacuzzi() {
        return this.tieneJacuzzi;
    }

    public boolean getTieneJacuzzi() {
        return this.tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public String getClaveWifi() {
        return this.claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }


    @Override
    public String despegar() {
        return "El Avion Privado " + getModelo() + " está despegando";
    }

    @Override
    public String aterrizar() {
        return "El Avion Privado " + getModelo() + " está aterrizando";
    }

    @Override
    public String volar() {
       return "El Avion Privado " + getModelo() + " está volando";
    }

    public String servirComida() {
        return "El avion " + getModelo() + " esta sirviendo comida";
    }

    @Override
    public String darManta() {
        return "El avion " + getModelo() + " esta otorgando mantas";
    }

    public boolean verMundial(){
         return false;
    }

    @Override
    public String toString() {
        return "AvionPrivado{" +
                "tieneJacuzzi=" + tieneJacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                ", capacidadDeCombustible=" + capacidadDeCombustible +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
