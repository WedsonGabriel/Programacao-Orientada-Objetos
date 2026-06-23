package Prova3.SistemaDeFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> Funcionarios = new ArrayList<>();

        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            char tipo = sc.next().charAt(0);
            sc.nextLine();

            // Assalariado = a; Comissionado = c.
            if (tipo == 'a') {
                String nome = sc.nextLine();
                Double salarioBase = sc.nextDouble();
                Funcionarios.add(new Assalariado(nome, salarioBase));
            }
            if (tipo == 'c') {
                String nome = sc.nextLine();
                Double salarioBase = sc.nextDouble();
                Double vendas = sc.nextDouble();
                Funcionarios.add(new Comissionado(nome, salarioBase, vendas));
            }
        }

        for (Funcionario x : Funcionarios) {
            System.out.println(x);
        }

        Double maiorSalario = 0.00;
        String funcionarioMS = "";
        for (Funcionario m : Funcionarios) {
            if (m.calcularSalario() >= maiorSalario) {
                maiorSalario = m.calcularSalario();
                funcionarioMS = m.getNome();
            }
        }

        String trabalhador = "";
        for (Funcionario t : Funcionarios) {
            if (t.calcularSalario() > t.salarioBase) {
                trabalhador = "Comissionado";
            }
            else {
                trabalhador = "Assalariado";
            }
        }

        System.out.println("Maior salário: " + funcionarioMS + "(" + trabalhador + ")");

        sc.close();
    }
}
