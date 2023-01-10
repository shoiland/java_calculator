package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String operation = input.next();
        operation = operation.toLowerCase();
        switch (operation) {
            case "add":
                System.out.println("Enter two integers:");
                try {
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    int answer = num1 + num2;
                    System.out.println("Answer: " + answer);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "subtract":
                System.out.println("Enter two integers:");
                try {
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    int answer = num1 - num2;
                    System.out.println("Answer: " + answer);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "multiply":
                try {
                    System.out.println("Enter two doubles:");
                    double doubleOne = input.nextDouble();
                    double doubleTwo = input.nextDouble();
                    double doubleAnswer = doubleOne * doubleTwo;
                    System.out.printf("Answer: %.2f\n", doubleAnswer);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "divide":
                try {
                    System.out.println("Enter two doubles:");
                    double doubleOne = input.nextDouble();
                    double doubleTwo = input.nextDouble();
                    if (doubleTwo == 0) {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                    double doubleAnswer = doubleOne / doubleTwo;
                    System.out.printf("Answer: %.2f\n", doubleAnswer);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            case "alphabetize":
                try {
                    System.out.println("Enter two words:");
                    String wordOne = input.next();
                    String wordTwo = input.next();
                    int compareOutput = wordOne.toLowerCase().compareTo(wordTwo.toLowerCase());
                    if (compareOutput == 0) {
                        System.out.println("Answer: Chicken or Egg.");
                        break;
                    } else if (compareOutput > 0) {
                        System.out.println("Answer: " + wordTwo + " comes before " + wordOne + " alphabetically.");
                        break;
                    } else {
                        System.out.println("Answer: " + wordOne + " comes before " + wordTwo + " alphabetically.");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            default:
                System.out.println("Invalid input entered. Terminating...");
        }
    }
}
