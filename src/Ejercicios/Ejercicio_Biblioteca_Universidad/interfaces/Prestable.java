package Ejercicios.Ejercicio_Biblioteca_Universidad.interfaces;

import Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions.MaterialNoDisponibleException;

public interface Prestable {
    void prestar() throws MaterialNoDisponibleException;
    void devolver();
    boolean estaPrestado();
}
