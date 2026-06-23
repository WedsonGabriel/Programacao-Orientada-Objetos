package Prova3.SistemaDeFuncionarios;

public class Comissionado extends Funcionario{
    private Double vendas;

    // CONSTRUTORES
    public Comissionado(){}
    public Comissionado(String nome, Double salarioBase, Double vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    // GET E SET
    public Double getVendas() {
        return vendas;
    }
    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    // MÉTODOS
    @Override
    public double calcularSalario() {
        return salarioBase + (0.10 * vendas);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
