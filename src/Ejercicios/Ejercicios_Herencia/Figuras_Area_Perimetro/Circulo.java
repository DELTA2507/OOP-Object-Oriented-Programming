package Ejercicios.Ejercicios_Herencia.Figuras_Area_Perimetro;

public class Circulo extends Figura {
    private double diametro;
    private double radio;

    public Circulo(String nombre, int diametro) {
        super(nombre);
        this.diametro = diametro;
        this.radio = diametro / 2;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularPerimetro() {
        return diametro * 3.14;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (Math.pow(radio, 2));
    }
}
