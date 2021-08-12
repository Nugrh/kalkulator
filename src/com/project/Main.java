package com.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------<CALCULATOR>------");

        int num1, num2, result;
        char op;


        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Choose 1 operator(+ - * / %): ");
        op = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
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
            System.err.println("Your input is not correct!");
        }



    }
}
