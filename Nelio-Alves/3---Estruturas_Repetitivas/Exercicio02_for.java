/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

package exercicios_for;

import java.util.Scanner;

public class Exercicio02_for {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();
        int X = 0;
        int in = 0;
        int out = 0;

        for (int i = 0; i < N ; i++) {
            X = read.nextInt();
            if (X >= 10 && X <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        read.close();
    }
}
