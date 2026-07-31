package CadastroDePessoas;

public class Aluno extends Pessoa {
    // ATRIBUTOS
    private String matricula;
    private String curso;

    // CONSTRUTORES
    public Aluno(){}
    public Aluno(String nome, String cpf, String matricula, String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    // GETTERS
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }

    // MÉTODOS
    @Override
    public String exibirDados() {
        return super.exibirDados() + "\n"
                + "Matrícula: " + this.matricula + "\n"
                + "Curso: " + this.curso;
    }

    @Override
    public String toString() {
        return exibirDados();
    }
}
