/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do
aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos
pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma
classe Student para resolver este problema.

- ENTRADA:                      - SAÍDA:
  Alex Green                      FINAL GRADE = 90.00
  27.00                           PASS
  31.00
  32.00

- ENTRADA:                      - SAÍDA:
  Alex Green                      FINAL GRADE = 52.00
  17.00                           FAILED
  20.00                           MISSING 8.00 POINTS
  15.00
*/

package Programa;
import Entities.Estudante;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.println(estudante);

        sc.close();
    }
}
