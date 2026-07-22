package Ejercicios.Ejercicio_Biblioteca_Universidad.model;

import exceptions.MaterialNoDisponibleException;
import interfaces.Prestable;

public class Revista extends Material implements Prestable {
    private final int numero;

    public Revista(String id, String titulo, int numero) {
        super(id, titulo);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (estaPrestado()) {
            throw new MaterialNoDisponibleException(
                    "La revista con ID " + getId() + " ya esta prestada."
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
        return "Revista";
    }

    @Override
    public String toString() {
        return super.toString() + " | Numero: " + numero;
    }
}
