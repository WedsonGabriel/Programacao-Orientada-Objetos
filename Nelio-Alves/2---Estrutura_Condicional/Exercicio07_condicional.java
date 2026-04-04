/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07_condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Informe o valor de x: ");
        double x = read.nextDouble();

        System.out.print("Informe o valor de y: ");
        double y = read.nextDouble();

        String resultado = "";

        if (x == 0 && y == 0) {
            resultado = "Origem";
        }
        else if (x > 0 && y > 0) {
            resultado = "Q1";
        }
        else if (x < 0 && y > 0) {
            resultado = "Q2";
        }
        else if (x < 0 && y < 0) {
            resultado = "Q3";
        }
        else if (x > 0 && y < 0) {
            resultado = "Q4";
        }
        else if (x == 0 && y != 0) {
            resultado = "Eixo Y";
        }
        else {
            resultado = "Eixo X"; // (x != 0 && y == 0)
        }

        System.out.println(resultado);

        read.close();
    }
}
