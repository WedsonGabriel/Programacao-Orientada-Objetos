package application;

import entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Informe o caminho do source.csv: ");
        String strSourceFile = sc.nextLine();
        File sourceFile = new File(strSourceFile);

        String folderPath = sourceFile.getParent();
        boolean success = new File(folderPath + "\\out").mkdir();

        String strSummaryFile = folderPath + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strSourceFile))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");

                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                listaProdutos.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(strSummaryFile))) {
                for (Produto line : listaProdutos) {
                    bw.write(line.getNome() + "," + String.format("%.2f", line.valorTotal()));
                    bw.newLine();
                }
                System.out.println(strSummaryFile + " CREATED");
            }
            catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}