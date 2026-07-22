package Ejercicios.Ejercicio_Biblioteca_Universidad.model;

import Ejercicios.Ejercicio_Biblioteca_Universidad.exceptions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private final List<Material> materiales;
    private final List<Usuario> usuarios;

    public Biblioteca() {
        materiales = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registrarMaterial(Material material) {
        if (material == null) {
            throw new IllegalArgumentException("El material no puede ser null.");
        }

        if (materiales.stream().anyMatch(m -> m.getId().equalsIgnoreCase(material.getId()))) {
            throw new IllegalArgumentException(
                    "Ya existe un material con el ID " + material.getId() + "."
            );
        }

        materiales.add(material);
    }

    public void registrarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario no puede ser null.");
        }

        if (usuarios.stream().anyMatch(u -> u.getId() == usuario.getId())) {
            throw new IllegalArgumentException(
                    "Ya existe un usuario con el ID " + usuario.getId() + "."
            );
        }

        usuarios.add(usuario);
    }

    public Material buscarMaterial(String id) throws MaterialNoEncontradoException {
        return materiales.stream()
                .filter(material -> material.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new MaterialNoEncontradoException(
                        "No se encontro un material con el ID " + id + "."
                ));
    }

    public Usuario buscarUsuario(int id) throws UsuarioNoEncontradoException {
        return usuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UsuarioNoEncontradoException(
                        "No se encontro un usuario con el ID " + id + "."
                ));
    }

    public void prestarMaterial(int usuarioId, String materialId)
            throws UsuarioNoEncontradoException,
            MaterialNoEncontradoException,
            MaterialNoDisponibleException,
            MaximoPrestamosException {

        Usuario usuario = buscarUsuario(usuarioId);
        Material material = buscarMaterial(materialId);
        usuario.prestarMaterial(material);
    }

    public void devolverMaterial(int usuarioId, String materialId)
            throws UsuarioNoEncontradoException,
            MaterialNoEncontradoException,
            OperacionBibliotecaException {

        Usuario usuario = buscarUsuario(usuarioId);
        Material material = buscarMaterial(materialId);

        if (!usuario.tienePrestado(material)) {
            throw new OperacionBibliotecaException(
                    "El usuario " + usuario.getNombre()
                            + " no tiene prestado el material " + materialId + ".",
                    new IllegalStateException("Prestamo no encontrado")
            );
        }

        usuario.devolverMaterial(material);
    }

    public List<Material> getMateriales() {
        return Collections.unmodifiableList(materiales);
    }

    public List<Usuario> getUsuarios() {
        return Collections.unmodifiableList(usuarios);
    }
}
