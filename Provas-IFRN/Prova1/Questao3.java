/*
Leia dois números inteiros e um caractere representando uma operação (+,-,*,/). Calcule e imprima o resultado. 

[EXEMPLO 1]
- Entrada: 10 2 *
- Saída: 20

[EXEMPLO 2]
- Entrada: 10 0 /
- Saída: Erro: Divisão por zero
*/

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt(), y = read.nextInt();
        char operador = read.next().charAt(0);
        int operacao = 0;

        if (operador == '+') {
            operacao = x + y;
            System.out.println(operacao);
        }
        else if (operador == '-') {
            operacao = x - y;
            System.out.println(operacao);
        }
        else if (operador == '*') {
            operacao = x * y;
            System.out.println(operacao);
        }
        else {
            if (y == 0) {
                System.out.println("Erro: divisao por zero");
            }
            else {
                operacao = x / y;
                System.out.println(operacao);
            }
        }
        read.close();
    }
}