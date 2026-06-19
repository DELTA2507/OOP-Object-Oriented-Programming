package Ejercicios.Ejercicios_Herencia.Figuras_Area_Perimetro;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
