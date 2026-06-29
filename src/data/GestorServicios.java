package data;

import model.*;

public class GestorServicios {

    public ServicioTuristico[] obtenerServiciosDePrueba() {
        ServicioTuristico[] servicios = new ServicioTuristico[6];

        // 2 Rutas Gastronómicas
        servicios[0] = new RutaGastronomica("Sabores de Frutillar", 3.5, 4);
        servicios[1] = new RutaGastronomica("Tour del Kuchen", 2.0, 3);

        // 2 Paseos Lacustres
        servicios[2] = new PaseoLacustre("Navegación Volcán Osorno", 1.5, "Catamarán");
        servicios[3] = new PaseoLacustre("Atardecer en el Lago", 2.5, "Lancha");

        // 2 Excursiones Culturales
        servicios[4] = new ExcursionCultural("Ruta Colonización Alemana", 4.0, "Museo Frutillar");
        servicios[5] = new ExcursionCultural("Patrimonio de Puerto Varas", 3.0, "Iglesia Sagrado Corazón");

        return servicios;
    }
}