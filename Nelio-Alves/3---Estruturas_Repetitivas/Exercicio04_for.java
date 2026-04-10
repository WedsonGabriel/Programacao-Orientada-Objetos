/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

package exercicios_for;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();

        for (int i = 0; i < N; i++ ) {
            int number1 = read.nextInt();
            int number2 = read.nextInt();

            if (number2 == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                double div = (double)number1 / number2;
                System.out.println(div);
            }
        }
        read.close();
    }
}
