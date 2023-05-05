package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        // 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
        // dos dois números lidos.
        DecimalFormat df = new DecimalFormat("#.##");

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite o primeiro número.");
        double firstNumber = scanner.nextDouble();
        System.out.println("Digite o segundo número.");
        double secondNumber = scanner.nextDouble();

        double sumOfNumbers = firstNumber + secondNumber;
        double subtractionOfNumbers = firstNumber - secondNumber;
        double multiplicationOfNumbers = firstNumber * secondNumber;
        double divisionOfNumbers = firstNumber / secondNumber;

        System.out.println("A soma é: " + df.format(sumOfNumbers) + ".");
        System.out.println("A subtração é: " + df.format(subtractionOfNumbers) + ".");
        System.out.println("A multiplicação é: " + df.format(multiplicationOfNumbers) + ".");
        System.out.println("A divisão é: " + df.format(divisionOfNumbers) + ".");
        }
    }
}
