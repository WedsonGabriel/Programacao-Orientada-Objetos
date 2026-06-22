package Entities;

public class ProdutoImportado extends Produto{
    // ATRIBUTOS
    private Double taxaAlfandega;

    // CONSTRUTOR
    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    // GET E SET
    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }
    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    // MÉTODOS
    public double precoTotal() {
        return getPreco() + this.taxaAlfandega;
    }

    @Override
    public String tagValor() {
        return getNome() + " " + "$ " + String.format("%.2f", precoTotal()) + " (Taxa de importação: " + String.format("%.2f", this.taxaAlfandega ) + ")";
    }

    @Override
    public String toString() {
        return tagValor();
    }
}
