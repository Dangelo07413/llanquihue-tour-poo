package model;

import interfaces.Registrable;

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
    public String mostrarResumen() {
        return "[Vehículo] ID: " + identificador + " | Patente: " + patente + " | Capacidad: " + capacidad + " pasajeros";
    }


    public String getIdentificador() { return identificador; }
    public String getPatente() { return patente; }
}