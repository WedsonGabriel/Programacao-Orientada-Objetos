package Prova3.SistemaDeFormasGeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainForma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> Shape = new ArrayList<>();
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o tipo da forma: ");
            char tipo = sc.next().charAt(0);

            if (tipo == 'C') {
                System.out.print("Digite o raio: ");
                double raio = sc.nextDouble();

                Shape.add(new Circulo(raio));
            }
            if (tipo == 'R') {
                System.out.print("Digite largura e altura: ");
                double largura = sc.nextDouble(), altura = sc.nextDouble();

                Shape.add(new Retangulo(largura, altura));
            }
        }

        double areaTotal = 0.00;
        double perimetroTotal = 0.00;
        for (Forma ap : Shape) {
            areaTotal += ap.area();
            perimetroTotal += ap.perimetro();
        }

        System.out.printf("Área total = %.2f%n", areaTotal);
        System.out.printf("Perímetro total = %.2f%n", perimetroTotal);

        System.out.println();

        System.out.println("Lista de formas:");
        for (Forma imp : Shape) {
            System.out.println(imp);
        }

        sc.close();
    }
}
