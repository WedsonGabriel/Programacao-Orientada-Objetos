/*
Leia vários pares de números inteiros (X e Y). Para cada par, calcule a soma de todos os números pares entre eles
(Inclusive, se forem pares).
O programa deve parar quando X for igual a Y.
*/

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            int x = read.nextInt(), y = read.nextInt();

            if (x == y) {
                break;
            }
            else {
                int somador = 0;
                for (int i = x; i <= y; i++) {
                    if (i % 2 == 0) {
                        somador += i;
                    }
                }
                System.out.println(somador);
            }
        }
        read.close();
    }
}