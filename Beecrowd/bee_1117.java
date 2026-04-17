/*
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double soma = 0;
        int notasValidas = 0;

        while (notasValidas < 2) {
            double nota = read.nextDouble();

            if (nota < 0.00 || nota > 10.0) {
                System.out.println("nota invalida");
            }
            else {
                soma += nota;
                notasValidas += 1;
            }
        }
        double media = soma / 2.0;
        System.out.printf("media = %.2f%n", media);
        read.close();
    }
}
