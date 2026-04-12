import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int maiorAB = (a + b + abs(a - b)) / 2;
        int maior = 0;

        if (maiorAB >= c) {
            maior = maiorAB;
        }
        else {
            maior = c;
        }

        System.out.println(maior + " eh o maior");

        read.close();
    }
}
