/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

package exercicios_for;
import java.util.Scanner;

public class Exercicio05_for {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();
        int fatorial = 1;

        for (int i = N; i > 0; i--) {
            fatorial = fatorial * i;

        }
        System.out.println(fatorial);
        read.close();
    }
}
