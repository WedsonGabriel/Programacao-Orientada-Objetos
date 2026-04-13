/*
O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

Entrada
A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

Saída
A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a saída deve ser "MUTE".
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String texto = read.nextLine();
        char[] caracteres = texto.toCharArray();
        int contador = 0;

        for (int i = 0; i < caracteres.length; i++) {
            contador += 1;
        }

        if (contador <= 140) {
            System.out.println("TWEET");
        }
        else {
            System.out.println("MUTE");
        }

        read.close();
    }
}
