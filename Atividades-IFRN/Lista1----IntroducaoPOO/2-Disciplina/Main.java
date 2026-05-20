/*
A classe deve ter atributos para armazenar o nome da disciplina e as notas dos dois bimestres e da prova final. Os métodos
da classe devem permitir calcular a média parcial (com as notas bimestrais) e a média final (com todas as notas, caso o aluno
tenha ficado na prova final). Considere como média de aprovação o valor 60, notas de 0 a 100, média parcial ponderada com
pesos 2 e 3 e média final como a média aritmética da média parcial com a nota da prova final, caso o aluno não seja aprovado
por média.
Escrever um programa para testar a classe.

*/

package Lucena.Atividade1.Application;
import Lucena.Atividade1.Entities.Disciplina;
import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da disciplina: ");
        String disciplina = sc.nextLine();
        System.out.print("Digite a nota da primeira prova: ");
        double prova1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double prova2 = sc.nextDouble();

        Disciplina media = new Disciplina(disciplina, prova1, prova2);

        if (media.mediaParcial() < 60) {
            System.out.print("Digite a nota da terceira prova: ");
            double nota3 = sc.nextDouble();
            media.setNota3(nota3);
            System.out.println(media);
        }
        else {
            System.out.println(media);
        }
        sc.close();
    }
}
