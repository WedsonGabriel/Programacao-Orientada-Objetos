import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int puloSapo = read.nextInt(), qtd_canos = read.nextInt();
        int[] alturaCanos = new int[qtd_canos];
        boolean resultado = true;

        for (int i = 0; i < qtd_canos; i++) {
            alturaCanos[i] = read.nextInt();
        }

        for (int j = 0; j < alturaCanos.length - 1; j++) {
            int diferenca = Math.abs(alturaCanos[j+1] - alturaCanos[j]);

            if (diferenca > puloSapo) {
                resultado = false;
                break;
            }
        }

        if (resultado == true) {
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("GAME OVER");
        }
        read.close();
    }
}
