package SistemaDeBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        List<Emprestavel> emprestavel = new ArrayList<>();
        List<Livro> autores = new ArrayList<>();

        emprestavel.add(new Livro("IT", "34567", "Stephen King", "Americano"));
        emprestavel.add(new Livro("Percy Jackson", "34567", "Rick Riordan", "Americano"));
        emprestavel.add(new Livro("Harry Potter", "34567", "JK Rowling", "Americana"));
        emprestavel.add(new Revista("Veja", "85956", "Lucena", "Brasileiro"));
        emprestavel.add(new Revista("Vogue", "85956", "People", "Americano"));

        for (Emprestavel emp : emprestavel) {
            System.out.println(emp);
            System.out.println();
        }
    }
}
