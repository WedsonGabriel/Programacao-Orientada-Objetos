package Prova3.SistemaDeFormasGeometricas;

public class Retangulo extends Forma {
    // ATRIBUTOS
    private Double largura;
    private Double altura;

    // CONSTRUTORES
    public Retangulo(){}
    public Retangulo(Double largura, Double altura) {
        super();
        this.largura = largura;
        this.altura = altura;
    }

    // GET E SET
    public Double getAltura() {
        return altura;
    }
    public Double getLargura() {
        return largura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }

    // MÉTODOS
    @Override
    public Double area() {
        return largura * altura;
    }

    @Override
    public Double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
