import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qtd_testes = read.nextInt();

        for (int i = 0; i < qtd_testes; i++) {
            int qtd_instrucoes = read.nextInt();
            read.nextLine();

            int[] lista = new int[qtd_instrucoes + 1];
            int posicao_final = 0;

            for (int j = 1; j <= qtd_instrucoes; j++) {
                String comando = read.nextLine();
                if (comando.equals("LEFT")) {
                    lista[j] = -1;
                }
                else if (comando.equals("RIGHT")) {
                    lista[j] = 1;
                }
                else {
                    String[] sameAs = comando.split(" ");
                    int indice_sameAs = Integer.parseInt(sameAs[2]);
                    lista[j] = lista[indice_sameAs];
                }
                posicao_final += lista[j];
            }
            System.out.println(posicao_final);
        }
        read.close();
    }
}
