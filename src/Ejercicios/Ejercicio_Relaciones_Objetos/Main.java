package Ejercicios.Ejercicio_Relaciones_Objetos;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Harry", "Hollow Herrier");
        Persona persona2 = new Persona("Ryan", "Ridley");

        Mascota mascota1 = new Mascota("Baxter", "Pomerania", 5);

        MaquinaSoldar maquinaSoldar1 = new MaquinaSoldar("DELTAWARE", "2X300A", 100, new String[]{"hierro", "acero", "aluminio"});

        persona1.adoptarMascota(mascota1);
        persona2.adoptarMascota(mascota1);

        persona1.jugar();

        persona1.sacarPasaporte(
                "192199",
                "Aleman",
                "20-5-2025",
                "20-1-2026",
                true
        );

        persona2.sacarPasaporte(
                "228172",
                "Australiano",
                "20-5-2010",
                "20-1-2017",
                false
        );

        persona1.tomarVuelo("España");
        persona2.tomarVuelo("Haití");

        persona1.soldar(maquinaSoldar1, "tugsteno");
        persona1.soldar(maquinaSoldar1, "hierro");
    }
}
