package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CATALOGO DE SERVICIOS TURISTICOS ===");

        GestorServicios gestor = new GestorServicios();
        ServicioTuristico[] listaServicios = gestor.obtenerServiciosDePrueba();

        // Recorremos el arreglo para mostrar la información en consola
        for (ServicioTuristico servicio : listaServicios) {
            System.out.println(servicio.toString());
        }
    }
}