/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que
recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário,
com duas casas decimais.
*/


import java.util.Locale;
import java.util.Scanner;

public class Exercicio04_sequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int number = read.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas desse funcionário: ");
        int horas = read.nextInt();

        System.out.print("Digite quanto esse funcionário ganha por hora trabalhada: ");
        double ganhoHora = read.nextDouble();


        double salario = ganhoHora * horas;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        read.close();
    }
}
