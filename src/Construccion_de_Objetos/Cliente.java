package Construccion_de_Objetos;

public class Cliente {
    // Atributos
    private int cedula;
    private String nombre;
    private String apellidos;
    private String sexo;
    private String ubicacion;

    // Constructores
    public Cliente(int cedula, String nombre, String apellidos, String sexo, String ubicacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    public Cliente(int cedula, String nombre, String apellidos, String ubicacion) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Cliente() {
    }

    // Getters
    public int getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getSexo() {
        return sexo;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    // Setters
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Métodos
    public void suscribirse(Suscripcion suscripcion) {
        System.out.println("\n" + this.nombre + " adquirió una suscripción " + suscripcion.getTipo());
    }

    public boolean equals(Cliente clienteComparar) {
        return cedula == clienteComparar.getCedula();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sexo='" + sexo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
