import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int qtd_testes = read.nextInt();

        for (int i = 0; i < qtd_testes; i++) {
            String valor = read.next();
            int contador = 0;
            for (char letra : valor.toCharArray()) {
                if (letra == '1') {
                    contador += 2;
                }
                else if (letra == '2') {
                    contador += 5;
                }
                else if (letra == '3') {
                    contador += 5;
                }
                else if (letra == '4') {
                    contador += 4;
                }
                else if (letra == '5') {
                    contador += 5;
                }
                else if (letra == '6') {
                    contador += 6;
                }
                else if (letra == '7') {
                    contador += 3;
                }
                else if (letra == '8') {
                    contador += 7;
                }
                else if (letra == '9') {
                    contador += 6;
                }
                else if (letra == '0') {
                    contador += 6;
                }
            }
            System.out.println(contador + " leds");
        }
        read.close();
    }
}
