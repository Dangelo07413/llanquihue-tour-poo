package model;

public class Empleado extends Persona {
    private String rol;
    private int sueldo;

    public Empleado(String rut, String nombre, Direccion direccion, String rol, int sueldo)  throws exceptions.RutInvalidoException {
        super(rut, nombre, direccion); // Envía los datos heredados al constructor de Persona
        this.rol = rol;
        this.sueldo = sueldo;
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public int getSueldo() { return sueldo; }
    public void setSueldo(int sueldo) { this.sueldo = sueldo; }

    @Override
    public String toString() {
        return super.toString() + " | Rol: " + rol + " | Sueldo: $" + sueldo;
    }
    @Override
    public String mostrarResumen() {
        return super.toString() + " | Rol: " + this.rol + " | Sueldo: $" + this.sueldo;
    }
}
