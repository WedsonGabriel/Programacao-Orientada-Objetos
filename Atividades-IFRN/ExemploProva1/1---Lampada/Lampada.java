package Lucena.ExemploProva.Entities;

public class Lampada {
    private boolean acesa;
    private int potencia;

    public Lampada(int potencia) {
        this.potencia = potencia;
    }
    public Lampada(int potencia, boolean acesa) {
        this.acesa = !acesa;
        this.potencia = potencia;
    }

    public void acender() {
        if (!acesa) {
            acesa = true;
        }
    }

    public void apagar() {
        if (acesa) {
            acesa = false;
        }
    }

    public boolean estaAcesa() {
        return acesa;
    }

    public int getPotencia() {
        return potencia;
    }
}
