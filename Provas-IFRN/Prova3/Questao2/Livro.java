package SistemaDeBiblioteca;

public class Livro extends ItemBiblioteca implements Emprestavel{
    public Livro(String titulo, String codigo, String nome, String nacionalidade) {
        super(titulo, codigo);
        setNome(nome);
        setNacionalidade(nacionalidade);
    }

    public Livro(String nome, String nacionalidade) {
        setNome(nome);
        setNacionalidade(nacionalidade);
    }

    @Override
    public int diasEmprestimo(){
        return 14;
    }
    @Override
    public String exibirDados(){
        return "Título: " + getTitulo() + "\n"
                + "Código: " + getCodigo() + "\n"
                + "Nome do autor: " + getNome() + "\n"
                + "Nacionalidade: " + getNacionalidade();
    }

    @Override
    public String toString() {
        return "Dias de Empréstimo: " + diasEmprestimo() + "\n"
                + "Dados do livro: " + exibirDados();
    }
}
