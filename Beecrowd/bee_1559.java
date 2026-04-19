import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        if (!read.hasNextInt()) return;
        int qtd_testes = read.nextInt();
        
        for (int t = 0; t < qtd_testes; t++) {
            int[][] matriz = new int[4][4];
            boolean tem2048 = false;
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = read.nextInt();
                    if (matriz[i][j] == 2048) {
                        tem2048 = true;
                    }
                }
            }
            
            boolean down = false;
            boolean left = false;
            boolean right = false;
            boolean up = false;
            
            if (!tem2048) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (matriz[i][j] > 0) {
                            if (i < 3 && (matriz[i + 1][j] == 0 || matriz[i + 1][j] == matriz[i][j])) {
                                down = true;
                            }
                            if (j > 0 && (matriz[i][j - 1] == 0 || matriz[i][j - 1] == matriz[i][j])) {
                                left = true;
                            }
                            if (j < 3 && (matriz[i][j + 1] == 0 || matriz[i][j + 1] == matriz[i][j])) {
                                right = true;
                            }
                            if (i > 0 && (matriz[i - 1][j] == 0 || matriz[i - 1][j] == matriz[i][j])) {
                                up = true;
                            }
                        }
                    }
                }
            }
            
            StringBuilder saida = new StringBuilder();
            if (down) saida.append("DOWN ");
            if (left) saida.append("LEFT ");
            if (right) saida.append("RIGHT ");
            if (up) saida.append("UP ");
            
            if (saida.length() > 0) {
                System.out.println(saida.toString().trim());
            } else {
                System.out.println("NONE");
            }
        }
        
        read.close();
    }
}
