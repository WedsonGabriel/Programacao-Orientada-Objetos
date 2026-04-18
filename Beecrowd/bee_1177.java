import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int sequencia = read.nextInt();
        int[] lista = new int[1000];
        int contador = 0;

        for (int i = 0; i < 1000; i++) {
            lista[i] = contador;
            System.out.println("N[" + i + "] = " + lista[i]);
            contador += 1;

            if (contador == sequencia) {
                contador = 0;
            }
        }
        read.close();
    }
}
