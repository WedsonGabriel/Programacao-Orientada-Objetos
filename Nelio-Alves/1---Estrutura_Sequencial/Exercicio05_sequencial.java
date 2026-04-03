/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_sequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int cod_p1 = read.nextInt();
        int qtd_p1 = read.nextInt();
        double valor_p1 = read.nextDouble();

        int cod_p2 = read.nextInt();
        int qtd_p2 = read.nextInt();
        double valor_p2 = read.nextDouble();

        double valor_total = (qtd_p1 * valor_p1) + (qtd_p2 * valor_p2);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valor_total);

        read.close();
    }
}
