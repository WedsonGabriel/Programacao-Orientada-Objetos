package Lucena.ExemploProva.Entities;

public class Acumulador {
    private int valor;

    public Acumulador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void inserir(int valor) {
        this.valor += valor;
    }

    public void remover(int valor) {
        this.valor -= valor;
    }
}
