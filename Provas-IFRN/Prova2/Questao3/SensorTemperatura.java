package Entities;

public class SensorTemperatura {
    // ATRIBUTOS
    private double temperaturaAtual;
    private double menorTemperatura;
    private double maiorTemperatura;
    private int quantidadeMedicoes;
    private double somaTemperaturas;

    // CONSTRUTOR
    public SensorTemperatura(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        this.menorTemperatura = temperaturaAtual;
        this.maiorTemperatura = temperaturaAtual;
        this.somaTemperaturas = temperaturaAtual;
    }

    // GET
    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }
    public double getMenorTemperatura() {
        return menorTemperatura;
    }
    public double getMaiorTemperatura() {
        return maiorTemperatura;
    }
    public double getMedia() {
        return somaTemperaturas / (quantidadeMedicoes + 1);
    }
    public int getQuantidadeMedicoes() {
        return quantidadeMedicoes;
    }

    // MÉTODOS
    public void registrar (double temperatura) {
        if (temperatura < menorTemperatura) {
            this.somaTemperaturas += temperatura;
            this.quantidadeMedicoes += 1;
            this.menorTemperatura = temperatura;
        }
        else if (temperatura > maiorTemperatura) {
            this.somaTemperaturas += temperatura;
            this.quantidadeMedicoes += 1;
            this.maiorTemperatura = temperatura;
        }
        else if (temperatura == temperaturaAtual) {
            this.somaTemperaturas += temperatura;
            this.quantidadeMedicoes += 1;
            this.temperaturaAtual = temperatura;
            this.menorTemperatura = temperatura;
            this.maiorTemperatura = temperatura;
        }
    }
}