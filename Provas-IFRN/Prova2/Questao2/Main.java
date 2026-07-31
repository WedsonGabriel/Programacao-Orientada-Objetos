package Application;
import Entities.CofreDigital;
import java.util.Locale;

public class Questao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CofreDigital cofre = new CofreDigital("Joao", 500);
        cofre.depositar(250);
        cofre.sacar(100);
        System.out.println(cofre.getSaldo());
        System.out.println(cofre.getQuantidadeOperacoes());
        System.out.println(cofre.getHistorico());
    }
}