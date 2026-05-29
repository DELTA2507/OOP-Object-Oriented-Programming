package Ejercicio2_Relaciones_Objetos.Composición;

public class Jugador {

    private String nombre;
    private String arquetipo;
    private BarraDeVida barraDeVida;

    public Jugador(String nombre, String arquetipo, int vidaInicial) {
        this.nombre = nombre;
        this.arquetipo = arquetipo;
        this.barraDeVida = new BarraDeVida(vidaInicial);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArquetipo() {
        return arquetipo;
    }

    public void setArquetipo(String arquetipo) {
        this.arquetipo = arquetipo;
    }

    public BarraDeVida getBarraDeVida() {
        return barraDeVida;
    }
}
