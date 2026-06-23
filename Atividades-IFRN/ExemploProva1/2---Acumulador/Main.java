/*
Crie a classe Acumulador para ser usada no programa a seguir:

package br.edu.ifrn.poo.prova3;

public class Principal {
  public static void println(Object o){
    System.out.println(o);
  }

  public static void(String[] args){
    // Criação de um contador com o valor inicial
    Acumulador acumulador = new Acumulador(10);
    // Verificar o valor atual do contador
    println(acumulador.getValor());   // 10
    // Adicionar
    acumulador.inserir(2);
    // Remover
    acumulador.retirar(1);
    println(acumulador.getValor());  // 11
  }        
}
*/

package Lucena.ExemploProva.Application;
import Lucena.ExemploProva.Entities.Acumulador;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial do contador: ");
        int valorInicial = sc.nextInt();
        Acumulador count = new Acumulador(valorInicial);

        System.out.print("Quanto deseja adicionar? ");
        int adicionar = sc.nextInt();
        count.inserir(adicionar);

        System.out.print("Quanto deseja remover? ");
        int remover = sc.nextInt();
        count.remover(remover);

        System.out.println("Valor do contador atual: " + count.getValor());
        sc.close();
    }
}
