package Entities;

public class Smartwatch {
    // ATRIBUTOS
    private int meta;
    private String nome;
    private int passosAtuais;

    // CONSTRUTOR
    public Smartwatch(String nome, int meta) {
        this.nome = nome;
        this.meta = meta;
        this.passosAtuais = 0;
    }

    // GET
    public int getMeta() {
        return meta;
    }

    public String getNome() {
        return nome;
    }

    public int getPassosAtuais() {
        return passosAtuais;
    }

    // MÉTODOS
    public void usuario() {
        System.out.println("Usuário: " + this.nome + " | " + "Meta: " + this.meta + " | "
                            + "Passos atuais: " + this.passosAtuais);
    }

    public int resta() {
        return this.meta - this.passosAtuais;
    }

    public void caminhar(int passos) {
        this.passosAtuais += passos;
        if (passosAtuais < meta) {
            System.out.println("Passos atuais: " + this.passosAtuais + "."
                    + " Faltam " + resta() + " passos para a meta.");
        }
        else {
            System.out.println("PARABÉNS! Meta atingida!");
            System.out.println("Passos atuais: " + this.passosAtuais);
        }
    }
}
