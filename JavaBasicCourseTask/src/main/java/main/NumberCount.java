package main;

public class NumberCount {
    public static int p = 0;
    public static boolean firstSymbol = true;

    public static void numbersInEquation(char c, char prevChar) {
        if (firstSymbol && Character.isDigit(c)) {
            p++;
            firstSymbol = false;
        } else if (Character.isDigit(c) && !(Character.isDigit(prevChar)) && !(prevChar == '.')) {
            p++;
        }
    }
}