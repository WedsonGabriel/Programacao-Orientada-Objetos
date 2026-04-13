import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int diasDeVida = read.nextInt();

        int ano = diasDeVida / 365;
        int restoAno = diasDeVida % 365;

        int meses = restoAno / 30;
        int dias = restoAno % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        read.close();
    }
}
