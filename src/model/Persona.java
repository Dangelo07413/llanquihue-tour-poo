package model;

public class Persona {
    private String rut;
    private String nombre;
    private Direccion direccion; // Composición: Una Persona TIENE UNA Dirección

    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Dirección: [" + direccion + "]";
    }
}

