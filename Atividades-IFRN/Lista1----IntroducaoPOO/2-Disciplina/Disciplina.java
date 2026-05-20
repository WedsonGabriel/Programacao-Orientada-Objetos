package Lucena.Atividade1.Entities;

public class Disciplina {
    private String disciplina;
    private double nota1;
    private double nota2;
    private double nota3;

    public Disciplina(String disciplina, double nota1, double nota2) {
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // GET E SET
    public String getDisciplina() {
        return disciplina;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // MÉTODOS
    public double mediaParcial() {
        double mediap = ((nota1 * 2) + (nota2 * 3)) / 5;
        return mediap;
    }

    public double mediaFinal() {
        if (mediaParcial() < 60) {
            double mediaf = (mediaParcial() + nota3) / 2;
            return mediaf;
        }
        return mediaParcial();
    }

    @Override
    public String toString() {
        if (mediaParcial() >= 60) {
            return "MÉDIA PARCIAL = " + mediaParcial();
        }
        else {
            return "MÉDIA PARCIAL = " + mediaParcial()
                    + "\n"
                    + "MÉDIA FINAL = " + mediaFinal();
        }
    }
}
