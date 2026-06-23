package Prova3.SistemaDeFormasGeometricas;

public class Circulo extends Forma{
    // ATRIBUTOS
    private Double raio;

    // CONSTRUTORES
    public Circulo(){}
    public Circulo(Double raio) {
        super();
        this.raio = raio;
    }

    // GET E SET
    public Double getRaio() {
        return raio;
    }
    public void setRaio(Double raio) {
        this.raio = raio;
    }

    // MÉTODOS
    @Override
    public Double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
