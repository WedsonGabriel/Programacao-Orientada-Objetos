/*
A classe deve ter um atributo raio para armazenar a dimensão da figura e métodos para calcular sua área e sua circunferência.
Escrever um programa para testar a classe.
*/

package Lucena.Atividade1.Application;
import Lucena.Atividade1.Entities.Circulo;
import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        Circulo circulo = new Circulo(raio);

        System.out.println(circulo);
        sc.close();
    }
}
