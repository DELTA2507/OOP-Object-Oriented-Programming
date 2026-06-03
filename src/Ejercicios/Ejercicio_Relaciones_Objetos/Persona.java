package Ejercicios.Ejercicio_Relaciones_Objetos;

public class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pasaporte = null;
        this.mascota = null;
    }

    public void sacarPasaporte(
            String numero,
            String nacionalidad,
            String fechaEmision,
            String fechaVencimiento,
            Boolean estaVigente
    ) {
        pasaporte = new Pasaporte(
                numero,
                nacionalidad,
                fechaEmision,
                fechaVencimiento,
                estaVigente
        );
    }

    public void tomarVuelo(String pais) {
        if (pasaporte != null && pasaporte.getEstaVigente()) {
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais + ".");
        } else {
            System.out.println(nombre + " " + apellidos + " no puede tomar el vuelo, ya que su pasaporte no está vigente.");
        }
    }

    // Setter para atributo 'mascota'
    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugar() {
        System.out.println(nombre + " juega con " + mascota.getNombre());
    }

    public void soldar(MaquinaSoldar maquina, String metal) {
        maquina.soldar(metal);
    }
}
