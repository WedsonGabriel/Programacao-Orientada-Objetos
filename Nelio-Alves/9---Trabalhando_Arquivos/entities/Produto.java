package entities;

public class Produto {
    // ATRIBUTOS
    private String nome;
    private double preco;
    private int quantidade;

    // CONSTRUTORES
    public Produto(){}
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // MÉTODOS
    public double valorTotal() {
        return (this.preco * this.quantidade);
    }

    @Override
    public String toString() {
        return this.nome + "," + this.preco + "," + this.quantidade;
    }
}


