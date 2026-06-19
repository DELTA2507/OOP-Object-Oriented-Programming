package Ejercicios.Ejercicios_Herencia.Animal_Sonido;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("Sonido...");
    }
}
