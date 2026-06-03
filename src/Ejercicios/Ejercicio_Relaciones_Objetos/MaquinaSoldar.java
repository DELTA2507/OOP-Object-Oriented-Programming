package Ejercicios.Ejercicio_Relaciones_Objetos;

public class MaquinaSoldar {
    private String marca;
    private String modelo;
    private int potencia;
    private String[] metales;

    public MaquinaSoldar(
            String marca,
            String modelo,
            int potencia,
            String[] metales
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = metales;
    }

    public void soldar(String metal) {
        for (String metalCompatible : metales) {
            if (metalCompatible.equalsIgnoreCase(metal)) {
                System.out.println(
                        "La máquina de soldar "
                                + marca + " "
                                + modelo
                                + " solda el "
                                + metal + "."
                );
                return;
            }
        }

        System.out.println(
                "La máquina de soldar "
                        + marca + " "
                        + modelo
                        + " no puede soldar "
                        + metal + "."
        );
    }
}
