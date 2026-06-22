package Entities;

public class ProdutoUsado extends Produto {
    // ATRIBUTOS
    private String dataFabricacao;

    // CONSTRUTOR
    public ProdutoUsado(String nome, Double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    // GET
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    // MÉTODOS
    @Override
    public String tagValor() {
        return getNome() + " (used) $ " + String.format("%.2f", getPreco()) + " (Data de fabricação: " + getDataFabricacao() + ")";
    }

    @Override
    public String toString() {
        return tagValor();
    }
}
