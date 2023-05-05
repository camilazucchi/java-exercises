package Exercises;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        // 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double secondNumber = scanner.nextDouble();
        double sumOfNumbers = firstNumber + secondNumber;
        sumOfNumbers = Math.round(sumOfNumbers * 100) / 100.0;
        System.out.println("A soma dos dois números é: " + sumOfNumbers + ".");
    }
}
