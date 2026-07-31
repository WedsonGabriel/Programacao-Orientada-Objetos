package CadastroDePessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();

        pessoa.add(new Aluno("Wedson", "777.777.777-77", "20252014040003", "TADS"));
        pessoa.add(new Aluno("Júlio", "666.666.666-66", "20242014040015", "Redes"));
        pessoa.add(new Professor("Lucena", "222.222.222-22", "34567245", "Programação Orientada a Objetos"));
        pessoa.add(new Professor("Braulio", "333.333.333-33", "45693201", "Arquitetura de Computadores"));

        for (Pessoa p : pessoa) {
            System.out.println(p);
            System.out.println();
        }
    }
}
