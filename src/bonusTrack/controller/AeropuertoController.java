package bonusTrack.controller;

import bonusTrack.model.Avion;
import bonusTrack.model.Hangar;
import bonusTrack.model.Aeropuerto;

public class AeropuertoController {

    private Aeropuerto aeropuerto;

    public AeropuertoController(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void despegarAvionesDelHangar(Hangar<? extends Avion> hangar) {
        hangar.despegarTodos();
    }

    public <T extends Avion> boolean agregarAvionAlHangar(Hangar<T> hangar, T avion) {
        return hangar.agregarAvion(avion);
    }
}
