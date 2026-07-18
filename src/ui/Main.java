package ui;

import javax.swing.JOptionPane;
import data.GestorDatos;
import model.Empleado;
import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import interfaces.Registrable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        boolean continuar = true;

        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Empleado> empleadosIniciales = gestorDatos.cargarEmpleados("C:\\Users\\Ideapad 330s\\IdeaProjects\\LlanquihueTourApp\\colaboradores.txt");


        if (empleadosIniciales != null) {
            for (Empleado emp : empleadosIniciales) {
                gestor.agregarEntidad(emp);
            }
        }
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
                    String idGuia = JOptionPane.showInputDialog("Ingrese el ID (RUT) del Guía:");
                    if (idGuia == null) break;

                    String nombreGuia = JOptionPane.showInputDialog("Ingrese el Nombre del Guía:");
                    String idiomaGuia = JOptionPane.showInputDialog("Ingrese el Idioma del Guía:");

                    // 1. Pedimos los datos indispensables para construir la Dirección
                    String calleGuia = JOptionPane.showInputDialog("Ingrese la Calle de residencia:");
                    String numeroGuiaStr = JOptionPane.showInputDialog("Ingrese el Número de casa/depto:");
                    int numeroGuia = (numeroGuiaStr != null && !numeroGuiaStr.isEmpty()) ? Integer.parseInt(numeroGuiaStr) : 0;

                    try {
                        // 2. Creamos la instancia de Dirección requerida por Persona
                        model.Direccion direccionGuia = new model.Direccion(calleGuia, numeroGuiaStr);


                        // 3. Enviamos los parámetros al constructor de GuiaTuristico
                        gestor.agregarEntidad(new GuiaTuristico(idGuia, nombreGuia, direccionGuia, idiomaGuia));
                        JOptionPane.showMessageDialog(null, "¡Guía registrado con éxito!");
                    } catch (exceptions.RutInvalidoException e) {
                        JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage(), "RUT Inválido", JOptionPane.ERROR_MESSAGE);
                    }
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
                            } else if (entidad instanceof Empleado) { // ⬅️ ¡Agregamos el soporte para tus colaboradores!
                                Empleado e = (Empleado) entidad;
                                resumenTexto.append("[EMPLEADO] RUT: ").append(e.getRut())
                                        .append(" | Nombre: ").append(e.getNombre())
                                        .append(" | Rol: ").append(e.getRol())
                                        .append("\n -> Acción: Procesar sueldo base: $").append(e.getSueldo()).append("\n\n");
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