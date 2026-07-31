package SistemaDeBiblioteca;

public class Autor {
    private String nome;
    private String nacionalidade;


    public Autor(){}
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Autor: " + this.nome + "\n"
                + "Nacionalidade: " + this.nacionalidade;
    }
}
