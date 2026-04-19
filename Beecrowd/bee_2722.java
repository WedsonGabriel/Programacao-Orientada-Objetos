import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qtd_testes = read.nextInt();
        read.nextLine(); 

        for (int i = 0; i < qtd_testes; i++) {
            String linha1 = read.nextLine();
            String linha2 = read.nextLine();
            
            StringBuilder nomeFinal = new StringBuilder();
            int tamanhoMaximo = Math.max(linha1.length(), linha2.length());
            
            for (int j = 0; j < tamanhoMaximo; j += 2) {
                if (j < linha1.length()) {
                    int fim1 = Math.min(j + 2, linha1.length());
                    nomeFinal.append(linha1.substring(j, fim1));
                }
                
                if (j < linha2.length()) {
                    int fim2 = Math.min(j + 2, linha2.length());
                    nomeFinal.append(linha2.substring(j, fim2));
                }
            }
            
            System.out.println(nomeFinal.toString());
        }
        
        read.close();
    }
}
