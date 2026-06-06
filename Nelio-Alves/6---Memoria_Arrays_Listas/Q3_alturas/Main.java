/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

package Application;
import Entities.Pessoa;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Q3_alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];
        int pessoaNumero = 1;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + pessoaNumero + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoa[i] = new Pessoa(nome, idade, altura);
            pessoaNumero += 1;
        }

        double soma = 0;
        int contador = 0;
        ArrayList<String> menor16 = new ArrayList<String>();

        for (int j = 0; j < n; j++) {
            soma += pessoa[j].getAltura();
            if (pessoa[j].getIdade() < 16) {
                contador += 1;
                menor16.add(pessoa[j].getNome());
            }
        }

        double media = soma / n;
        double porcentMenor16 = (menor16.size() * 100) / n;

        System.out.printf("Altura média = %.2f%n", media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentMenor16 + "%");

        if (menor16.size() != 0) {
            for (int k = 0; k < menor16.size(); k++) {
                System.out.println(menor16.get(k));
            }
        }
        sc.close();
    }
}
