package model;

import interfaces.Registrable;

public class GuiaTuristico extends Persona implements Registrable {
    private String identificador;
    private String idioma;

    public GuiaTuristico(String identificador, String nombre, Direccion direccion, String idioma) throws exceptions.RutInvalidoException {
        super(identificador, nombre, direccion);
        this.identificador = identificador;
        this.idioma = idioma;
    }

    @Override
    public String mostrarResumen() {
        return "[Guía] ID: " + identificador + " | Nombre: " + getNombre() + " | Idioma: " + idioma;
    }


    public String getIdentificador() { return identificador; }
    public String getIdioma() { return idioma; }
}