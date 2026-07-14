package model;

public class GuiaTuristico implements Registrable {
    private String identificador;
    private String nombre;
    private String idioma;

    public GuiaTuristico(String identificador, String nombre, String idioma) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.idioma = idioma;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("[Guía] ID: " + identificador + " | Nombre: " + nombre + " | Idioma: " + idioma);
    }

    public String getIdentificador() { return identificador; }
    public String getNombre() { return nombre; }
}