package Util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double quantidade, double valorDolar) {
        return quantidade * valorDolar * (1.0 + IOF);
    }
}