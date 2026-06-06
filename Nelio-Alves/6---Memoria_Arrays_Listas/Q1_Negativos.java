/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números
inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos
lidos.
*/

package Application;
import java.util.Scanner;

public class Q1_Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int j = 0; j < n; j++) {
            if (numbers[j] < 0) {
                System.out.println(numbers[j]);
            }
        }
        sc.close();
    }
}
