package bonusTrack.model;

public class Aeropuerto {
    protected String nombre;
    protected String codigoInternacional;
    protected int capacidadDeOperacion;


    public Aeropuerto(String nombre, String codigoInternacional, int capacidadDeOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.capacidadDeOperacion = capacidadDeOperacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoInternacional() {
        return this.codigoInternacional;
    }

    public void setCodigoInternacional(String codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }

    public int getCapacidadDeOperacion() {
        return this.capacidadDeOperacion;
    }

    public void setCapacidadDeOperacion(int capacidadDeOperacion) {
        this.capacidadDeOperacion = capacidadDeOperacion;
    }


    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", codigoInternacional='" + getCodigoInternacional() + "'" +
                ", capacidadDeOperacion='" + getCapacidadDeOperacion() + "'" +
                "}";
    }
}
