/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/

package Application;
import java.util.Locale;
import java.util.Scanner;

public class Q2_somaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            soma += numbers[i];
        }

        System.out.print("VALORES = ");
        for (int j = 0; j < n; j++) {
            System.out.print(numbers[j] + " ");
        }

        double media = soma / n;
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MÉDIA = %.2f%n", media);

        sc.close();
    }
}
