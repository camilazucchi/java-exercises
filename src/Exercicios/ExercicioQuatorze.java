package Exercicios;

import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        // 14. Escreva um algoritmo que leia dois valores distintos e informe qual é o maior.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro valor.");
        double primeiroValor = scanner.nextDouble();

        System.out.println("Por favor, digite o segundo valor.");
        double segundoValor = scanner.nextDouble();

        if(primeiroValor > segundoValor) {
            System.out.println("O primeiro valor é maior!");
        } else if (segundoValor > primeiroValor) {
            System.out.println("O segundo valor é maior!");
        }

        scanner.close();
    }
}
