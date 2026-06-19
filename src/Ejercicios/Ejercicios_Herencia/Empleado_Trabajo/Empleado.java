package Ejercicios.Ejercicios_Herencia.Empleado_Trabajo;

public abstract class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String puesto;

    protected static final int HORAS_TRABAJADAS_DIA = 8;
    protected static final double PAGO_HORA = 10.0;

    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    public abstract void trabajar();

    public abstract double calcularSalario();
}
