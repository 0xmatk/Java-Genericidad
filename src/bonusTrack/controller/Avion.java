package bonusTrack.controller;

public abstract class Avion {
    protected String modelo;
    protected String marca;
    protected int capacidadDeCombustible;
    protected int cantidadDeAsientos; 


    public Avion(String modelo, String marca, int capacidadDeCombustible, int cantidadDeAsientos) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.cantidadDeAsientos = cantidadDeAsientos;
    }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadDeCombustible() {
        return this.capacidadDeCombustible;
    }

    public void setCapacidadDeCombustible(int capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public int getCantidadDeAsientos() {
        return this.cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }   

    public abstract String despegar();

    public abstract String aterrizar();
    
    public abstract String volar();
       
    
    
    
}
