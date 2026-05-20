package Lucena.ExemploProva.Entities;

public class Bolinhas {
    // ATRIBUTOS
    private int capMax;
    private int pesoMin;
    private int pesoMax;
    private int quantidade;
    private int peso;

    // CONSTRUTOR
    public Bolinhas(int capMax, int pesoMin, int pesoMax) {
        this.capMax = capMax;
        this.pesoMin = pesoMin;
        this.pesoMax = pesoMax;
    }

    // GET
    public int getCapMax() {
        return capMax;
    }
    public int getPesoMin() {
        return pesoMin;
    }
    public int getPesoMax() {
        return pesoMax;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public int getPeso() {
        return peso;
    }

    // MÉTODOS
    public boolean entrar(int peso) {
        if (peso >= pesoMin && peso <= pesoMax) {
            this.peso += peso;
            this.quantidade += 1;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isCheia() {
        if (this.quantidade == capMax) {
            return true;
        }
        else {
            return false;
        }
    }

    public void sair() {
        this.quantidade -= 1;
    }

    public int pesoTotal() {
        return peso;
    }
}
