package CadastroDePessoas;

public class Pessoa {
    // ATRIBUTOS
    protected String nome;
    protected String cpf;

    // CONSTRUTORES
    public Pessoa(){}
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    // MÉTODOS
    public String exibirDados() {
        return "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf;
    }

    @Override
    public String toString() {
        return exibirDados();
    }
}
