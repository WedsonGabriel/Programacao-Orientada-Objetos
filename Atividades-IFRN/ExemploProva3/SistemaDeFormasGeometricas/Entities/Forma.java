package Prova3.SistemaDeFormasGeometricas;

public abstract class Forma {
    // CONSTRUTOR
    public Forma(){}

    // MÉTODOS
    public abstract Double area();
    public abstract Double perimetro();

    @Override
    public String toString() {
        return "Forma[area=" + String.format("%.2f", area()) + ", perimetro=" +String.format("%.2f", perimetro()) + "]";
    }
}
