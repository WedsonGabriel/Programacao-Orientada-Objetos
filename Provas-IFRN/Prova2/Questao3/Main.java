package Application;
import Entities.SensorTemperatura;
import java.util.Locale;

public class Questao3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        SensorTemperatura temp = new SensorTemperatura(30.0);
        temp.registrar(25.0);
        temp.registrar(35.0);

        System.out.println("Quantidade de medições: " + temp.getQuantidadeMedicoes());
        System.out.println("Temperatura inicial: " + temp.getTemperaturaAtual());
        System.out.println("Menor temperatura: " + temp.getMenorTemperatura());
        System.out.println("Maior temperatura: " + temp.getMaiorTemperatura());
        System.out.println("Média de temperatura: " + temp.getMedia());
    }
}