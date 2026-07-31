package SistemaDeBiblioteca;

public abstract class ItemBiblioteca extends Autor {
    // ATRIBUTOS
    protected String titulo;
    protected String codigo;

    // CONSTRUTORES
    public ItemBiblioteca(){}
    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return " ";
    }
}
