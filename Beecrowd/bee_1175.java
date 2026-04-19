import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] listNumbers = new int[20];
        for (int i = 0; i < listNumbers.length; i++) {
            int number = read.nextInt();
            listNumbers[i] = number;
        }

        for (int j = 0; j < listNumbers.length / 2; j++) {
            int temp = listNumbers[j];
            int indiceOposto = (listNumbers.length - 1) - j;

            listNumbers[j] = listNumbers[indiceOposto];
            listNumbers[indiceOposto] = temp;

        }

        for (int w = 0; w < listNumbers.length; w++) {
            System.out.println("N[" + w + "] = " + listNumbers[w]);
        }
        read.close();
    }
}
