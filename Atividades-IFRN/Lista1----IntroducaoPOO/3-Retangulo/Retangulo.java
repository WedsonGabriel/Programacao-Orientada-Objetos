package Lucena.Atividade1.Entities;

public class Retangulo {
    // ATRIBUTOS
    private double base;
    private double altura;

    // CONSTRUTOR
    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // GET E SET
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
        else {
            this.base = 0;
        }
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
        else {
            this.altura = 0;
        }
    }

    // MÉTODOS
    public double area() {
        return (this.base * this.altura);
    }

    public double diagonal() {
        double b2 = Math.pow(this.base, 2);
        double a2 = Math.pow(this.altura, 2);
        double sum_b2a2 = b2 + a2;
        double diagonal = Math.sqrt(sum_b2a2);
        return diagonal;
    }

    @Override
    public String toString() {
        return "Base = " + this.base + "\n"
                + "Altura = " + this.altura + "\n"
                + "Área = " + area() + "\n"
                + "Diagonal = " + String.format("%.1f", diagonal());
    }
}


