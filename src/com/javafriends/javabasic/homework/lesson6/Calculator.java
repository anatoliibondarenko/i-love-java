package com.javafriends.javabasic.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Input first operand:");
            double firstOperand = Double.parseDouble(reader.readLine());

            System.out.println("Input action (+-*/%):");
            String action = reader.readLine();

            System.out.println("Input second operand:");
            double secondOperand = Double.parseDouble(reader.readLine());

            double result = calculate(firstOperand, action, secondOperand);
            System.out.println(firstOperand + " " + action + " " + secondOperand + " = " + result + ".");

        } catch (NumberFormatException e) {
            System.out.println("Impossible value");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double calculate(double firstOperand, String action, double secondOperand) {
        double result;
        switch (action) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                } else {
                    result = firstOperand / secondOperand;
                    break;
                }
            case "%":
                result = firstOperand % secondOperand;
                break;
            default:
                throw new IllegalArgumentException("Unknown action.");
        }
        return result;
    }
}
