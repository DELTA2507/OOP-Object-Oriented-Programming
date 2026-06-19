package Ejercicios.Ejercicios_Herencia.Animal_Sonido;

public class Gato extends Animal {
    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("MIAU");
    }
}
