package Ejercicios.Ejercicio_Biblioteca_Universidad.model;

import Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions.MaterialNoDisponibleException;
import Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions.MaximoPrestamosException;
import Ejercicios.Ejercicio_Biblioteca_Universidad.interfaces.Prestable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
    private static final int MAXIMO_PRESTAMOS = 3;

    private final int id;
    private final String nombre;
    private final List<Material> prestamos;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Material> getPrestamos() {
        return Collections.unmodifiableList(prestamos);
    }

    public void prestarMaterial(Material material)
            throws MaximoPrestamosException, MaterialNoDisponibleException {

        if (cantidadPrestamos() >= MAXIMO_PRESTAMOS) {
            throw new MaximoPrestamosException(
                    "El usuario " + nombre + " ya alcanzo el maximo de "
                            + MAXIMO_PRESTAMOS + " prestamos."
            );
        }

        if (!(material instanceof Prestable prestable)) {
            throw new MaterialNoDisponibleException(
                    "El material con ID " + material.getId() + " no se puede prestar."
            );
        }

        prestable.prestar();
        prestamos.add(material);
    }

    public void devolverMaterial(Material material) {
        if (prestamos.remove(material) && material instanceof Prestable prestable) {
            prestable.devolver();
        }
    }

    public int cantidadPrestamos() {
        return prestamos.size();
    }

    public boolean tienePrestado(Material material) {
        return prestamos.contains(material);
    }

    @Override
    public String toString() {
        return "Usuario | ID: " + id + " | Nombre: " + nombre
                + " | Prestamos activos: " + cantidadPrestamos();
    }
}
