package Lucena.Atividade1.Entities;

public class Bhaskara {
    // ATRIBUTOS
    private int a;
    private int b;
    private int c;

    // CONSTRUTOR
    public Bhaskara(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // GET
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    // MÉTODOS
    public double delta() {
        return (double) (Math.pow(this.b, 2) - (4*a*c));
    }

    public double[] raizes() {
        double x1 = (-this.b + Math.sqrt(delta())) / (2 * this.a);
        double x2 = (-this.b - Math.sqrt(delta())) / (2 * this.a);
        double array[] = {x1, x2};
        return array;
    }

    @Override
    public String toString() {
        String resultado = "A = " + this.a + "\n"
                + "B = " + this.b + "\n"
                + "C = " + this.c + "\n" + "\n"
                + "Delta = " + delta() + "\n";

                if (delta() >= 0) {
                    resultado += "Raízes = " + java.util.Arrays.toString(raizes());
                }
                else {
                    resultado += "Raízes = Não possui raízes reais";
                }

                return resultado;
    }
}
