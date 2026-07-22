package Ejercicios.Ejercicio_Biblioteca_Universidad.model;

public abstract class Material {
    private final String id;
    private final String titulo;
    private boolean prestado;

    protected Material(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " | ID: " + id + " | Titulo: " + titulo
                + " | Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}
