package Ejercicios.Ejercicio_Biblioteca_Universidad.model;

import Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions.MaterialNoDisponibleException;
import Ejercicios.Ejercicio_Biblioteca_Universidad.interfaces.Prestable;

public class Libro extends Material implements Prestable {
    private final String autor;
    private final String isbn;

    public Libro(String id, String titulo, String autor, String isbn) {
        super(id, titulo);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (estaPrestado()) {
            throw new MaterialNoDisponibleException(
                    "El libro con ID " + getId() + " ya esta prestado."
            );
        }

        setPrestado(true);
    }

    @Override
    public void devolver() {
        setPrestado(false);
    }

    @Override
    public String getTipo() {
        return "Libro";
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor + " | ISBN: " + isbn;
    }
}
