package Prova3.SistemaDeFuncionarios;

public class Assalariado extends Funcionario{
    public Assalariado(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
