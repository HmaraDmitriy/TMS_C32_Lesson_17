package com.teachmeskills.lesson_17.task_1.util;

import com.teachmeskills.lesson_17.task_1.interfaceFunction.GenericFunction;

import java.util.Scanner;

public class ReverseAndFactorial {
    public static void executeTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to reverse the string, 2 to find the factorial: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter a string to reverse: ");
            String input = scanner.nextLine();

            GenericFunction<String> reverseString = str -> new StringBuilder(str).reverse().toString();

            System.out.println("Result: " + reverseString.apply(input));

        } else if (choice == 2) {
            System.out.println("Enter a number to find the factorial: ");
            int number = scanner.nextInt();

            GenericFunction<Integer> factorial = n -> {
                if (n == 0 || n == 1) return 1;
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
                return result;
            };

            System.out.println("Result: " + factorial.apply(number));

        } else {
            System.out.println("Error: Only numbers 1 or 2 are allowed.");
        }
    }
}
