package Excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese un entero positivo: ");
        int numero = Integer.parseInt(br.readLine());

        while (true) {
            try {
                if (numero < 0) {
                    System.out.println("El dato ingresado no es un entero positivo");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato ingresado no es un entero válido");
                System.out.println(e.getMessage());
            }

        }

        // Pares numero -> 0
        for (int c = numero; c >= 0; c--) if (c % 2 == 0) System.out.println(c + " ");

        // Pares 0 -> numero
        for (int c = 0; c <= numero; c++) if (c % 2 == 0) System.out.println(c + " ");
    }
}
