/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
*/

package exercicios_for;
import java.util.Scanner;

public class Exercicio01_for {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        read.close();
    }
}
