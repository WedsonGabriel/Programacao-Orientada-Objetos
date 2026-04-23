/*
Leia 5 números inteiros e informe quantos deles são:
- Positivos
- Negativos
- Zero
*/

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i]= read.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int zero = 0;
        for (int j = 0; j < 5; j++) {
            if (numbers[j] == 0) {
                zero += 1;
            }
            else if (numbers[j] > 0) {
                positivos += 1;
            }
            else {
                negativos += 1;
            }
        }
        System.out.println("Positivos = " + positivos);
        System.out.println("Negativos = " + negativos);
        System.out.println("Zero = " + zero);
        read.close();
    }
}