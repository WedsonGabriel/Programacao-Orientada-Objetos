/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida,
mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário
com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar
novamente os dados do funcionário. Use a classe projetada abaixo.

- ENTRADA:                                                  - SAÍDA:
  Nome: Joao Silva                                            Funcionario: Joao Silva, $ 5000.00
  Salario Bruto: 6000.00                                      Qual a porcentagem de aumento salarial? 10.0
  Imposto: 1000.00                                            Dados atualizados: Joao Silva, $ 5600.00
*/

package Programa;
import Entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();
        funcionario.salarioAumentado(porcentagem);

        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }
}
