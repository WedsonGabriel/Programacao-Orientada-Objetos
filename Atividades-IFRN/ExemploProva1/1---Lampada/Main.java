/*
Crie a classe Lampada com a seguinte estrutura:
	Atributos:
        boolean acesa,
        int potencia
	Métodos:
        void acender(),
        void apagar(),
        boolean estaAcesa()
        int getPotencia
	Construtores:
		Lampada(int potencia)
		Lampada(int potencia, int boolean acesa)
*/

package Lucena.ExemploProva.Application;
import Lucena.ExemploProva.Entities.Lampada;
import java.util.Scanner;

public class Questao1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int potencia = sc.nextInt();
        boolean acesa = sc.nextBoolean();
        Lampada lampada = new Lampada(potencia, acesa);

        System.out.println(lampada.getPotencia());
        System.out.println(lampada.estaAcesa());

        sc.close();
    }
}
