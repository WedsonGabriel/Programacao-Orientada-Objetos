package Application;
import Entities.Banco;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String conta = sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial? ");
        char resposta = sc.next().charAt(0);
        double saldo = 0.0;
        if (resposta == 'S') {
            System.out.print("Digite o valor do depósito inicial: ");
            saldo = sc.nextDouble();
        }
        Banco banco = new Banco(conta, nome, saldo);
        System.out.println(banco);

        System.out.print("Digite o valor do depósito: ");
        banco.deposito(sc.nextDouble());
        System.out.println(banco);

        System.out.print("Digite o valor do saque: ");
        banco.saque(sc.nextDouble());
        System.out.println(banco);

        sc.close();
    }
}
