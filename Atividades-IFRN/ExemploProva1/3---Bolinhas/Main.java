/*
Crie uma classe para monitorar a quantidade de crianças em uma piscina de bolinhas. Por questão de segurança a prefeitura
estabelece uma quantidade máxima de crianças dentro da piscina. Você deve criar uma classe para monitorar quantas crianças
estão dentro. A classe deve ter os seguintes métodos:
    boolean entrar(int peso)
    void sair()
    boolean isCheia()
    int getQuantidade()
    int pesoTotal()

No construtor deve ser informado a capacidade máxima da piscina e os pesos mínimos e máximos para entrar. A entrada só deve
ser permitida se a piscina não estiver cheia e se o peso da criança estiver dentro da faixa estabelecida. A lotação máxima
e a faixa de peso não podem ser alteradas. Crie uma classe principal para testar a classe Piscina.
*/

package Lucena.ExemploProva.Application;
import Lucena.ExemploProva.Entities.Bolinhas;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a capacidade máxima: ");
        int capMax = sc.nextInt();

        System.out.print("Informe o peso minímo: ");
        int pesoMin = sc.nextInt();

        System.out.print("Informe o peso máximo: ");
        int pesoMax = sc.nextInt();

        Bolinhas bolinhas = new Bolinhas(capMax, pesoMin, pesoMax);

        while (bolinhas.getQuantidade() < capMax) {
            System.out.print("Informe o peso: ");
            int peso = sc.nextInt();
            bolinhas.entrar(peso);

            System.out.print("A piscina tá cheia? ");
            System.out.println(bolinhas.isCheia());
        }

        System.out.println("A quantidade de crianças na piscina é: " + bolinhas.getQuantidade());
        System.out.println("O peso total da piscina é: " + bolinhas.pesoTotal() + "\n");

        System.out.print("Quantas crianças já devem sair? ");
        int sair = sc.nextInt();

        for (int i = 0; i < sair; i++) {
            bolinhas.sair();
        }

        System.out.println("A quantidade de crianças na piscina é: " + bolinhas.getQuantidade());

        sc.close();
    }
}
