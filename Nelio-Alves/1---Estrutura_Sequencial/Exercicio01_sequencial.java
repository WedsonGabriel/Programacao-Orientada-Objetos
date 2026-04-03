/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
soma desses números com uma mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class Exercicio01_sequencial {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int x = number.nextInt();

        System.out.print("Digite outro número: ");
        int y = number.nextInt();

        int soma = x + y;

        System.out.println("Soma = " + soma);

        number.close();
    }
}
