/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06_condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        double number = read.nextDouble();
        String resultado = "";

        if (number < 0) {
            resultado = "Fora do intervalo";
        }
        else if (number <= 25) {
            resultado = "Intervalo [0,25]";
        }
        else if (number <= 50) {
            resultado = "Intervalo [25,50]";
        }
        else if (number <= 75) {
            resultado = "Intervalo [50,75]";
        }
        else if (number <= 100) {
            resultado = "Intervalo [75,100]";
        }
        else {
            resultado = "Fora do intervalo";
        }

        System.out.println(resultado);

        read.close();

    }
}
