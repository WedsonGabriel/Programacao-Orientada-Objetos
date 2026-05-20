/*
A classe deve calcular o delta e as raízes de uma equação do segundo grau, com base nos coeficientes a, b e c de uma equação
ax2 + bx + c = 0. O construtor da classe recebe os valores iniciais dos atributos. Os métodos de acesso podem alterar e recuperar
esses valores. O método delta retorna o valor do delta usado no cálculo das raízes. O método raizesReais deve retornar um array
com as raízes reais, caso tenha. O método toString deve retornar um texto com os atributos do objeto (ax2 + bx + c = 0).
*/

package Lucena.Atividade1.Application;
import Lucena.Atividade1.Entities.Bhaskara;
import java.util.Locale;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        Bhaskara bhaskara = new Bhaskara(a, b, c);

        System.out.println(bhaskara);
        sc.close();
    }
}
