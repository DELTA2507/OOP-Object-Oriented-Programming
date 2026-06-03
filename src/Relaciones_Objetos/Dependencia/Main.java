package Relaciones_Objetos.Dependencia;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alan");

        persona1.martillar(new Martillo("Vaughan"));
    }
}
