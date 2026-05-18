package Entities;

public class ControleDeAcesso {
    private final int matricula;
    private String nome;

    public ControleDeAcesso (int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Matrícula: " + this.matricula + ", " + "Nome: " + this.nome;
    }
}
