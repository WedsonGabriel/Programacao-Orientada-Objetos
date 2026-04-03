/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class Exercicio04_condicional {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o horário em que o jogo começou: ");
        int start = read.nextInt();

        System.out.print("Digite o horário em que o jogo terminou: ");
        int end = read.nextInt();

        int resultado = 0;

        if (start < end) {
            resultado = end - start; // Se o jogo começou e terminou no mesmo dia, o start é menor do que o end.
        }

        else {
            resultado = 24 - start + end; // Se o jogo começou em um dia e terminou no outro, subtrai a duração do primeiro dia por 24 horas e soma com o end - Duração do jogo no segundo dia.
        }

        System.out.println("O JOGO DUROU " + resultado + " HORA(S)");

        read.close();
    }
}
