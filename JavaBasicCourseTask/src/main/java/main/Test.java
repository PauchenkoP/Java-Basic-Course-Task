package main;

import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static boolean equationIsCorrect = true;

    public static void test() throws IOException {
        System.out.println("Make sure the keyboard layout is set to English");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();

        int j1 = 0;
        int j2 = 0;
        int k = 0;
        boolean t1 = true;
        boolean t2 = true;
        boolean t3 = false;
        char prevChar = '0';
        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);

            if (!(Character.isDigit(c) ||
                    c == '+' || c == '-' || c == '*' || c == '/'
                    || c == '(' || c == ')' || c == '=' || c == 'x' || c == '.')) {
                t1 = false;
            }

            if (!t3 && c == 'x') {
                t3 = true;
            }

            if ((c == '-') && (prevChar == '+' || prevChar == '*' || prevChar == '/')) {
                continue;
            } else if ((c == '+' || c == '-' || c == '*' || c == '/') && (prevChar == '+' || prevChar == '-' || prevChar == '*' || prevChar == '/')) {
                t2 = false;
            }

            if (c == '(') {
                j1++;
            } else if (c == ')') {
                j2++;
            } else if (c == '=') {
                k++;
            }
            NumberCount.numbersInEquation(c, prevChar);
            prevChar = c;
        }
        if (!t1) {
            equationIsCorrect = false;
            System.out.println("-Invalid characters entered-");
        }
        if (!t2) {
            equationIsCorrect = false;
            System.out.println("-Double operators-");
        }
        if (!t3) {
            equationIsCorrect = false;
            System.out.println("-x was not entered-");
        }
        if (k != 1) {
            equationIsCorrect = false;
            System.out.println("-Equal sign entered incorrectly-");
        }
        if (j1 != j2) {
            equationIsCorrect = false;
            System.out.println("-Brackets are entered incorrectly-");
        }
        if (equationIsCorrect) {
            System.out.println("The equation is correct");
            FileSave.fileSave(equation);
        }
    }
}