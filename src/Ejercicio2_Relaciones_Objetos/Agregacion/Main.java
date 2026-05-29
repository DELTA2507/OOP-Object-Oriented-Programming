package Ejercicio2_Relaciones_Objetos.Agregacion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma("HK416", "Heckler & Koch", 2.77);
        Arma arma2 = new Arma("Colt Single Action Army", "Colt", 5);

        Ejercito ejercito1 = new Ejercito("Marines");

        Soldado soldado1 = new Soldado("Miller", "Sargento", arma2);
        Soldado soldado2 = new Soldado("Ramirez", "Oficial", arma1);
        Soldado soldado3 = new Soldado("Aguirre", "Cadete", arma1);

        ejercito1.agregarSoldados(soldado1, soldado2, soldado3);

        System.out.println("Marines:");
        for (Soldado soldado : ejercito1.getSoldados()) {
            System.out.println(soldado.getNombre() + " - " +soldado.getArma().getNombre());
        }

    }
}
