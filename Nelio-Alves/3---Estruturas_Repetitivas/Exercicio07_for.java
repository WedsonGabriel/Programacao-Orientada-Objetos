/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/

package exercicios_for;

import java.util.Scanner;

public class Exercicio07_for {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado = (int)Math.pow(i, 2);
            int cubo = (int)Math.pow(i, 3);

            System.out.print(i + " ");
            System.out.print(quadrado + " ");
            System.out.println(cubo);
        }

        read.close();
    }
}
