// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio01_condicional {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = read.nextInt();
        String resultado;

        if (number >= 0) {
            resultado = "NAO NEGATIVO";
        }
        else {
            resultado = "NEGATIVO";
        }

        System.out.println(resultado);

        read.close();
    }
}
