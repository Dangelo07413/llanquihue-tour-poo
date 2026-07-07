package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CATALOGO DE SERVICIOS TURISTICOS ===");

        // 1. Instanciamos el gestor (que ya carga la lista automáticamente)
        GestorServicios gestor = new GestorServicios();

        // 2. Invocamos el método polimórfico que recorre la colección con for-each
        gestor.mostrarTodosLosServicios();
    }
}