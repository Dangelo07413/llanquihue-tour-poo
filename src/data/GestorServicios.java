package data;

import model.*;

public class GestorServicios {

    private java.util.List<ServicioTuristico> listaServicios;

    public GestorServicios() {
        this.listaServicios = new java.util.ArrayList<>();
        cargarServiciosInstancia();
    }
    private void cargarServiciosInstancia() {
        listaServicios.add(new RutaGastronomica("Sabores de Frutillar", 3.5, 4));
        listaServicios.add(new RutaGastronomica("Tour del Kuchen", 2.0, 3));

        listaServicios.add(new PaseoLacustre("Navegación Volcán Osorno", 1.5, "Catamarán"));
        listaServicios.add(new PaseoLacustre("Atardecer en el Lago", 2.5, "Lancha"));

        listaServicios.add(new ExcursionCultural("Ruta Colonización Alemana", 4.0, "Museo Frutillar"));
        listaServicios.add(new ExcursionCultural("Patrimonio de Puerto Varas", 3.0, "Iglesia"));
    }

    public java.util.List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }


    public void mostrarTodosLosServicios() {
        for (ServicioTuristico servicio : listaServicios) {
            servicio.mostrarInformacion(); // Llama dinámicamente al método de cada subclase
        }
    }
}