package bonusTrack.model;

import java.util.ArrayList;
import java.util.List;

public class Hangar <T extends Avion> {
    private List<T> aviones;
    private int capacidad;

    public Hangar(int capacidad) {
        this.capacidad = capacidad;
        this.aviones = new ArrayList<T>();
    }

    public List<T> getAviones() {
        return aviones;
    }

    public void setAviones(List<T> aviones) {
        this.aviones = aviones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean agregarAvion(T avion) {
        if (aviones.size() >= capacidad) {
            System.out.println("⚠ No se puede agregar más aviones. Capacidad alcanzada.");
            return false;
        }
        aviones.add(avion);
        return true;
    }

    public void despegarTodos() {
        for (T avion : aviones) {
            System.out.println(avion.despegar());
        }
        aviones.clear();
    }

    public void despegarAvion(T avion) {
        System.out.println(avion.despegar());
    }

    public int cantidadAviones() {
        return aviones.size();
    }
}
