package Ejercicios.Ejercicios_Herencia.Empleado_Trabajo;

public class EmpleadoRH extends Empleado {

    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);
    }

    @Override
    public void trabajar() {
        System.out.println("Gestionando recursos humanos");
    }

    @Override
    public double calcularSalario() {
        int diasMes = 20;
        return diasMes * HORAS_TRABAJADAS_DIA * PAGO_HORA;
    }

    public void contratarEmpleado(Empleado empleado) {
        System.out.println("Contratando a: " + empleado.nombre + " " + empleado.apellidos);
    }
}
