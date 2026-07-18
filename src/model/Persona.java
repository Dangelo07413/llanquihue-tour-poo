package model;

public class Persona implements model.Registrable {
    private String rut;
    private String nombre;
    private Direccion direccion;

    public Persona(String rut, String nombre, Direccion direccion) throws exceptions.RutInvalidoException {
        if (rut == null || !rut.contains("-")) {
            throw new exceptions.RutInvalidoException("El formato del RUT es inválido. Debe contener guion.");
        }
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Direccion getDirection() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Dirección: [" + direccion + "]";
    }

    @Override
    public String mostrarResumen() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Dirección: " + direccion;
    }
}
