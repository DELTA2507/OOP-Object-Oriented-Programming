package Relaciones_Objetos.Agregacion;

public class Soldado {
    private String nombre;
    private String rango;
    private Arma arma;

    public Soldado(String nombre, String rango, Arma arma) {
        this.nombre = nombre;
        this.rango = rango;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                "rango='" + rango + '\'' +
                "arma=" + arma.getNombre();
    }
}
