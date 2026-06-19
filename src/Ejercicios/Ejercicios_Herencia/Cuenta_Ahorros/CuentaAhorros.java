package Ejercicios.Ejercicios_Herencia.Cuenta_Ahorros;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {
        if (saldo - monto < 100) {
            System.out.println("Retiro rechazado: saldo mínimo de 100 requerido");
        } else {
            saldo -= monto;
        }
    }
}
