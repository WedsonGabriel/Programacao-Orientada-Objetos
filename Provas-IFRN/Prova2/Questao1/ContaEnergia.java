package Entities;

public class ContaEnergia {
    // ATRIBUTOS
    private String titular;
    private double consumoKwh;
    private double tarifaKwh;
    private boolean tarifaSocial;

    // CONSTRUTORES
    public ContaEnergia(String titular, double consumoKwh, double tarifaKwh) {
        this.titular = titular;
        setConsumoKwh(consumoKwh);
        setTarifaKwh(tarifaKwh);
    }
    public ContaEnergia(String titular, double consumoKwh, double tarifaKwh, boolean tarifaSocial) {
        this.titular = titular;
        setConsumoKwh(consumoKwh);
        setTarifaKwh(tarifaKwh);
        this.tarifaSocial = tarifaSocial;
    }

    // GET
    public String getTitular() {
        return titular;
    }
    public double getConsumoKwh() {
        return consumoKwh;
    }
    public double getTarifaKwh() {
        return tarifaKwh;
    }
    public boolean getTarifaSocial() {
        return tarifaSocial;
    }


    // SET
    public void setConsumoKwh(double consumoKwh) {
        if (consumoKwh >= 0.0) {
            this.consumoKwh = consumoKwh;
        }
        else {
            this.consumoKwh = 0;
        }
    }
    public void setTarifaKwh(double tarifaKwh) {
        if (tarifaKwh >= 0.0) {
            this.tarifaKwh = tarifaKwh;
        }
        else {
            this.tarifaKwh = 0.50;
        }
    }

    // MÉTODOS
    public double calcularValor() {
        if (possuiTarifaSocial()) {
            double valor = this.consumoKwh * this.tarifaKwh;
            double valorTarifaSocial = valor - (valor * 0.25);
            return valorTarifaSocial;
        }
        else {
            double valor = this.consumoKwh * this.tarifaKwh;
            return valor;
        }
    }

    public void adicionarConsumo(double valor) {
        if (valor >= 0) {
            this.consumoKwh += valor;
        }
        else {
            System.out.println("O valor não pode ser negativo");
        }
    }

    public boolean possuiTarifaSocial() {
        return this.tarifaSocial;
    }

    public String resumo() {
        return "Titular: " + this.titular + " | " + "Consumo: " + this.consumoKwh + " | " + "Valor: R$ " + calcularValor();
    }
}