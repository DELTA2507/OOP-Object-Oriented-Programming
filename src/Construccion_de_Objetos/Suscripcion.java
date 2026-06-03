package Construccion_de_Objetos;

public class Suscripcion {
    // Atributos
    private String tipo;
    private int costo;
    private String periocidad;

    public Suscripcion(String tipo, int costo, String periocidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periocidad = periocidad;
    }

    public String getTipo() {
        return tipo;
    }
    public int getCosto() {
        return costo;
    }
    public String getPeriocidad() {
        return periocidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }
}
