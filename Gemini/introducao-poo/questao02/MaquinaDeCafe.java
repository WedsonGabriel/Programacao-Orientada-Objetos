package Entities;

public class MaquinaDeCafe {
    // ATRIBUTOS
    private int nivelAgua;

    // CONSTRUTOR
    public MaquinaDeCafe() {
        this.nivelAgua = 0;
    }

    // ADICIONAR ÁGUA E FAZER CAFÉ
    public int getnivelAgua() {
        return nivelAgua;
    }

    public void adicionarAgua(int quantidade) {
        this.nivelAgua += quantidade;
    }

    public void fazerCafe() {
        if (this.nivelAgua >= 50) {
            this.nivelAgua -= 50;
            System.out.println("Café pronto! Nível de água restante: " + this.nivelAgua + " ml");
        } else {
            System.out.println("Erro: Água insuficiente para fazer café!");
        }
    }
}
