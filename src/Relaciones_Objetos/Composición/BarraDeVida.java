package Relaciones_Objetos.Composición;

public class BarraDeVida {
    private int vida;

    public BarraDeVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int restarVida(int damage) {
        vida = vida - damage;

        if (vida < 0) {
            vida = 0;
        }

        return damage;
    }

    public int curar(int cantidadACurar) {
        vida = vida + cantidadACurar;

        if (vida > 100) {
            vida = 100;
        }

        return cantidadACurar;
    }
}
