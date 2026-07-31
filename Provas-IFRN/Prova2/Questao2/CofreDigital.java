package Entities;

public class CofreDigital {
    // ATRIBUTOS
    private String proprietario;
    private double saldo;
    private int quantidadeOperacoes;
    private String historico;

    // CONSTRUTOR
    public CofreDigital(String proprietario, double saldo) {
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    // GET
    public String getProprietario() {
        return proprietario;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }
    public String getHistorico() {
        return historico;
    }

    // MÉTODOS
    public void depositar(double valor) {
        if (valor <= 0.0) {
            System.out.println("O valor deve ser maior do que R$ 0.00");
        }
        else {
            this.historico = "DEPOSITO: " + valor + "\n";
            this.quantidadeOperacoes += 1;
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.historico += "SAQUE: " + valor + "\n";
            this.quantidadeOperacoes += 1;
            this.saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }
}