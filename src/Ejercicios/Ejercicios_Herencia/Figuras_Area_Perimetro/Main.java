package Ejercicios.Ejercicios_Herencia.Figuras_Area_Perimetro;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo", 10, 20);
        Circulo circulo1 = new Circulo("Circulo", 100);

        System.out.println("RECTÁNGULO:");
        System.out.println("Perímetro:" +rectangulo1.calcularPerimetro());
        System.out.println("Área:" +rectangulo1.calcularArea());

        System.out.print("\n");

        System.out.println("CÍRCULO:");
        System.out.println("Perímetro:" + circulo1.calcularPerimetro());
        System.out.println("Área:" + circulo1.calcularArea());
    }
}
