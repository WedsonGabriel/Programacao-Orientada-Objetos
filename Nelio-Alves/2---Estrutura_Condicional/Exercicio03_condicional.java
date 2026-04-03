/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/

import java.util.Scanner;

public class Exercicio03_condicional {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = read.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = read.nextInt();

        String resultado;

        if (A % B == 0 || B % A == 0) {
            resultado = "Sao Multiplos";
        }
        else {
            resultado = "Nao sao Multiplos";
        }

        System.out.println(resultado);

        read.close();
    }
}
