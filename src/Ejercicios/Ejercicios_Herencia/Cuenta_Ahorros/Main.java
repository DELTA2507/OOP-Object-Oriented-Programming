package Ejercicios.Ejercicios_Herencia.Cuenta_Ahorros;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros(200);

        cuenta.retirar(50);
        System.out.println(cuenta.getSaldo());

        cuenta.retirar(60);
        System.out.println(cuenta.getSaldo());

        cuenta.retirar(100);
        System.out.println(cuenta.getSaldo());

        cuenta.retirar(25);
        System.out.println(cuenta.getSaldo());
    }
}
