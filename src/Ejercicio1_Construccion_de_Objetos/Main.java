package Ejercicio1_Construccion_de_Objetos;

public class Main {
    public static void main(String[] args) {
        Suscripcion PSPlusEssential = new Suscripcion("Essential", 40, "Anual");
        Suscripcion PSPlusExtra = new Suscripcion("Extra", 5, "Mensual");
        Suscripcion PSPlusPremium = new Suscripcion("Premium", 120, "Anual");

        Cliente cliente01 = new Cliente(195038472, "Alonso", "Quesada Víquez", "Masculino", "Costa Rica");
        Cliente cliente02 = new Cliente(129174632, "Eleanor", "Allister Henriett", "Inglaterra");
        Cliente cliente002 = new Cliente(129174632, "Elena", "A. Henriett", "Inglaterra");
        Cliente cliente03 = new Cliente(123750193, "Joaquín", "Matamoros Obregon", "Masculino", "Guatemala");

        cliente01.suscribirse(PSPlusEssential);
        cliente02.suscribirse(PSPlusPremium);
        cliente03.suscribirse(new Suscripcion("Extra", 60, "Anual"));

        if (cliente02.equals(cliente002)) {
            System.out.println("\n");
            System.out.println("Error: cliente con cédula " + cliente02.getCedula() + " ya existe.");
            System.out.println("Por favor ingrese en su cuenta");
        } else {
            System.out.println("Cliente no existente");
        }
    }
}
