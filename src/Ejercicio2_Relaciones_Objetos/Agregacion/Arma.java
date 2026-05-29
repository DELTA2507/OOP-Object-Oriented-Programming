package Ejercicio2_Relaciones_Objetos.Agregacion;

public class Arma {
    private String nombre;
    private String fabricante;
    private double calibre;

    public Arma(String nombre, String fabricante, double calibre) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.calibre = calibre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                "fabricante='" + fabricante + '\'' +
                "calibre=" + calibre;
    }
}
