package Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions;

public class OperacionBibliotecaException extends BibliotecaException {
    public OperacionBibliotecaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
