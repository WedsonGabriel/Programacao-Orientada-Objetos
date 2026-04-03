/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

Código 1) Cachorro Quente - R$ 4,00
Código 2) X-Salada - R$ 4,50
Código 3) X-Bacon - R$ 5,00
Código 4) Torrada Simples - R$ 2,00
Código 5) Refrigerante - R$ 1,50
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = read.nextInt();

        System.out.print("Digite a quantidade desse item: ");
        int quantidade = read.nextInt();

        double resultado = 0;

        switch (codigo) {
            case 1:
                resultado = 4.00 * quantidade;
                break;
            case 2:
                resultado = 4.50 * quantidade;
                break;
            case 3:
                resultado = 5.00 * quantidade;
                break;
            case 4:
                resultado = 2.00 * quantidade;
                break;
            case 5:
                resultado = 1.50 * quantidade;
                break;
            default:
                System.out.println("Digite um código válido");
                return;
        }

        System.out.printf("Total: R$ %.2f %n", resultado);

        read.close();
    }
}
