/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
deste círculo com quatro casas decimais conforme exemplos.

Fórmula da área: area = π . raio2

Considere o valor de π = 3.14159
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_sequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Aponta que o padrão de digitação será americana
        Scanner read = new Scanner(System.in); // Cria o Scanner

        System.out.print("Digite o valor do raio: "); // Imprime um comando para o usuário realizar uma ação
        double raio = read.nextDouble(); // Solicita o valor do raio ao usuário

        double pi = 3.14159; // Informa o valor de pi

        double area = pi * Math.pow(raio, 2); // Variável que armazena a fórmula da área do círculo

        System.out.printf("A=%.4f %n", area); // Imprime o valor da área do círculo

        read.close(); // Fecha o Scanner
    }
}
