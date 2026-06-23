package Prova3.SistemaDeFuncionarios;

public abstract class Funcionario {
    // ATRIBUTOS
    protected String nome;
    protected Double salarioBase;

    // CONSTRUTORES
    public Funcionario() {
    }
    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // GET E SET
    public String getNome() {
        return nome;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // MÉTODOS
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario[nome=" + this.nome + ", salarioFinal=" + String.format("%.2f", calcularSalario()) + "]";
    }
}
