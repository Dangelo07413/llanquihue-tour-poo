package model;

public class ServicioTuristico {
    // Atributos protegidos para la herencia
    protected String nombre;
    protected double duracionHoras;

    // Constructor obligatorio con parámetros (¡Esto es lo que te falta!)
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Método toString
    @Override
    public String toString() {
        return "Servicio: " + nombre + " | Duración: " + duracionHoras + " horas";
    }
}