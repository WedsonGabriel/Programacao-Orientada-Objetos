/* 
Escrever a classe Retangulo de acordo com o diagrama. A classe deve ter como atributos: base (b) e altura (h) do retângulo.
O construtor da classe recebe os valores iniciais da base e altura do retângulo, que devem ser positivos. Os métodos setBase
e setAltura podem modificar os valores da base e da altura, respectivamente; os métodos getBase e getAltura retornam os valores
armazenados nos atributos; getArea e getDiagonal calculam a área e a diagonal do retângulo. O método toString deve retornar um
texto com os atributos do objeto.
*/

package Lucena.Atividade1.Application;
import Lucena.Atividade1.Entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println(retangulo);
        sc.close();
    }
}
