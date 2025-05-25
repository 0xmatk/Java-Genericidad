package bonusTrack.view;

import bonusTrack.controller.AeropuertoController;
import bonusTrack.model.Aeropuerto;
import bonusTrack.model.AvionPrivado;
import bonusTrack.model.Hangar;
import bonusTrack.model.AvionMilitar;

public class Main {
    public static void main(String[] args) {
        // 1. Crear aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto("Astor Piazzolla", "MDQ", 10);

        // 2. Crear controlador
        AeropuertoController controller = new AeropuertoController(aeropuerto);

        // 3. Crear hangares
        Hangar<AvionPrivado> hangarPrivado = new Hangar<>(2);
        Hangar<AvionMilitar> hangarMilitar = new Hangar<>(1);

        // 4. Crear aviones
        AvionPrivado avionP1 = new AvionPrivado("Gulfstream G650", "Gulfstream", 5000, 150, true, "VIP123");
        AvionPrivado avionP2 = new AvionPrivado("Cessna Citation", "Cessna", 4000, 200, false, "SKYNET");
        AvionPrivado avionP3 = new AvionPrivado("Learjet 75", "Bombardier", 4200, 200, true, "LUXPASS");

        AvionMilitar avionM1 = new AvionMilitar("F-22 Raptor", "Lockheed", 8000, 20, 120, "aire-aire");

        // 5. Agregar aviones a hangares (dentro del límite)
        System.out.println("\n=== AGREGANDO AVIONES ===");
        controller.agregarAvionAlHangar(hangarPrivado, avionP1);
        controller.agregarAvionAlHangar(hangarPrivado, avionP2);

        // 6. Intentar agregar más allá de la capacidad
        boolean agregado = controller.agregarAvionAlHangar(hangarPrivado, avionP3);
        if (!agregado) {
            System.out.println("❌ No se pudo agregar " + avionP3.getModelo() + " Hangar lleno.");
        }

        controller.agregarAvionAlHangar(hangarMilitar, avionM1);

        // 7. Mostrar cuántos aviones hay antes de despegar
        System.out.println("\n🚁 Aviones en hangar privado: " + hangarPrivado.cantidadAviones());
        System.out.println("🚁 Aviones en hangar militar: " + hangarMilitar.cantidadAviones());

        // 8. Despegar todos los aviones de cada hangar
        System.out.println("\n=== DESPEGANDO AVIONES PRIVADOS ===");
        controller.despegarAvionesDelHangar(hangarPrivado);

        System.out.println("\n=== DESPEGANDO AVIONES MILITARES ===");
        controller.despegarAvionesDelHangar(hangarMilitar);

        // 9. Verificar que ya no quedan aviones
        System.out.println("\n✅ Aviones restantes en hangar privado: " + hangarPrivado.cantidadAviones());
        System.out.println("✅ Aviones restantes en hangar militar: " + hangarMilitar.cantidadAviones());
    }
}
