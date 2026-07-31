package SistemaDeBiblioteca;

public class Revista extends ItemBiblioteca implements Emprestavel{
    public Revista(String titulo, String codigo, String nome, String nacionalidade) {
        super(titulo, codigo);
        setNome(nome);
        setNacionalidade(nacionalidade);
    }

    @Override
    public int diasEmprestimo(){
        return 7;
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
                + "Dados da revista: " + exibirDados();
    }
}

