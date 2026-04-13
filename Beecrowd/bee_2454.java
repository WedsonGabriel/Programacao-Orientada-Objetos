import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int P = read.nextInt(), R = read.nextInt();
        char resultado = ' ';

        if (P == 0 && R == 0) {
            resultado = 'C';
        }
        else if (P == 0 && R == 1) {
            resultado = 'C';
        }
        else if (P == 1 && R == 0) {
            resultado = 'B';
        }
        else if (P == 1 && R == 1) {
            resultado = 'A';
        }

        System.out.println(resultado);

        read.close();
    }
}
