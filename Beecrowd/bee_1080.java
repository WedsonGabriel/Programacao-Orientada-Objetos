/*
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = read.nextInt();
        }

        int maior = array[0];
        int indice = 1;

        for (int i = 0; i < 100; i++) {
            if (array[i] > maior) {
                maior = array[i];
                indice = i + 1;
            }
        }

        System.out.println(maior);
        System.out.println(indice);

        read.close();
    }
}
