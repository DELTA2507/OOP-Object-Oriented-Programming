package Relaciones_Objetos.Dependencia;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void martillar(Martillo martillo)  {
        System.out.println(nombre + " está martillando con un martillo de marca " + martillo.getMarca());
    }
}
