/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma
pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa
terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável
pelos cálculos.

- ENTRADA:                                                      - SAÍDA:
  Qual é o preço do dólar? 3.10                                   Valor a ser pago em reais = 657.20
  Quantos doláres serão comprados? 200.00
*/

package Programa;

import Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o preço do dólar? ");
        double valorDolar = sc.nextDouble();
        System.out.print("uantos doláres serão comprados? ");
        double quantiaDolar = sc.nextDouble();

        double valorGastoReais = CurrencyConverter.dollarToReal(quantiaDolar, valorDolar);

        System.out.printf("Valor a ser pago em reais = %.2f ", valorGastoReais);

        sc.close();
    }
}
