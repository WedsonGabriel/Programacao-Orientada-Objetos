/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06_sequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        double pi = 3.14159;

        double area_TrianguloRetangulo = (A * C) / 2;
        double area_circulo = pi * Math.pow(C, 2);
        double area_trapezio = ((A + B) * C) / 2;
        double area_quadrado = B * B;
        double area_retangulo = A * B;

        System.out.printf("TRIÂNGULO = %.3f %n", area_TrianguloRetangulo);
        System.out.printf("CÍRCULO = %.3f %n", area_circulo);
        System.out.printf("TRAPÉZIO = %.3f %n", area_trapezio);
        System.out.printf("QUADRADO = %.3f %n", area_quadrado);
        System.out.printf("RETÂNGULO = %.3f %n", area_retangulo);

        read.close();
    }
}
