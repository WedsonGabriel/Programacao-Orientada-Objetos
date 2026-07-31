package Application;
import Entities.ContaEnergia;
import java.util.Locale;


public class Questao1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ContaEnergia CE = new ContaEnergia("Maria", 120.0, 5.0);
        System.out.println(CE.resumo());
    }
}