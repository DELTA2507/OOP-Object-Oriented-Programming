package view;

import exceptions.BibliotecaException;
import model.Biblioteca;
import model.Libro;
import model.Material;
import model.Revista;
import model.Usuario;
import util.RegistroErrores;

import java.util.Scanner;

public class MenuView {
    private final Biblioteca biblioteca;
    private final Scanner scanner;

    public MenuView(Biblioteca biblioteca, Scanner scanner) {
        this.biblioteca = biblioteca;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;

        do {
            imprimirMenu();
            opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1 -> registrarUsuario();
                case 2 -> registrarMaterial();
                case 3 -> prestarMaterial();
                case 4 -> devolverMaterial();
                case 5 -> listarMateriales();
                case 6 -> listarUsuarios();
                case 7 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 7);
    }

    private void imprimirMenu() {
        System.out.println();
        System.out.println("=== BIBLIOTECA UNIVERSITARIA ===");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Registrar material");
        System.out.println("3. Prestar material");
        System.out.println("4. Devolver material");
        System.out.println("5. Listar materiales");
        System.out.println("6. Listar usuarios");
        System.out.println("7. Salir");
    }

    private void registrarUsuario() {
        try {
            int id = leerEntero("ID del usuario: ");
            System.out.print("Nombre del usuario: ");
            String nombre = scanner.nextLine();

            biblioteca.registrarUsuario(new Usuario(id, nombre));
            System.out.println("Usuario registrado correctamente.");
        } catch (IllegalArgumentException e) {
            manejarError(e);
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }

    private void registrarMaterial() {
        try {
            System.out.println("1. Libro");
            System.out.println("2. Revista");
            int tipo = leerEntero("Tipo de material: ");

            System.out.print("ID: ");
            String id = scanner.nextLine();

            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();

            if (tipo == 1) {
                System.out.print("Autor: ");
                String autor = scanner.nextLine();

                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();

                biblioteca.registrarMaterial(new Libro(id, titulo, autor, isbn));
            } else if (tipo == 2) {
                int numero = leerEntero("Numero de revista: ");
                biblioteca.registrarMaterial(new Revista(id, titulo, numero));
            } else {
                throw new IllegalArgumentException("Tipo de material invalido.");
            }

            System.out.println("Material registrado correctamente.");
        } catch (IllegalArgumentException e) {
            manejarError(e);
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }

    private void prestarMaterial() {
        try {
            int usuarioId = leerEntero("ID del usuario: ");

            System.out.print("ID del material: ");
            String materialId = scanner.nextLine();

            biblioteca.prestarMaterial(usuarioId, materialId);
            System.out.println("Prestamo realizado correctamente.");
        } catch (BibliotecaException e) {
            manejarError(e);
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }

    private void devolverMaterial() {
        try {
            int usuarioId = leerEntero("ID del usuario: ");

            System.out.print("ID del material: ");
            String materialId = scanner.nextLine();

            biblioteca.devolverMaterial(usuarioId, materialId);
            System.out.println("Devolucion realizada correctamente.");
        } catch (BibliotecaException e) {
            manejarError(e);
        } finally {
            System.out.println("Operacion finalizada.");
        }
    }

    private void listarMateriales() {
        System.out.println();
        System.out.println("=== MATERIALES ===");

        if (biblioteca.getMateriales().isEmpty()) {
            System.out.println("No hay materiales registrados.");
            return;
        }

        for (Material material : biblioteca.getMateriales()) {
            System.out.println(material);
        }
    }

    private void listarUsuarios() {
        System.out.println();
        System.out.println("=== USUARIOS ===");

        if (biblioteca.getUsuarios().isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        for (Usuario usuario : biblioteca.getUsuarios()) {
            System.out.println(usuario);

            for (Material material : usuario.getPrestamos()) {
                System.out.println("  - " + material.getId() + " | " + material.getTitulo());
            }
        }
    }

    private int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }

    private void manejarError(Exception e) {
        System.out.println("Error: " + e.getMessage());
        RegistroErrores.registrar(e);
    }
}
