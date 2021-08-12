package com.project;

import java.util.Scanner; // import input buat user

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------<CALCULATOR>------");

        int num1, num2, result; // deklarasiin variabel input
        char op; // variabel operator


        System.out.print("Input number (x + y): ");
        num1 = sc.nextInt();
        op = sc.next().charAt(0);   // input dari user
        num2 = sc.nextInt();

        System.out.println("\n---Result---");
        if (op == '+'){ // pertambahan
            result = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, result);

        } else if (op == '-'){ // perkurangan
            result = num1 - num2;
            System.out.printf("%d - %d = %d\n", num1, num2, result);

        } else if (op == '*'){ // perkalian
            result = num1 * num2;
            System.out.printf("%d * %d = %d\n", num1, num2, result);

        } else if (op == '/'){ // pengulangan
            result = num1 / num2;
            System.out.printf("%d / %d = %d\n", num1, num2, result);
        } else if (op == '%') { // modulo
            result = num1 / num2;
            System.out.printf("%d %% %d = %d\n", num1, num2, result);
        } else {
            System.err.println("Your input is incorrect!");
        }
    }
}
