package Entities;

public class Banco {
    // ATRIBUTOS
    private String conta;
    private String nome;
    private double saldo;

    // CONSTRUTOR
    public Banco(String conta, String nome, double saldo) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Banco(String conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    // GET
    public String getConta() {
        return conta;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }

    // SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    // MÉTODOS
    public void deposito(double valor) {
        if (valor <= 0.00) {
            System.out.println("Digite um valor válido");
        }
        this.saldo += valor;
    }

    public void saque(double valor) {
        if (valor <= 0.00) {
            System.out.println("Digite um valor válido");
        }
        this.saldo -= (valor + 5.00);
    }

    @Override
    public String toString() {
        return "\n" + "Dados atualizados: " + "\n"
                + "Conta: " + this.conta + ", "
                + "Proprietário: " + this.nome
                + ", " + "Saldo: " + String.format("%.2f",this.saldo) + "\n";
    }
}