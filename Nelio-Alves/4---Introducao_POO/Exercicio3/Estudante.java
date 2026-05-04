package Entities;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return (nota1 + nota2 + nota3);
    }

    public String resultado() {
        if (notaFinal() < 60.00) {
            return "FAILED";
        }
        else {
            return "PASS";
        }
    }

    public double falta() {
        if (resultado().equals("FAILED")) {
            return (60.00 - notaFinal());
        }
        return 0.0;
    }

    public String toString() {
        if (resultado().equals("PASS")) {
            return "FINAL GRADE = " + notaFinal()
                    + "\n"
                    + resultado();
        }
        else {
            return "FINAL GRADE = " + String.format("%.2f", notaFinal())
                    + "\n"
                    + resultado()
                    + "\n"
                    + "MISSING " + String.format("%.2f", falta()) + " pontos";
        }
    }
}