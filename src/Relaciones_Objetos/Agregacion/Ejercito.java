package Relaciones_Objetos.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Ejercito {
    private String nombre;
    private List<Soldado> soldados;

    public Ejercito(String nombre) {
        this.nombre = nombre;
        this.soldados = new ArrayList<>();
    }

    public void agregarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public void agregarSoldados(Soldado... soldados) {
        this.soldados.addAll(List.of(soldados));
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }
}
