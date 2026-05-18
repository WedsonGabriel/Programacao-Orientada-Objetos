/*
Em um sistema de academia, todo aluno possui uma matrícula (número inteiro) e um nome. Uma vez que o aluno é cadastrado,
o número da sua matrícula não pode ser alterado de jeito nenhum. Já o seu nome pode ser atualizado caso haja algum erro de
digitação. Crie um programa que cadastre o aluno, exiba os dados, altere o nome e exiba os dados novamente.
*/

package Application;
import Entities.ControleDeAcesso;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da matrícula: ");
        int matricula = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        ControleDeAcesso CDA = new ControleDeAcesso(matricula, nome);
        System.out.println("Dados do aluno:");
        System.out.println(CDA);

        System.out.print("Digite o novo nome para atualizar o cadastro: ");
        CDA.setNome(sc.nextLine());

        System.out.println("Dados atualizados: ");
        System.out.println(CDA);

        sc.close();
    }
}
