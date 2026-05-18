/*
Um relógio inteligente (Smartwatch) monitora a meta de passos diária e os passos dados pelo usuário. Ao criar o perfil,
o usuário deve informar seu nome e a sua meta de passos (ex: 10.000). Os passos dados sempre começam em zero.
Crie um comportamento chamado caminhar(int passos). Cada vez que o usuário caminha, o valor é somado aos passos dados.
Se o total de passos atingir ou ultrapassar a meta, o relógio deve emitir um aviso de "Meta Atingida".
Lembre-se: o total de passos dados não pode receber números negativos.
*/

package Application;
import Entities.Smartwatch;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        System.out.print("Digite a meta diária de passos: ");
        int meta = sc.nextInt();

        Smartwatch smartwatch = new Smartwatch(nome, meta);
        smartwatch.usuario(); // Mostra as estatísticas atuais do usuário
        System.out.println();

        while (smartwatch.getPassosAtuais() < meta) {
            System.out.print("Qual a quantidade de passos da próxima caminhada? ");
            int passos = sc.nextInt();
            System.out.println("Iniciando caminhada de " + passos + " passos.");
            smartwatch.caminhar(passos); // Somador e verificador da quantidade de passos
            System.out.println();
        }

        sc.close();
    }
}
