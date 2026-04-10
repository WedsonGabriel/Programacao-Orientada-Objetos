/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/

package exercicios_while;
import java.util.Scanner;

public class Exercicio02_while {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        int y = read.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
                x = read.nextInt();
                y = read.nextInt();
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
                x = read.nextInt();
                y = read.nextInt();
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
                x = read.nextInt();
                y = read.nextInt();
            }
            else if (x > 0 && y < 0){
                System.out.println("Quarto");
                x = read.nextInt();
                y = read.nextInt();
            }
        }
        read.close();
    }

}
