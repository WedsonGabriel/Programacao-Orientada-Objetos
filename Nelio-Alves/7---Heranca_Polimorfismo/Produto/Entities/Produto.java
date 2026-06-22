package Entities;

public class Produto {
    // ATRIBUTOS
    private String nome;
    private Double preco;

    // CONSTRUTOR
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // GET E SET
    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // MÉTODOS
    public String tagValor() {
        return this.nome + " $ " + String.format("%.2f", this.preco);
    }

    @Override
    public String toString() {
        return tagValor();
    }
}
