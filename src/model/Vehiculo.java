package model;

public class Vehiculo implements Registrable {
    private String identificador;
    private String patente;
    private int capacidad;

    public Vehiculo(String identificador, String patente, int capacidad) {
        this.identificador = identificador;
        this.patente = patente;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Vehículo] ID: " + identificador + " | Patente: " + patente + " | Capacidad: " + capacidad + " pasajeros");
    }

    public String getIdentificador() { return identificador; }
    public String getPatente() { return patente; }
}