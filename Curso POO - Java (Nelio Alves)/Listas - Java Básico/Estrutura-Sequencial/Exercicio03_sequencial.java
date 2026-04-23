/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class Exercicio03_sequencial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int A = read.nextInt();

        System.out.print("Informe o valor de B: ");
        int B = read.nextInt();

        System.out.print("Informe o valor de C: ");
        int C = read.nextInt();

        System.out.print("Informe o valor de D: ");
        int D = read.nextInt();


        int diferenca = (A * B) - (C * D);

        System.out.println("DIFERENÇA = " + diferenca);

        read.close();
    }
}
