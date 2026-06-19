package Ejercicios.Ejercicios_Herencia.Empleado_Trabajo;

public class Main {
    public static void main(String[] args) {
        EmpleadoRH empleadoRH = new EmpleadoRH("Ana", "Lopez", "RH");
        Empleado empleado = new EmpleadoRH("Carlos", "Perez", "Developer");
        empleadoRH.trabajar();
        System.out.println(empleadoRH.calcularSalario());

        empleadoRH.contratarEmpleado(empleado);
    }
}