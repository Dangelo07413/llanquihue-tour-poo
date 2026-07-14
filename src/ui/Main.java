package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import model.Registrable;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Registrar Guía Turístico", "Registrar Vehículo", "Mostrar Todos los Registros", "Salir"};

            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción para la Agencia Llanquihue Tour:",
                    "Menú Principal - Llanquihue Tour",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones
            );

            switch (seleccion) {
                case 0:
                    String idGuia = JOptionPane.showInputDialog("Ingrese el ID del Guía:");
                    if (idGuia == null) break;
                    String nombreGuia = JOptionPane.showInputDialog("Ingrese el Nombre del Guía:");
                    String idiomaGuia = JOptionPane.showInputDialog("Ingrese el Idioma del Guía:");

                    gestor.agregarEntidad(new GuiaTuristico(idGuia, nombreGuia, idiomaGuia));
                    JOptionPane.showMessageDialog(null, "¡Guía registrado con éxito!");
                    break;

                case 1:
                    String idVehiculo = JOptionPane.showInputDialog("Ingrese el ID del Vehículo:");
                    if (idVehiculo == null) break;
                    String patente = JOptionPane.showInputDialog("Ingrese la Patente del Vehículo:");
                    String capacidadStr = JOptionPane.showInputDialog("Ingrese la Capacidad (Pasajeros):");

                    if (capacidadStr != null) {
                        int capacidad = Integer.parseInt(capacidadStr);
                        gestor.agregarEntidad(new Vehiculo(idVehiculo, patente, capacidad));
                        JOptionPane.showMessageDialog(null, "¡Vehículo registrado con éxito!");
                    }
                    break;

                case 2:
                    StringBuilder resumenTexto = new StringBuilder("=== RESUMEN DE REGISTROS ===\n\n");
                    if (gestor.getListaEntidades().isEmpty()) {
                        resumenTexto.append("No hay entidades registradas.");
                    } else {
                        for (Registrable entidad : gestor.getListaEntidades()) {
                            if (entidad instanceof GuiaTuristico) {
                                GuiaTuristico g = (GuiaTuristico) entidad;
                                resumenTexto.append("[GUÍA] ID: ").append(g.getIdentificador())
                                        .append(" | Nombre: ").append(g.getNombre())
                                        .append("\n -> Acción: Asignar bono por idioma.\n\n");
                            } else if (entidad instanceof Vehiculo) {
                                Vehiculo v = (Vehiculo) entidad;
                                resumenTexto.append("[VEHÍCULO] ID: ").append(v.getIdentificador())
                                        .append(" | Patente: ").append(v.getPatente())
                                        .append("\n -> Acción: Programar revisión técnica.\n\n");
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, resumenTexto.toString(), "Catálogo de Entidades", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                default:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de Llanquihue Tour.");
                    break;
            }
        }
    }
}