package Excepciones.EjercicioFormulaHeron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Una función que calcule el área de cualquier triángulo de acuerdo con la fórmula de Herón.
    // Si las medidas del triángulo no cumplen la restricción geométrica (hay alguna mayor que la suma
    // de las otras dos), la función debe lanzar (throw) una excepción que el resto del programa debe capturar
    // y manejar. La excepción lanzada debe ser una excepción personalizada. Agregar una rutina main()
    // dentro de la cual se solicite al usuario las tres medidas del triángulo y se calcule su área.
    // Realizar la validación completa, no solo de los datos al pedirlos, sino también del cálculo del área.

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        double ladoA = 0.0;
        double ladoB = 0.0;
        double ladoC = 0.0;
        double area = 0.0;

       while (area == 0) {
           try {
               System.out.println("Introduzca el primer lado: ");
               ladoA = Integer.parseInt(br.readLine());

               System.out.println("Introduzca el segundo lado: ");
               ladoB = Integer.parseInt(br.readLine());

               System.out.println("Introduzca el tercer lado: ");
               ladoC = Integer.parseInt(br.readLine());

               isTrianguloValido(ladoA, ladoB, ladoC);
               area = calcularFormulaHeron(ladoA, ladoB, ladoC);
               System.out.println("Área: " + area);
           } catch (NumberFormatException e) {
               System.out.println("Dato ingresado no es un entero válido");
               System.out.println(e.getMessage());
           } catch (TrianguloInvalidoExcepcion e) {
               System.out.println(e.getMessage());
           }
       }
    }

    public static double calcularFormulaHeron(double ladoA, double ladoB, double ladoC) {
        double s = (double) (ladoA + ladoB + ladoC) / 2;
        double heron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        return heron;
    }

    public static void isTrianguloValido(double ladoA, double ladoB, double ladoC) throws TrianguloInvalidoExcepcion{
        if (
                ladoA >= (ladoB + ladoC) ||
                ladoB >= (ladoA + ladoC) ||
                ladoC >= (ladoB + ladoA)
        ) {
            throw new TrianguloInvalidoExcepcion("Los lados introducidos no forman un Triángulo válido");
        }
    }
}