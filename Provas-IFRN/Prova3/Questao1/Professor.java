package CadastroDePessoas;

public class Professor extends Pessoa{
    // ATRIBUTOS
    private String siape;
    private String areaAtuacao;

    // CONSTRUTOR
    public Professor(){}
    public Professor(String nome, String cpf, String siape, String areaAtuacao) {
        super(nome, cpf);
        this.siape = siape;
        this.areaAtuacao = areaAtuacao;
    }

    // GETTERS
    public String getSiape() {
        return siape;
    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    // MÉTODOS
    @Override
    public String exibirDados() {
        return super.exibirDados() + "\n"
                + "Siape: " + this.siape + "\n"
                + "Área de atuação: " + this.areaAtuacao;
    }

    @Override
    public String toString() {
        return exibirDados();
    }
}
