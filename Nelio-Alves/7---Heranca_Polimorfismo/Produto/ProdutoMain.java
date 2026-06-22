package Application;
import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int quantidade = sc.nextInt();

        Produto[] produto = new Produto[quantidade];
        int contador = 1;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Dados do produto " + contador + ": ");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char tipo = sc.next().charAt(0);

            sc.nextLine();
            if (tipo == 'c') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                produto[i] = new Produto(nome, preco);
            }

            if (tipo == 'u') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                sc.nextLine();

                System.out.print("Data de fabricação: ");
                String dataFabricacao = sc.nextLine();

                produto[i] = new ProdutoUsado(nome, preco, dataFabricacao);
            }

            if (tipo == 'i') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                System.out.print("Taxa de Alfândega: ");
                double taxaAlfandega = sc.nextDouble();

                produto[i] = new ProdutoImportado(nome, preco, taxaAlfandega);
            }

            contador++;
        }

        System.out.println();
        System.out.println("ETIQUE DE PREÇOS:");
        for (int j = 0; j < quantidade; j++) {
            System.out.println(produto[j]);
        }

        sc.close();
    }
}
