/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        // ENTRADAS
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();

        // FÓRMULAS
        double pi = 3.14159;
        double area_trianguloRetangulo = (a * c) / 2;
        double area_circulo = pi * Math.pow(c, 2);
        double area_trapezio = ((a + b) * c) / 2;
        double area_quadrado = b * b;
        double area_retangulo = a * b;

        // SAÍDA
        System.out.printf("TRIANGULO: %.3f%n", area_trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);

        // FECHAMENTO SCANNER
        read.close();
    }
}
