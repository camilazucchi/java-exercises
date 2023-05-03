package Exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        // 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        double somaDosNumeros = numero1 + numero2;
        somaDosNumeros = Math.round(somaDosNumeros * 100) / 100.0;
        System.out.println("A soma dos dois números é: " + somaDosNumeros + ".");
    }
}