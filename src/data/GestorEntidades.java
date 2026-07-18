package data;

import interfaces.Registrable;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    private List<Registrable> listaEntidades;

    public GestorEntidades() {
        this.listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        this.listaEntidades.add(entidad);
    }

    public List<Registrable> getListaEntidades() {
        return listaEntidades;
    }

    public void procesarEntidades() {
        for (Registrable entidad : listaEntidades) {
            entidad.mostrarResumen();
        }
    }
}