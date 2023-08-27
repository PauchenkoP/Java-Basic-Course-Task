package main;

import java.io.IOException;
import java.util.Scanner;

import static main.NumberCount.p;
import static main.Test.equationIsCorrect;
import static main.NumberCount.firstSymbol;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Test.test();
            if (equationIsCorrect && p == 1) {
                System.out.println("---------------------- \nIn the equation " + p + " number");
            } else if (equationIsCorrect) {
                System.out.println("---------------------- \nIn the equation " + p + " numbers");
            }
            System.out.println("Continue? \n1-Yes \n0-No");
            int exit = scanner.nextInt();
            p = 0;
            firstSymbol = true;
            if (exit == 0) {
                break;
            }
        }
    }
}