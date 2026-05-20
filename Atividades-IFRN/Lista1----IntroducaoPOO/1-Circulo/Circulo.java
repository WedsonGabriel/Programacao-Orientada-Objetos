package Lucena.Atividade1.Entities;

public class Circulo {
    private double raio;
    private final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getPI() {
        return PI;
    }

    public double area() {
        return PI * Math.pow(raio, 2);
    }

    public double circunferencia() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return "ÁREA = " + String.format("%.2f", area())
                + "\n"
                + "CIRCUNFERENCIA = " +String.format("%.2f", circunferencia());
    }
}



