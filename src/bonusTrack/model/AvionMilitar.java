package bonusTrack.model;

public class AvionMilitar extends Avion{
    private int cantidadDeBalas;
    private String sistemaDeArmas;

    public AvionMilitar(String modelo, String marca, int capacidadDeCombustible, int cantidadDeAsientos, int cantidadDeBalas, String sistemaDeArmas) {
        super(modelo, marca, capacidadDeCombustible, cantidadDeAsientos);
        this.cantidadDeBalas = cantidadDeBalas;
        this.sistemaDeArmas = sistemaDeArmas;

    }


    @Override
    public String despegar() {
        return "El avion militar " + getModelo() + " esta despegando";
    }

    @Override
    public String aterrizar() {
        return "El avion militar " + getModelo() + " esta aterrizando";
    }

    @Override
    public String volar() {
        return "El avion militar " + getModelo() + " esta volando";
    }

    public int getCantidadDeBalas() {
        return cantidadDeBalas;
    }

    public void setCantidadDeBalas(int cantidadDeBalas) {
        this.cantidadDeBalas = cantidadDeBalas;
    }

    public String getSistemaDeArmas() {
        return sistemaDeArmas;
    }

    public void setSistemaDeArmas(String sistemaDeArmas) {
        this.sistemaDeArmas = sistemaDeArmas;
    }

    public String ingresar(){
        return "El avion militar " + getModelo() + " esta ingresando";
    }

    @Override
    public String toString() {
        return "AvionMilitar{" +
                "cantidadDeBalas=" + cantidadDeBalas +
                ", sistemaDeArmas='" + sistemaDeArmas + '\'' +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                ", capacidadDeCombustible=" + capacidadDeCombustible +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
