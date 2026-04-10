/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/

package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();

        for (int i = 0; i < N; i++) {
            double nota1 = read.nextDouble();
            double nota2 = read.nextDouble();
            double nota3 = read.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("%.1f %n", media);
        }

        read.close();
    }
}
