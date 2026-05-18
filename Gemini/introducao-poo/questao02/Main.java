/*
Você está programando o painel de uma máquina de café expresso. A máquina armazena o nível de água em mililitros (ml). 
Ao ligar a máquina (criar o objeto), ela sempre começa com 0 ml de água. O nível de água só pode ser modificado por dois
comportamentos: adicionarAgua(int quantidade) e fazerCafe(). Cada vez que a máquina faz um café, ela gasta exatamente
50 ml de água. Não é possível fazer café se não houver água suficiente (o sistema deve avisar).
*/

package Application;
import Entities.MaquinaDeCafe;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaDeCafe MC = new MaquinaDeCafe();

        System.out.println("Máquina ligada. Nível de água: " + MC.getnivelAgua() + " ml");


        int quantidade = sc.nextInt();
        MC.adicionarAgua(quantidade);
        System.out.println();
        System.out.println("Adicionando " + quantidade + " ml de água");
        System.out.println("Nível de água atualizado: " + MC.getnivelAgua() + " ml");
        System.out.println();

        System.out.println("Tentando fazer café...");
        MC.fazerCafe();
        System.out.println();

        System.out.println("Tentando fazer café...");
        MC.fazerCafe();
        System.out.println();

        System.out.println("Tentando fazer café...");
        MC.fazerCafe();
        
        sc.close();
    }
}
