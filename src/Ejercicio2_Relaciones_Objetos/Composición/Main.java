package Ejercicio2_Relaciones_Objetos.Composición;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jug4d0r01", "Mago", 100);

        System.out.println("Salud actual: " + jugador1.getBarraDeVida().getVida());

        System.out.println("Recibiste daño: " + "-" +jugador1.getBarraDeVida().restarVida(40));
        System.out.println("Recibiste daño: " + "-" +jugador1.getBarraDeVida().restarVida(10));

        System.out.println("Usaste curación: " + "+" +jugador1.getBarraDeVida().curar(30));

        System.out.println("Salud actual: " + jugador1.getBarraDeVida().getVida());
    }
}
