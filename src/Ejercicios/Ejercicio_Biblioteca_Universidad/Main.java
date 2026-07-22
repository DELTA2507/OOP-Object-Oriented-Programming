package Ejercicios.Ejercicio_Biblioteca_Universidad;

import Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions.BibliotecaException;
import Ejercicios.Ejercicio_Biblioteca_Universidad.model.Biblioteca;
import Ejercicios.Ejercicio_Biblioteca_Universidad.model.Libro;
import Ejercicios.Ejercicio_Biblioteca_Universidad.model.Revista;
import Ejercicios.Ejercicio_Biblioteca_Universidad.model.Usuario;
import Ejercicios.Ejercicio_Biblioteca_Universidad.view.MenuView;
import util.RegistroErrores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        cargarDatosIniciales(biblioteca);
        ejecutarEscenariosPrueba(biblioteca);

        Scanner scanner = new Scanner(System.in);
        MenuView menuView = new MenuView(biblioteca, scanner);
        menuView.mostrarMenu();
        scanner.close();
    }

    private static void cargarDatosIniciales(Biblioteca biblioteca) {
        biblioteca.registrarMaterial(new Libro("L001", "Clean Code", "Robert C. Martin", "9780132350884"));
        biblioteca.registrarMaterial(new Libro("L002", "Effective Java", "Joshua Bloch", "9780134685991"));
        biblioteca.registrarMaterial(new Libro("L003", "Design Patterns", "Erich Gamma", "9780201633610"));
        biblioteca.registrarMaterial(new Revista("R001", "National Geographic", 101));
        biblioteca.registrarMaterial(new Revista("R002", "Scientific American", 202));

        biblioteca.registrarUsuario(new Usuario(1, "Ana"));
        biblioteca.registrarUsuario(new Usuario(2, "Carlos"));
    }

    private static void ejecutarEscenariosPrueba(Biblioteca biblioteca) {
        System.out.println("=== ESCENARIOS OBLIGATORIOS ===");

        ejecutarOperacion("1. Prestamo exitoso", () ->
                biblioteca.prestarMaterial(1, "L001")
        );

        ejecutarOperacion("2. Material ya prestado", () ->
                biblioteca.prestarMaterial(2, "L001")
        );

        ejecutarOperacion("3. Material inexistente", () ->
                biblioteca.prestarMaterial(1, "X999")
        );

        ejecutarOperacion("4. Usuario inexistente", () ->
                biblioteca.prestarMaterial(999, "L002")
        );

        ejecutarOperacion("5. Superar maximo de prestamos", () -> {
            biblioteca.prestarMaterial(2, "L002");
            biblioteca.prestarMaterial(2, "L003");
            biblioteca.prestarMaterial(2, "R001");
            biblioteca.prestarMaterial(2, "R002");
        });

        ejecutarOperacion("6. Devolucion exitosa", () ->
                biblioteca.devolverMaterial(1, "L001")
        );

        System.out.println();
    }

    private static void ejecutarOperacion(String descripcion, Operacion operacion) {
        System.out.println("\n" + descripcion);

        try {
            operacion.ejecutar();
            System.out.println("Operacion realizada correctamente.");
        } catch (BibliotecaException e) {
            System.out.println("Error: " + e.getMessage());
            RegistroErrores.registrar(e);
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }

    @FunctionalInterface
    private interface Operacion {
        void ejecutar() throws BibliotecaException;
    }
}
