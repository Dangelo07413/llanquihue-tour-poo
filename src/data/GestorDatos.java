package data;

import model.Direccion;
import model.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    // Lee las líneas del archivo de texto y las transforma en Objetos Java
    public ArrayList<Empleado> cargarEmpleados(String rutaArchivo) {
        ArrayList<Empleado> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                // Corta la línea cada vez que encuentra un punto y coma
                String[] partes = linea.split(";");

                String rut = partes[0];
                String nombre = partes[1];
                String calle = partes[2];
                String comuna = partes[3];
                String rol = partes[4];
                int sueldo = Integer.parseInt(partes[5]); // Convierte texto a número

                // Arma las instancias correspondientes usando POO
                Direccion dir = new Direccion(calle, comuna);
                Empleado emp = new Empleado(rut, nombre, dir, rol, sueldo);

                lista.add(emp);
            }
        } catch (IOException e) {
            System.out.println("Error al abrir o leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato en números del archivo: " + e.getMessage());
        }
        return lista;
    }

    // Escribe un nuevo empleado al final del archivo .txt para que no se borre al cerrar el programa
    public boolean guardarEmpleadoEnArchivo(String rutaArchivo, Empleado emp) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            String nuevaLinea = String.format("%s;%s;%s;%s;%s;%d",
                    emp.getRut(), emp.getNombre(), emp.getDireccion().getCalle(),
                    emp.getDireccion().getComuna(), emp.getRol(), emp.getSueldo());

            bw.write(nuevaLinea);
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error de escritura física: " + e.getMessage());
            return false;
        }
    }
}
